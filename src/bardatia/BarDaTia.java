/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bardatia;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author ruhan
 */
public class BarDaTia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Conta c = new Conta("Ruhan");
        c.setEmail("ruhan@gmail.com");
        c.setTelefone("53991733993");
        c.setSaldoDevedor(18);
        
        Conta d = new Conta("Rafaela");
        d.setEmail("rafaela@gmail.com");
        d.setTelefone("53984522848");
        d.setSaldoDevedor(5);
       
        Conta e = new Conta("Matheus");
        e.setEmail("Matheus@gmail.com");
        e.setTelefone("53984583419");
        e.setSaldoDevedor(12);
        
        Conta f = new Conta("Zandre");
        f.setEmail("Andre@gmail.com");
        f.setTelefone("53999999999");
        f.setSaldoDevedor(11);
        
        ArrayList<Conta> lista = new ArrayList();
        lista.add(c);
        lista.add(d);
        lista.add(e);
        lista.add(f);
                
        
        System.out.println("Antes");
        System.out.println(lista.get(0));
        System.out.println(lista.get(1));
        System.out.println(lista.get(2));
        System.out.println(lista.get(3));
        
        
        Collections.sort(lista);
        System.out.println("Depois");
        System.out.println(lista.get(0));
        System.out.println(lista.get(1));
        System.out.println(lista.get(2));
        System.out.println(lista.get(3));
        
    }

}
