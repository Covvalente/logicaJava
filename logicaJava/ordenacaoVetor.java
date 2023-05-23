package logicaJava;

import java.util.Scanner;

public class ordenacaoVetor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int vet[] = new int[10];
		int i, j, aux;

		for (i = 0; i < 10; i++) {
			System.out.print("Digite um valor");
			vet[i] = sc.nextInt();

		}
		for (i = 0; i < 9; i++) {
			for (j = i + 1; j < 10; j++) {
				if (vet[i] > vet[j]) {
					aux = vet[i];
					vet[i] = vet[j];
					vet[j] = aux;
				}
			}
		}
		for (i = 0; i < 10; i++) {
			System.out.print("{" + vet[i] + "}");
		}
	}

}
