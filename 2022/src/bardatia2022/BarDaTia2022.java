/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bardatia2022;

/**
 *
 * @author ruhan
 */
public class BarDaTia2022 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Conta maria;       
        Conta joao;
        
        maria = new Conta();
        joao = new Conta();
        
        maria.id = 1;
        maria.nome = "Maria";
        maria.email = "donamaria@bol.com.br";
        maria.telefone = "53981900970";
        maria.servidor = true;
        maria.saldoDevedor = 0.0;
        
        joao.nome = "Joao";
        joao.nome = "Pedro";
        joao.nome = "Mateus";
        
        System.out.println(joao);
        System.out.println(maria);
    }
    
}
