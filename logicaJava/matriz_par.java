package logicaJava;

import java.util.Scanner;

public class matriz_par {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[][] valores = new int[3][3];

		int l, c, totPar;

		for (l = 0; l < 3; l++) {
			for (c = 0; c < 3; c++) {
				System.out.print("Digite o valor da posicao [" + l + "," + c + "]:");
				valores[l][c] = sc.nextInt();
			}
		}
		System.out.println();
		System.out.println("MATRIZ:");
		System.out.println("------------");
		totPar = 0;
		for (l = 0; l < 3; l++) {
			for (c = 0; c < 3; c++) {
				if (valores[l][c] % 2 == 0) {
					System.out.printf("{%d}" , valores[l][c] );
					totPar++;
				} else {
					System.out.printf("%d",valores[l][c]);
				}
			}
			System.out.println();
		}
		System.out.println(" AO todo foram digitados " + totPar + " valores pares " );
	}

}
