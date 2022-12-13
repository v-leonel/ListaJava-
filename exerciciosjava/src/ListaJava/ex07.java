package ListaJava;

import java.util.Scanner;

public class ex07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double n1 = 8;
		double n2 = 9;
		double n3 = 7;
		double n4 = 4;
		double n5 = 5;
		double n6 = 6;
		
		double media1 = (n1 + n2 + n3) / 3;
		double media2 = (n4 + n5 + n6) / 3;
		
		double somaMedias = media1 + media2;
		
		System.out.println("A média é: " + somaMedias);
		
		sc.close();

	}

}