package logicaJava;

import java.util.Scanner;

public class conversao_de_moedas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int c, q;
		double r, d, precoDollar;
		c = 1;
		System.out.print("quantas vezes voce quer converter");
		q = sc.nextInt();
		System.out.println(" Qual a cotação do dollar atual");
		precoDollar = sc.nextDouble();
		while (c <= q) {
			System.out.println();
			System.out.print(" qual o valor em R$ ");
			r = sc.nextDouble();
			d = r / precoDollar;
			System.out.printf("O valor convertido é US$ %.2f", d);
			c++;
			sc.close();
		}
	}

}
