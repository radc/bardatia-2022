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
        Conta c1 = new Conta();
        System.out.println(c1);
        
        Conta c2 = new Conta("Ruhan","53991733993","ruhan@gmail.com",true);
        
        c2.incrementaSaldoDevedor();
        System.out.println(c2.getSaldoDevedor());
        c2.incrementaSaldoDevedor();
        c2.incrementaSaldoDevedor();
        c2.incrementaSaldoDevedor();
        System.out.println(c2.getSaldoDevedor());
    }
    
}
