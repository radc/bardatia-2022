/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bardatia;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author ruhan
 */
public class BarDaTia {

    static ArrayList<Conta> listaContas;

    public static void escreveArquivo() {
        try {
            File file = new File("listacontas.obj");
            ObjectOutputStream objOutput = new ObjectOutputStream(new FileOutputStream(file));

            for (int i = 0; i < listaContas.size(); i++) {
                objOutput.writeObject(listaContas.get(i));
            }
            objOutput.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        //
    }

    public static void leArquivo() {
        try {
            File file = new File("listacontas.obj");
            ObjectInputStream objInput = new ObjectInputStream(new FileInputStream(file));

            Conta b;
            b = (Conta) objInput.readObject();
            
            while(b != null){
                listaContas.add(b);
                b = (Conta) objInput.readObject();
            }
            
            objInput.close();

        } catch (Exception e) {

        }

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        listaContas = new ArrayList();
        leArquivo();
        int opcao;
        do {
            System.out.println("Digite a opção desejada:");
            System.out.println("1 - Cadastrar Conta");
            System.out.println("2 - Listar Contas");
            System.out.println("3 - Aumentar divida de uma conta");
            System.out.print("Opcao: ");
            opcao = Integer.parseInt(sc.nextLine());
            if (opcao == 1) {
                System.out.println("Cadastrando conta... ");
                System.out.print("Digite o nome: ");
                String nome = sc.nextLine();

                System.out.print("Digite o telefone: ");
                String telefone = sc.nextLine();

                System.out.print("Digite o e-mail: ");
                String email = sc.nextLine();

                Conta c = new Conta(nome);
                c.setTelefone(telefone);
                c.setEmail(email);

                listaContas.add(c);
                escreveArquivo();
            }
            if (opcao == 2) {
                System.out.println("Listando contas... ");

                for (int i = 0; i < listaContas.size(); i++) {
                    System.out.println(listaContas.get(i));
                }

            }
            if (opcao == 3) {
                System.out.println("Aumentando dividas... ");

                System.out.print("Digite o id da conta: ");
                int id;
                id = Integer.parseInt(sc.nextLine());
                int i;
                for (i = 0; i < listaContas.size(); i++) {
                    Conta aux = listaContas.get(i);
                    if (id == aux.getId()) {
                        System.out.println(aux);
                        double aumento;
                        System.out.print("Bora aumentar a divida em quanto?");

                        aumento = Double.parseDouble(sc.nextLine());
                        try {
                            aux.aumentaDivida(aumento);
                        } catch (Exception a) {
                            System.out.println("Deu ruim kkkkk!");
                            System.out.println("Saca só: " + a.getMessage());

                        }
                        break;
                    }

                }
                escreveArquivo();
                if (i == listaContas.size()) {
                    System.out.println("Você não existe na Matrix");
                }
            }

        } while (true);

    }

}
