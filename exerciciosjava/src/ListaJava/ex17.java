package ListaJava;

import java.util.Scanner;

public class ex17 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		int qtdMaior = 0;
		int qtdMenor = 0;
		
		for(int i=1; i<=20; i++) {
			System.out.print("Informe o " + i + "� n�mero: ");
			int idade = sc.nextInt();
			
			if(idade >= 18) {
				qtdMaior += 1;
			}else {
				qtdMenor += 1;
			}
		}
		
		System.out.println("\nQuantidade de pessoas maior de idade: " + qtdMaior);
		System.out.println("Quantidade de pessoas menor de idade: " + qtdMenor);
		
		sc.close();

	}

}