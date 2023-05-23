package logicaJava;

import java.util.Scanner;

public class mostra_paraVetor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int val[] = new int[7];
		int i, totPar;
		totPar = 0;
		for (i = 1; i < 7; i++) {
			System.out.print("digite o " + i + "o.valor:");
			val[i] = sc.nextInt();
		}
		for (i = 1; i < 7; i++) {
			if (val[i] % 2 == 0) {
				totPar++;
				System.out.println(" valor par na posição " + i);

			}
		}
		System.out.println(" o total de pares foi " + totPar);
	}

}
