package logicaJava;

import java.util.Scanner;

public class somador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n1, n2, s;
		char resp;
		s = 0;

		do {
			System.out.println(" digite um valor :");
			n1 = sc.nextInt();
			System.out.println(" digite outro valor :");
			n2 = sc.nextInt();
			s = n1 + n2;
			System.out.print(" quer continuar ? (S/N)");
			resp = sc.next().charAt(0);

		} while (resp == 's');
		System.out.println(" a soma dos valores é " + s);
	}

}
