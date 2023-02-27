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

    @Override
    public String toString() {
        return "Conta{" + "id=" + id + ", nome=" + nome + ", telefone=" + telefone + ", email=" + email + ", saldoDevedor=" + saldoDevedor + ", servidor=" + servidor + ", dataCriacaoConta=" + dataCriacaoConta + '}';
    }

    public Conta(String nome, String telefone, String email, 
            boolean servidor){
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.servidor = servidor;
        saldoDevedor = 2;
        dataCriacaoConta = LocalDate.now();
    }
    
    public Conta(){
        saldoDevedor = 2;
        dataCriacaoConta = LocalDate.now();
    }

   public void incrementaSaldoDevedor(){
       saldoDevedor = saldoDevedor + 1;
   }
   
   public void incSaldoDevedorValor(double valor){
       saldoDevedor = saldoDevedor + valor;
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
