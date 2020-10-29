package Aula03.classes;

public class Funcionario extends Pessoa {

protected double salario;
public Funcionario(String nome, String cpf, Endereco endereco, double salario){

    super(nome,cpf,endereco);
    this.salario = salario;

}

    @Override
    public String toString() {

        String func = super.toString();
        func += "\nSalario: "+this.salario;
        return func;

        
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }





}