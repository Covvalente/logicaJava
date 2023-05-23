package logicaJava;

import java.util.Scanner;

public class superContador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int op, cont;

		do {
			System.out.println("");
			System.out.println("================");
			System.out.println(" | MENU  | ");
			System.out.println("================");
			System.out.println("| [1] de 1 a 10|");
			System.out.println("| [2] de 10 a 1|");
			System.out.println("| [3] sair     |");
			System.out.println("================");
			System.out.println("Escolha sua opção");
			op = sc.nextInt();

			switch (op) {
			case 1:
				cont = 1;
				do {
					System.out.print(cont + "..");
					cont++;

				} while (cont <= 10);
				break;
			case 2:
				cont = 10;
				do {
					System.out.print(cont + "..");
					cont--;
				} while (cont >= 1);
				break;
			case 3:
				System.out.print("Saindo");
				break;
			default:
				System.out.println(" inválido ");
				break;

			}
		} while (op != 3);
	}
}
