package logicaJava;

import java.util.Scanner;

public class imc_ideal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double m, a, imc;
		System.out.println(" Digite a sua massa (kg) ");
		m = sc.nextDouble();
		System.out.println(" Digite a sua altura (m) ");
		a = sc.nextDouble();
		imc = m / Math.pow(a, 2);
		System.out.printf("imc %.2f", imc);
		if (imc < 17) {
			System.out.println("muito abaixo do peso");

		} else if (imc >= 17 && imc <= 18.5) {
			System.out.println(" abaixo do peso ");

		} else if (imc >= 18.5 && imc <= 25) {
			System.out.println(" peso ideal ");

		} else if (imc >= 25 && imc < 30) {
			System.out.println(" sobre peso");

		} else if (imc >= 30 && imc < 35) {
			System.out.println(" obesidade");

		} else if (imc >= 35 && imc < 40) {
			System.out.println(" obesidade severa");
		} else {
			System.out.print("obesidade morbida");
		}
	}
}
