package logicaJava;

import java.util.Scanner;

public class leia_doisNumerosESoma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int contador, n, s, maior, menor;
		contador = 1;
		s = 0;

		System.out.println(" digite o primeiro valor ");
		n = sc.nextInt();
		maior = n;
		menor = n;
		s += n;
		while (contador <= 5) {
			System.out.println(" digite o" + contador + "o.valor");
			n = sc.nextInt();

			if (n > maior) {
				maior = n;

			}
			if (n < menor) {
				menor = n;
			}
			s = s + n;
			contador++;

		}
		System.out.println(" A SOMA DE TODOS OS VALORES FOI " + s);
		System.out.println(" O MAIOR VALOR DIGITADO FOI" + maior);
		System.out.println(" O MENOR VALOR DIGITADO FOI " + menor);
		sc.close();
	}

}
