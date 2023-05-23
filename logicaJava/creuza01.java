package logicaJava;

import java.util.Scanner;

public class creuza01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int ano_atual, ano_nasc, idade;

		System.out.print("EM que ano estamos");
		ano_atual = sc.nextInt();
		System.out.print(" em que ano eu nasci?");
		ano_nasc = sc.nextInt();
		idade = ano_atual - ano_nasc;
		System.out.print(" minha idade será: " + idade);
		sc.close();
	}

}
