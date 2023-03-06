/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bardatia2022;

import java.util.ArrayList;
import java.util.Scanner;



/**
 *
 * @author ruhan
 */
public class BarDaTia2022 {

    static ArrayList<Conta> listaContas;
    
    public static void main(String[] args) {
        listaContas = new ArrayList();        
        int opcao;
        Scanner sc = new Scanner(System.in);
        
        do{
            System.out.println("1 - Cadastrar Conta");
            System.out.println("2 - Listar Contas");
            System.out.println("3 - Alterar Conta");
            System.out.println("4 - Excluir Conta");
            System.out.println("0 - Sair");                        
            System.out.print("Opção: ");
            opcao = Integer.parseInt(sc.nextLine());   
            
            if(opcao == 1){ // Cadastrar Conta
                System.out.print("Digite o nome da conta: ");
                String nome = sc.nextLine();
                
                System.out.print("Digite telefone: ");
                String telefone = sc.nextLine();
                
                System.out.print("Digite e-mail: ");
                String email = sc.nextLine();
                
                System.out.println("Servidor? (sim/não)");
                boolean servidor = sc.nextLine()
                        .toLowerCase()
                        .contains("s");
                
                Conta c = new Conta(nome,telefone,email,servidor);
                listaContas.add(c);
                //System.out.println(listaContas.size());
            }
            if(opcao == 2){ // Listar Contas
                for(int i = 0; i < listaContas.size(); i++){
                    Conta c = listaContas.get(i);
                    System.out.println(c);
                }
            }
            if(opcao == 4){ // Excluir Conta
                System.out.print("Digite o ID da Conta para Excluir: ");
                int id = Integer.parseInt(sc.nextLine()); 
                Conta c = null;
                for(int i = 0; i < listaContas.size(); i++){
                    c = listaContas.get(i);
                    if(c.getId() == id){
                        listaContas.remove(c);
                        break;
                    }          
                }
            }
            
        }while(opcao != 0);     
    }    
}
