package logicaJava;

import java.util.Scanner;

public class media_aluno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double n1, n2, media;

		System.out.println(" Digite a primeira nota ");
		n1 = sc.nextDouble();
		System.out.println(" Digite a segunda nota");
		n2 = sc.nextDouble();
		media = (n1 + n2) / 2;
		if (media >= 7) {
			System.out.println("Aluno aprovado");
		} else {
			System.out.println("Aluno reprovado ");
		}
	}

}
