package logicaJava;

import java.util.Scanner;

public class idade2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		int ano,nasc,idade;
		
		System.out.println("Em que ano estamos");
		ano=sc.nextInt();
		System.out.println(" em que ano voce nasceu ");
		nasc=sc.nextInt();
		idade= ano-nasc;
		
		System.out.println(" em "+ano+" voce terá "+idade+" anos ");
		
		if(idade>=21) {
			System.out.println("e ja terá atingido a maioriadade");
		}
	}

}
