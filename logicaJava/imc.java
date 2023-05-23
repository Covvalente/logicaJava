package logicaJava;

import java.util.Scanner;

public class imc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double m, a, imc;
		System.out.println(" MASSA (KG) : ");
		m = sc.nextDouble();
		System.out.println(" SUA ALTURA EM (Metros):");
		a = sc.nextDouble();

		imc = m / Math.pow(a, 2);
		System.out.printf(" seu imc é : %2.2f", imc);

		if (imc >= 18.5 && imc <25) {
			System.out.println(" parabéns você está no seu peso ideal");

		} else {
			System.out.println(" você não está no seu peso ideal");
		}

	}

}
