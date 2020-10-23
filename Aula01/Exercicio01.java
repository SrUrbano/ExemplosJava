package Aula01;
import java.util.Scanner;

class Exercicio01{
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      int num1, num2;
      String op;
      System.out.println("Digite a operação:");
      System.out.println("+ = Somar");
      System.out.println("- = Subtrair");
      System.out.println("* = Multiplicar");
      System.out.println("/ = Dividir");
      System.out.println("5 = Resto");
      op = scan.nextLine();
      
      if(op.equals("+")){
        System.out.println("Digite o primeiro numero:");
        num1 = scan.nextInt();
        System.out.println("Digite o segundo numero:");
        num2 = scan.nextInt();
        System.out.println("A soma é: "+(num1+num2));
        
      }else if(op.equals("-")){
        System.out.println("Digite o primeiro numero:");
        num1 = scan.nextInt();
        System.out.println("Digite o segundo numero:");
        num2 = scan.nextInt();
        System.out.println("A subtração é: "+(num1-num2));

      }else if(op.equals("*")){
        System.out.println("Digite o primeiro numero:");
        num1 = scan.nextInt();
        System.out.println("Digite o segundo numero:");
        num2 = scan.nextInt();
        System.out.println("A multiplicao é: "+(num1*num2));

      } else if(op.equals("/")){
        System.out.println("Digite o primeiro numero:");
        num1 = scan.nextInt();
        System.out.println("Digite o segundo numero:");
        num2 = scan.nextInt();
        System.out.println("A divisão é: "+((float)num1/(float)num2));
        
      }else if(op.equals("%")){
        System.out.println("Digite o primeiro numero:");
        num1 = scan.nextInt();
        System.out.println("Digite o segundo numero:");
        num2 = scan.nextInt();
        System.out.println("O resto é: "+(num1%num2));
      }
    }
  }