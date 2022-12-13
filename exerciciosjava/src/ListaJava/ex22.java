package ListaJava;

import java.util.Scanner;

public class ex22 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int qtdNum = 0;
		
		for(int i=1; i<=20; i++) {
			System.out.print("Informe o " + i + "º número: ");
			int num = sc.nextInt();
			
			if(num > 0 && num < 100) {
				qtdNum += 1;
			}
		}
		
		System.out.println("\nSão " + qtdNum + " números digitados que estão entre 0 e 100!");
		
		sc.close();
	}

}