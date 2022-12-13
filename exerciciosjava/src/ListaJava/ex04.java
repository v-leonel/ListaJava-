package ListaJava;

import java.util.Scanner;

public class ex04 {

    public static void main(String[]args){

        Scanner scan = new Scanner (System.in);

        double a;
        double b;
        double c;

        System.out.println("Insira o valor de A");
        a = scan.nextDouble();

        System.out.println("Insira o valor de B");
        b = scan.nextDouble();

        System.out.println("Insira o valor de C");
        c = scan.nextDouble();

        if(b > a && b > c) {
			if(c > a) {
				System.out.println(b + " " + c + " " + a);
			}else {
				System.out.println(b + " " + a + " " + c);
			}
		}else if(c > a && c > b) {
			if(a > b) {
				System.out.println(c + " " + a + " " + b);
			}else {
				System.out.println(c + " " + b + " " + a);
			}
		}else {
			System.out.println(a + " " + b + " " + c);
		}
	}

}