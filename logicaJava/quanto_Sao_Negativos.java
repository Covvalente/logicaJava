package logicaJava;

import java.util.Scanner;

public class quanto_Sao_Negativos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n, c, totN;
		c = 1;
		totN = 0;
		
		do {
			System.out.println(" Digite um numero");
			n = sc.nextInt();
			if (n < 0) {
				totN = totN + 1;
			}
			c = c + 1;

		} while (c <=5);
		System.out.println(" foram digitados " + totN + " valores negativos");
		sc.close();
	}
}
