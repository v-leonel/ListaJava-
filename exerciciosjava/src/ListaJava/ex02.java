package ListaJava;

import java.util.Scanner;

public class ex02 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = 0;


        System.out.println("Entre com um numero: ");
        num = sc.nextInt();



        if(num % 10 == 0 && num % 5 == 0 && num % 2 ==0){
            System.out.println("O numero e divisivel por 10,5 e 2");
        }else if(num % 2 == 0){
            System.out.println("O numero e divisivel apenas por 2");
        }else if(num % 5 == 0){
            System.out.println("O numero e divisivel apenas por 5");
        }else{
            System.out.println("O numero não e divisivel por 10, 5 e por 2.");
        }



    }
    }
