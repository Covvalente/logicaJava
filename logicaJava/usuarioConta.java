package logicaJava;

import java.util.Scanner;

public class usuarioConta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int valor, salto, contador;
		contador = 0;
		System.out.print(" quer contar ate quanto? ");
		valor = sc.nextInt();
		System.out.println("qual sera o valor do salto");
		salto = sc.nextInt();
		System.out.println("");
		while (contador <= valor) {
			System.out.println(contador);
			contador = contador + salto;
		}
		System.out.println(" terminei de contar");
	}

}
