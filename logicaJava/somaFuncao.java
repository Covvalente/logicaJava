package logicaJava;

import java.util.Scanner;

public class somaFuncao {

	public static int soma(int x, int y) {
		return x + y;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int v1, v2, s;
		System.out.print(" Digite o primeiro valor :");
		v1 = sc.nextInt();
		System.out.print(" digite o segundo :");
		v2 = sc.nextInt();
		s = soma(v1, v2);

		System.out.print(" a soma entre " + v1 + " e" + v2 + " é igual a: " + s);
	}

}
