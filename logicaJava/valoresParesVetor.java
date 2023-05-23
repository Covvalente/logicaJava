package logicaJava;

import java.util.Scanner;

public class valoresParesVetor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int vetor[] = new int[7];
		int i, totPar;

		totPar = 0;
		for (i = 0; i < 7; i++) {
			System.out.print("Digite o" + i + " o.valor:");
			vetor[i] = sc.nextInt();

		}
		for (i = 0; i < 7; i++) {
			if (vetor[i] % 2 == 0) {
				totPar++;
				System.out.println(" valor par na posicao " + i);
				
			}
		}
		System.out.println(" o total de pares foi " + totPar);
	}

}
