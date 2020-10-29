package Aula02.classes;

public class Conta {
    private String nome;
    private String cpf;
    private double saldo;
    private int limitiCartao;
    public static final int MAX_SAQUE=1000;

    public void saca(double valor){
    
     if (this.saldo < valor){ 
        System.out.println("Não foi possivel sacar");
        return;
    }  this.saldo = this.saldo - valor; 

}  public void depoisitar(double valor){
   
    this.saldo = this.saldo + valor;

}

   

}

    





    
