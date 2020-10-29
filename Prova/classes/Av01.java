package Prova.classes;

import java.util.Scanner;
public class Av01{

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = 10;
        int v[];
        v = new int[10];
        int num;
        int numImpar = 0;
        int numPar= 0;
        int x = 0;
        int menor =0;
        int maior =0;
        int igual =0;

        for(num = 0; num < q; num++){
            System.out.println("Digite os valores: "+ (num+1));
            v[num] = scan.nextInt();
                
            if(v[num]%2==0){
                numPar++;      
            }else{
                numImpar++;
                }            
        }
        x = scan.nextInt();
        for(num = 0; num < q; num++){
            
        if(v[num] > x){
            maior++;

        }else if(v[num] < x){
            menor++;
        }else{
            igual++;
        }

        }

     System.out.println("Numeros Digitados: "+(num));
     System.out.println("Numeros impares: "+(numImpar));
     System.out.println("Numeros pares: "+(numPar));
     System.out.println("Numeros Maiores que Impar: "+(maior));
     System.out.println("Numeros Maiores que Impar: "+(menor));
     System.out.println("Numeros Maiores que Impar: "+(igual));


    }

}
