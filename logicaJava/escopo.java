package logicaJava;

import java.util.Scanner;

public class escopo {
	
		public static void parOuImpar(int v) {
			System.out.println("o valor de v é: "+v);
			if (v%2==0) {
				System.out.println(" o numero " +v+ "é par");
			}else {
				System.out.println(" o numero " +v+ " é impar");
			}
		
		}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int n;
			Scanner sc= new Scanner (System .in) ;
			System.out.println(" digite um numero ");
			n=sc.nextInt();
			parOuImpar(n);
			
			System.out.println(" o valor de n é :"+n);
			
		}

	}


