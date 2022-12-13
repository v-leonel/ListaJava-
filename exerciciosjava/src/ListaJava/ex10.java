package ListaJava;

import java.util.Scanner;

public class ex10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe um valor: ");
		double saldo = sc.nextDouble();
		
		saldo *= 1.5;
		
		System.out.printf("Saldo com reajuste: %.2f", saldo);
		
		sc.close();

	}

}