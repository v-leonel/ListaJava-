package ListaJava;

import java.util.Scanner;

public class ex19 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe o valor em dólar $: ");
		double dolar = sc.nextDouble();
		
		System.out.print("Qual a cotação do dólar em R$? ");
		double cotacao = sc.nextDouble();
		
		double conversao = dolar * cotacao;
		
		System.out.printf("\nValor convertido em R$: %.2f", conversao);
		
		sc.close();

	}

}