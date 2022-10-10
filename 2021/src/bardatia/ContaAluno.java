/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bardatia;

/**
 *
 * @author ruhan
 */
public class ContaAluno extends Conta{
    
   public ContaAluno(){
       super("Nome Qualquer");       
       //System.out.println(">Const. CA S/ Param");
       
   }
   
   public ContaAluno(String nome){
       super(nome);
       //System.out.println(">Const. CA C/ Nome");
       
   }
   
   @Override
   public String toString(){
       return super.toString() + ":aluno" ;
   }
    
}
