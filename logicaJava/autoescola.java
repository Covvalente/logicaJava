package logicaJava;

import java.util.Scanner;

public class autoescola {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int ano_atual, ano_nasc, idade;

		System.out.print(" qual o ano atual ");
		ano_atual = sc.nextInt();
		System.out.print("qual o ano do seu nascimento :");
		ano_nasc = sc.nextInt();
		sc.close();
		
		idade = ano_atual - ano_nasc;
		if (idade >= 18) {
			System.out.println("pode tirar a carteira");
		} else {
			System.out.println(" está inapto a tirar a carteira");
		}

	}

}