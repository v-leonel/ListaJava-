package ListaJava;

import java.util.Scanner;

public class ex13 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe a temperatura em °C: ");
		double celsius = sc.nextInt();
		
		double fahrenheit = (9 * celsius + 160) / 5;
		
		System.out.println("Temperatura em Fahrenheit: " + fahrenheit);
		
		sc.close();

	}

}