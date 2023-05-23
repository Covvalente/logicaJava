package logicaJava;

import java.util.Scanner;

public class par_ou_imparProcedimento {

	public static void parOuImpar(int v) {
		if (v % 2 == 0) {
			System.out.println(" o numero " + v + " é par");
		} else {
			System.out.println(" o numero" + v + " é impar");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println(" digite um número ");
		n = sc.nextInt();
		parOuImpar(n);
	}

}
