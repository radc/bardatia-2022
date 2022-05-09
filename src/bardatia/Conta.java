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
public class Conta implements Comparable {

    private String nome;
    private String telefone;
    private int id;
    private double saldoDevedor;
    private String email;

    private static int totalContas = 0;
    private static double maxSaldoDevedor = 20;

    public int compareTo(Object obj){
        Conta outraConta = (Conta) obj;
        
        //return this.nome.compareTo(outraConta.getNome()); //ORDEM ALFABÉTICA
        //return (-1)*this.nome.compareTo(outraConta.getNome()); //ORDEM ALFABÉTICA INVERSA
        
        if(this.getId() > outraConta.getId()){ //ORDEM PELO ID
            return 1;
        }else{
            return -1;
        }

        
        
        
    }
    
    public Conta(String nome) {
        //System.out.println(">Const. Conta");
        this.setNomePadrao();

        this.id = totalContas + 1; //ALTERAR
        this.setNome(nome); // qual a diferenca?        
        saldoDevedor = 2.0;
        totalContas++;
    }
    
    
    
    

    public void aumentaDivida(double valor) {
        if (valor < 0) { //Testa se valor negativo
            System.out.println("ERRO : valor negativo");
        } else {

            if (valor + saldoDevedor > maxSaldoDevedor) {
                System.out.println("ERRO : valor maior que o limite!");

            } else {
                saldoDevedor = saldoDevedor + valor;
            }

        }
    }

    public void diminuiDivida(double valor) {
        if (valor < 0) {
            System.out.println("ERRO : valor negativo");
        } else {
            saldoDevedor = saldoDevedor - valor;
            if (saldoDevedor < 0) {
                saldoDevedor = 0;
                System.out.println("ERRO: saldo ficou negativo então foi zerado");
            }
        }
    }

    public void zerarDivida() {
        saldoDevedor = 0.0;
    }

    public double getSaldoDevedor() {
        return saldoDevedor;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        if (nome.contains("0") || nome.contains("1")) {
            System.out.println("Erro: Nome Inválido");
            return;
        }

        this.nome = nome;
    }

    private void setNomePadrao() {
        this.nome = "Cliente";
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        if (email.contains("@")) {
            this.email = email;
        } else {
            System.out.println("ERRO: Email Inválido");
        }
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        if (telefone.contains("A") || telefone.contains("B")) {
            System.out.println("ERRO: Telefone Invalido");
            return;
        }
        this.telefone = telefone;
    }

    public void setSaldoDevedor(double saldoDevedor) {
        if (saldoDevedor < 0) {
            System.out.println("ERRO: Saldo Devedor Negativo!");
            return;
        }
        if (saldoDevedor > maxSaldoDevedor) {
            System.out.println("ERRO: Saldo Devedor Maior que o Limite!");
            return;
        }

        this.saldoDevedor = saldoDevedor;
    }

    public int getId() {
        return id;
    }

    public static void setTotalContas(int valor) {
                
    }

    public void teste1() {
        System.out.println(totalContas);
    }

    public void teste2() {
        System.out.println(nome);
    }

    public static void teste3() {
        System.out.println(totalContas);
    }

    @Override
    public String toString(){
        
            return this.id + ":" + this.nome + ":R$" + this.saldoDevedor + 
                ":" + this.email;
        
        
        
    }

    
    

}
