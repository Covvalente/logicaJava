package logicaJava;

import java.util.Scanner;

public class fatorial_de_um_numero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner (System.in) ;
			
		int c,n,f;
		String r;
		
		do {
			System.out.println(" digite um numero");
			n=sc.nextInt();
			
			c=n;
			f=1;
			do {
				System.out.println(c+"x");
				f=f*c;
				c=c-1;
			}while(c>=1);
		System.out.println(" o valor fatorial de "+n+" é igual a "+f);
		System.out.print("quer continuar ? [s/n]");
		r=sc.next();
		
	}while(r.equalsIgnoreCase("s"));
	}

}
