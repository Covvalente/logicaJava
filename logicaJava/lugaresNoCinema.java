package logicaJava;

import java.util.Scanner;

public class lugaresNoCinema {

	static char[] b = new char[19];

	public static void mostraFileira() {
	
		for (int i = 1; i <= 10; i++) {
			if (b[i] == ' ') {
				System.out.print("B" + i + "]");

			} else {
				System.out.print("[---]");
			}
		}
		System.out.println();
		System.out.println("----------------------------------------------");

	}

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in)) {
			int cad;
			String r;
			do {
				mostraFileira();
				System.out.println(" reservar a cadeira :B");
				cad = sc.nextInt();
				if (b[cad] == ' ') {
					System.out.println(" cadeira B" + cad + "RESERVADA!");
					b[cad] = 'X';

				} else {
					System.out.println("ERRO :Lugar ocupado!");
				}
				System.out.print("Quer reservar outro[s/n]");
				r = sc.next();

			} while (!r.equals("n"));
		}
	}

}
