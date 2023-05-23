package logicaJava;

import java.util.Scanner;

public class ler_matriz {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
		int matriz[][] = new int[3][2];
		int l, c;
		for (l = 0; l < 3; l++) {
			for (c = 0; c < 2; c++) {
				System.out.println("digite o valor da posição [" + l + "," + c + "]:");
				matriz[l][c] = sc.nextInt();
			}
		}
		for (l = 0; l < 3; l++) {
			for (c = 0; c < 2; c++) {
				System.out.print(matriz[l][c]+ " " );
			}
			System.out.println();
		}

	}

}
