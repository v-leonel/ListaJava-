package ListaJava;

import java.util.Scanner;

public class ex14 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double soma = 0;
		
		for(int i=1; i<=10; i++) {
			System.out.print("Informe o " + i + "� n�mero: ");
			double num = sc.nextDouble();
			
			soma += num;
		}
		
		System.out.printf("Soma dos n�meros informados: %.2f", soma);
		sc.close();
	}

}