package ListaJava;

import java.util.Scanner;

public class ex16 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int soma = 0;
		int media = 0;
		
		for(int i=1; i<=20; i++) {
			System.out.print("Informe o " + i + "� n�mero: ");
			int idade = sc.nextInt();
			
			soma += idade;
		}
		
		media = soma / 20;
		
		System.out.println("\nM�dia das idades informados: " + media);
		
		sc.close();
	}

}