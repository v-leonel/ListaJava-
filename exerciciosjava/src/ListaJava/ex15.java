package ListaJava;

import java.util.Scanner;

public class ex15 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int soma = 0;
		
		for(int i=1; i<=20; i++) {
			System.out.print("Informe o " + i + "º número: ");
			int idade = sc.nextInt();
			
			soma += idade;
		}
		
		System.out.println("\nSoma das idades informados: " + soma);
		
		sc.close();

	}

}
