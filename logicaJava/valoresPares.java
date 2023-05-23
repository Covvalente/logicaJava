package logicaJava;

import java.util.Scanner;

public class valoresPares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int contPares=0;
		int v;
		System.out.print(" Digite um valor :");
		v = sc.nextInt();
		if (v % 2 == 1) {
			v = v - 1;

		}
		for (int i= v; i >=0; i--) {
			System.out.println(i);
			if (i % 2 == 0) {
				contPares++;
			}
		}
		System.out.println(" A quantidade de números pares na contagem foi de :" + contPares);
	}
}
