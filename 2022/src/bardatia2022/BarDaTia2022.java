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
                
                
            }
            if(opcao == 2){ // Listar Contas
                
            }
            
        }while(opcao != 0);     
    }    
}
