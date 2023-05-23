package logicaJava;

import java.util.Scanner;

public class exemploVetor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int[] vetor= new int [6] ;
		int c ;
			
		for ( c=1;c<6;c++) {
			System.out.print(" digite o "+c+"o.valor");
			vetor[c]=sc.nextInt();
		}
		for (c=1;c<6;c++) {
			System.out.print("{"+vetor[c]+"}");
			sc.close();
		}
		}
		
	}


