package ListaJava;

import java.util.Scanner;

public class ex24 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num = 0;
		int soma = 0;

		while (num >= 0) {
			System.out.print("Digite um número inteiro: ");
			num = sc.nextInt();
			if(num > 0) {
				soma += num;
			}
			
		}
		
		System.out.println("\nSoma:" + soma);

		sc.close();
	}

}