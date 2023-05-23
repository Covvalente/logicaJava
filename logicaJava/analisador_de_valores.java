package logicaJava;

import java.util.Scanner;

public class analisador_de_valores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner (System.in);
		int v,c,s,di5,nul,spar;
		double m;
		
		s=0;
		di5=0;
		nul=0;
		spar=0;
			
		System.out.println("Digite um numero entre 1 e 5");
		for(c=1;c<=5;c++) {
			System.out.println("digite o "+c+"o.valor:");
			v=sc.nextInt();
			s+=v;
			
			if(v%5==0) {
				di5++;
			}
			if(v==0) {
				nul++;
			}
			if(v%2==0) {
				spar+=v;
			}
			
		}
		m= (double)s/(c-1);
		System.out.println(" A soma entre os valores é:"+s);
		System.out.printf (" A média entre os valores é: %.1f%n", m);
		System.out.println(" valores divisiveis por cinco: "+di5);
		System.out.println(" valores nulos: "+nul);
		System.out.println(" A soma dos valores pares e "+spar);
		
		sc.close();
	}

}
