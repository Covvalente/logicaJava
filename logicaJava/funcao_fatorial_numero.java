package logicaJava;

import java.util.Scanner;

public class funcao_fatorial_numero {

	public static int fatorial(int v) {
		int r,c;
		r=1;
		for (c=1;c<v;c++) {
			r=r*c;
			
		}
		return r;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int n,f;
		System.out.println(" digite um  número");
		n = sc.nextInt();
		f=fatorial(n);
		sc.close();
		
		System.out.println("o valor de "+n+"! é igual a : "+f);
	}

}
