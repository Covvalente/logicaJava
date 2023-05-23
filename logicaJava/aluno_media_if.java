package logicaJava;

import java.util.Scanner;

public class aluno_media_if {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		double n1, n2, m;

		System.out.println(" Primeira nota :");
		n1 = sc.nextDouble();
		System.out.println(" Segunda nota :");
		n2 = sc.nextDouble();

		m = (n1 + n2) / 2;
		System.out.printf(" a media do aluno foi %.2f", m);

		if (m > 7) {
			System.out.println(" Aluno aprovado");
		} else if (m >= 5 && m < 7) {
			System.out.println(" aluno em recuperação");
		} else {
			System.out.println(" aluno reprovado");
		}
	}

}
