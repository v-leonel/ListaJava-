package ListaJava;

import java.util.Scanner;

public class ex11 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe sue nome: ");
		String nome = sc.next();
		
		System.out.print("Informe seu sal�rio fixo: ");
		double salario = sc.nextDouble();
		
		System.out.print("Informe o total de vendas no m�s em $: ");
		double vendas = sc.nextDouble();
		
		double comissao = vendas * 0.15;
		
		double salarioFinal = salario + comissao;
		
		System.out.println("\nNome do vendedor: " + nome);
		System.out.printf("Sal�rio fixo:  %.2f" , salario);
		System.out.printf("\nSal�rio final: %.2f" , salarioFinal);
		
		sc.close();

	}

}