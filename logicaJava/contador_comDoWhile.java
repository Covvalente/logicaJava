package logicaJava;

import java.util.Scanner;

public class contador_comDoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int cont, n, r;
		cont = 1;
		System.out.print("quer ver a tabuada de qual numero");
		n = sc.nextInt();

		do {
			r = n * cont;
			System.out.println(n + "x" + cont + "=" + r);
			cont++;

		} while (cont > 10);

	}

}
