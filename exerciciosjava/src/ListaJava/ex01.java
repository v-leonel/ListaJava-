package ListaJava;

import java.util.Scanner;

public class ex01 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        double calorias = 0;
        System.out.println("Selecione um prato: 1- Vegetariano, 2– Peixe, 3– Frango, 4- Carne");
        int prato = scan.nextInt();

        switch (prato) {
            case 1:
                calorias += 180;
                break;
            case 2:
                calorias += 230;
                break;
            case 3:
                calorias += 250;
                break;
            case 4:
                calorias += 350;
                break;
        }
        System.out.println("Selecione uma sobremesa: 1– Abacaxi, 2– Sorvete diet, 3– Mouse diet, 4– Mouse chocolate");
        int sobremesa = scan.nextInt();

        switch (sobremesa){
            case 1:
                calorias += 75;
                break;
            case 2:
                calorias += 110;
                break;
            case 3:
                calorias += 170;
                break;
            case 4:
                calorias += 200;
                break;
        }
        System.out.println("Selecione uma bebida: 1– Chá, 2– Suco de laranja, 3– Suco de melão, 4– Refrigerante diet");
        int bebida = scan.nextInt();

        switch (sobremesa){
            case 1:
                calorias += 20;
                break;
            case 2:
                calorias += 70;
                break;
            case 3:
                calorias += 100;
                break;
            case 4:
                calorias += 65;
                break;
        }
        System.out.println("Total de calorias nessa refeiçã0: " + calorias);

    }
}