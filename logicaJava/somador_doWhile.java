package logicaJava;

import java.util.Scanner;

public class somador_doWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int n1, n2, s;
		char resp;
		s = 0;
		do {
			System.out.print(" digite o.valor =");
			n1 = sc.nextInt();

			System.out.print(" digite o2.valor =");
			n2 = sc.nextInt();
			s = n1 + n2;
			System.out.println(" voce quer continuar ? [S/N]");
			resp = sc.next().charAt(0);

		} while (resp == 's');
		System.out.println(" A soma de todos os valores digitados e " + s);

	}

}
