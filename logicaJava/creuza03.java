package logicaJava;

import java.util.Scanner;

public class creuza03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double f, c;

		System.out.print("qual a temperatura aqui em fahrenheit?");
		f = sc.nextDouble();
		c = (f - 32) / 1.8;
		System.out.printf(" no Brasil estaria %.1f", c, "graus celsius");
		sc.close();
	}

}
