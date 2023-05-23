package logicaJava;

import java.util.Scanner;

public class creuza04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double preco,imposto;
		System.out.print("qual o preco do produto? US$");
		preco=sc.nextDouble();
		imposto = (preco*60)/100;
		System.out.print("lembrando o imposto equivale a 60%");
		System.out.printf(" o valor a ser pago de imposto é US$ %.2f",imposto);
		sc.close();
	}
	
}
