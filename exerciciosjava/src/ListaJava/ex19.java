package ListaJava;

import java.util.Scanner;

public class ex19 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe o valor em d�lar $: ");
		double dolar = sc.nextDouble();
		
		System.out.print("Qual a cota��o do d�lar em R$? ");
		double cotacao = sc.nextDouble();
		
		double conversao = dolar * cotacao;
		
		System.out.printf("\nValor convertido em R$: %.2f", conversao);
		
		sc.close();

	}

}