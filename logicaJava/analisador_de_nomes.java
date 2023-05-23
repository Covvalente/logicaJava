package logicaJava;

import java.util.Scanner;

public class analisador_de_nomes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String n;

		System.out.println(" Digite seu nome");
		n = sc.nextLine();

		System.out.println(" o total de letras do seu nome :" + n.length());
		System.out.println(" o seu nome em maiusculas é :" + n.toUpperCase());
		System.out.println(" o seu nome em minusculas é :" + n.toLowerCase());
		System.out.println(" a primeira letra do seu nome é;" + n.charAt(0));
		System.out.println(" a ultima letra do seu nome é; " + n.charAt(n.length() - 1));
		System.out.println(" seu nome tem a letra a na posicao:" + n.indexOf('a'));
		System.out.println(" o código da letra 'a' é:" + (int) 'a');
		System.out.println(" o codigo 65 é;" + (char) 65);

		for (int i = n.length() - 1; i >= 0; i--) {
			System.out.println(n.charAt(i));
		}
	}

}
