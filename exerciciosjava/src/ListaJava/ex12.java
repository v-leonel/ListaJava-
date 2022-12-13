package ListaJava;

import java.util.Scanner;

public class ex12 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int soma = 0;
		
		for(int i=1; i<=15; i++) {
			soma += i;
		}
		
		System.out.println("Soma dos números: " + soma);
		
		sc.close();
	}

}