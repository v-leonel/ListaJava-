package ListaJava;

import java.util.Scanner;

public class ex03 {
    public static void main(String[]args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe seu saldo");
        double saldo = scan.nextDouble();

        System.out.printf("\nSaldo medio: %.2f", saldo);

        double saldoAtual = 0;
        double valorCredito = 0;

        if (saldo > 500 && saldo <= 1000){
            saldoAtual = saldo *1.30;
            valorCredito = saldoAtual - saldo;
            System.out.printf("\nSaldo com credito: %.2f", saldoAtual);
        }else if (saldo >= 1001 && saldo <= 3000){
            saldoAtual = saldo *1.40;
            valorCredito = saldoAtual - saldo;
            System.out.printf("\nSaldo com credito: %.2f", saldoAtual);
        }else if (saldo >=3001){
            saldoAtual = saldo *1.50;
            valorCredito = saldoAtual - saldo;
            System.out.printf("\nSaldo com credito: %.2f", saldoAtual);
        }else{
            System.out.printf("\nNenhum credito");
        }
    }
}