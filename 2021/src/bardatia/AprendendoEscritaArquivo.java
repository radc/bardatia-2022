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

/**
 *
 * @author ruhan
 */
public class AprendendoEscritaArquivo {

    public static void main(String args[]) {
        
        Conta c = new Conta("Rafaela");
        try {
            c.aumentaDivida(10.0);
        } catch (Exception e) {
            System.out.println("erro");
        }

        c.setEmail("rafaela@gmail.com");
        c.setTelefone("53991000078");
        System.out.println(c);

        try {
            File file = new File("conta.obj");
            ObjectOutputStream objOutput = new ObjectOutputStream(new FileOutputStream(file));
            objOutput.writeObject(c);
    
            objOutput.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

/*
        
        try{
            File file = new File("conta.obj");
            ObjectInputStream objInput = new ObjectInputStream(new FileInputStream(file));
            
            Conta k;
            k = (Conta) objInput.readObject();
            System.out.println(k);
            
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        
*/
    }

}
