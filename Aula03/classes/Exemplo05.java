package Aula03.classes;
import Aula03.classes.*;

public class Exemplo05{

public static void main (String[] args ){

    Endereco e1 =  new Endereco("Av. Buriti","Distrito Industrial","584-B");
    System.out.println(e1);

    Pessoa p1 = new Pessoa("Clemilton","111111",e1);
    System.out.println(p1);

    Funcionario f1 = new Funcionario ("Jamlly","2222222", e1,3000);
    System.out.println(f1);
   
    }

}