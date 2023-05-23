package logicaJava;

import java.util.Scanner;

public class numerosPrimos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int c, n, contDiv;
		c = 1;
		contDiv = 0;
		System.out.print("Digite um numero:");
		n = sc.nextInt();

		while (c<=n) {
			if (n%c==0) {
				contDiv++;
			}
			c=c+1;
		}
		if (contDiv > 2) {
			System.out.println(" o valor " + n + " não é primo ");

		} else {
			System.out.println(" O valor " + n + " e primo! ");

		}
		sc.close();
	}

}
