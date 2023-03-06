/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bardatia2022;

import java.time.LocalDate;

/**
 *
 * @author ruhan
 */
public class Conta {
    private int id;
    private String nome;
    private String telefone;
    private String email;
    private double saldoDevedor;
    private boolean servidor;
    private LocalDate dataCriacaoConta;

    private static int numContas = 0;
    private static double servidorMaxDivida = 50;
    private static double alunoMaxDivida = 20;
    
    @Override
    public String toString() {
        
        return "Conta{" + "id=" + id + ", nome=" + nome + ", telefone=" + telefone + ", email=" + email + ", saldoDevedor=" + saldoDevedor + ", servidor=" + servidor + ", dataCriacaoConta=" + dataCriacaoConta + '}';
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Conta other = (Conta) obj;
        return this.id == other.id;
    }

    
    
    public Conta(String nome, String telefone, String email, 
            boolean servidor){
        numContas++;
        this.id = numContas;
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.servidor = servidor;
        saldoDevedor = 2;
        dataCriacaoConta = LocalDate.now();
    }
    
    public Conta(){
        numContas++;
        this.id = numContas;
        saldoDevedor = 2;
        dataCriacaoConta = LocalDate.now();
    }

   public void incrementaSaldoDevedor(){
       saldoDevedor = saldoDevedor + 1;
   }
   
   public void incSaldoDevedorValor(double valor){
       
       if(valor + this.saldoDevedor <= alunoMaxDivida){
            saldoDevedor = saldoDevedor + valor;
       }else{
           System.out.println("Não pode dever mais que: " + alunoMaxDivida);
       }
   }
   public void decSaldoDevedorValor(double valor){
       
       if( saldoDevedor >= valor ){
            saldoDevedor = saldoDevedor - valor;
       }else{
           System.out.println("Não pode dever menos que ZERO");
       }
   }
   
   public void decrementaSaldoDevedor(){
       saldoDevedor = saldoDevedor - 1;
   }
   
   public void setSaldoDevedor(double valor){
       saldoDevedor = valor;
   }
   
   public double getSaldoDevedor(){
       return saldoDevedor;
   }
    
   public int getId(){
       return id;
   }
   
   public void setId(int id){
       this.id = id;
   }
   
}
