package ListaJava;

import java.util.Scanner;

public class ex21 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe o valor da compra: R$ ");
		double valor = sc.nextDouble();
		
		System.out.println();
		for(int i=1; i<=5; i++) {
			double prestacao = valor / 5;
			System.out.printf(i + " prestação %.2f \n", prestacao);
		}
		
		sc.close();
	}

}