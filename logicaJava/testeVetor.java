package logicaJava;

import java.util.Scanner;

public class testeVetor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int vetor[] = new int[6];
		int c;
		for (c = 0; c < 6; c++) {
			System.out.println(" digite o " + c + "º.valor");
			vetor[c] = sc.nextInt();
		}

		for (c = 0; c < 6; c++) {
			System.out.print("{" + vetor[c] + "}");
		}
	}

}
