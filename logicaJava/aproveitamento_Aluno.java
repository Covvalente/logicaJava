package logicaJava;

import java.util.Scanner;

public class aproveitamento_Aluno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		double n1, n2, media;

		System.out.print(" Qual a primeira nota ?");
		n1 = sc.nextInt();

		System.out.println(" qual a segunda nota ?");
		n2 = sc.nextInt();

		media = (n1 + n2) / 2;

		if (media >= 9 && media <= 10) {
			System.out.println(" seu aproveitamento foi de A");
		} else if (media >= 8 && media <= 7) {
			System.out.println(" seu aproveitamento foi de B");
		} else if (media >= 7 && media <= 6) {
			System.out.println(" seu aproveitamento foi de C");
		} else if (media >= 6 && media <= 7) {
			System.out.println(" seu aproveitamento foi de D");
		} else if (media >= 5 && media <= 6) {
			System.out.println(" seu aproveitamento foi de E");
		} else {
			System.out.println(" seu aproveitamento foi de F");
		}
	}
}
