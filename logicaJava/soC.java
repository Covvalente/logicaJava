package logicaJava;

import java.util.Scanner;

public class soC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		String soC[] = new String[10];
		int c, tot;

		String nome;

		tot = 0;
		for (c = 0; c < 10; c++) {
			System.out.println(" digite seu nome :");
			nome = sc.next();
			if (nome.toUpperCase().charAt(0) == 'C') {
				tot++;
				soC[tot] = nome;
			}
		}
		System.out.println(" LISTAGEM FINAL ");
		for (c = 1; c <= tot; c++) {
			System.out.println(soC[c]);
		}

	}
}
