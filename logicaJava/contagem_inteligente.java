package logicaJava;

import java.util.Scanner;

public class contagem_inteligente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int i, f, cont;
		System.out.println(" CONTAGEM INTELIGENTE");
		System.out.println("---------------------");
		System.out.println("Inicio:");
		i = sc.nextInt();

		System.out.println("FIM:");
		f = sc.nextInt();
		System.out.println("-----------------------");
		System.out.println(" C O N T A N D O ");
		System.out.println("-----------------------");
		if (f > i) {
			cont = 1;
			while (cont <= f) {
				System.out.print(cont + ".. ");
				cont++;
			}

		} else {
			cont = 1;
			while (cont <= 25) {
				System.out.println(cont + "..");
				cont++;
			}
		}
	}

}
