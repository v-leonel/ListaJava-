package ListaJava;

import java.util.Scanner;

public class ex05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe sua idade: ");
		int idade = sc.nextInt();
		
		if(idade >= 18 && idade <= 65) {
			System.out.println("Voto Obrigat�rio!");
		}else if(idade >= 16 || idade > 65) {
			System.out.println("Pode Votar!");
		}else {
			System.out.println("N�o pode votar!");
		}
		
		sc.close();

	}

}