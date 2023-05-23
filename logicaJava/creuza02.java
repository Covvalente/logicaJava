package logicaJava;

import java.util.Scanner;

public class creuza02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
			
		double reais , dolares,dollarPrice ;
		
		
		System.out.print("quantos reais eu tenho ? R$");
		reais=sc.nextDouble();
		System.out.print("quanto ta o dollar hoje");
		dollarPrice=sc.nextDouble();
		dolares = reais /dollarPrice;
		System.out.printf("posso ter US$ %.2f",dolares);
		sc.close();
		}
	}


