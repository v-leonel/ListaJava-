package ListaJava;

import java.util.Scanner;

public class ex09 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe seu sal�rio: ");
		double salario = sc.nextDouble();
		
		double qtdSalario = salario / 1212;
		
		System.out.printf("A quantidade de sal�rios m�nimos � de: %.2f", qtdSalario);
		sc.close();

	}

}