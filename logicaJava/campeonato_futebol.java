package logicaJava;

import java.util.Scanner;

public class campeonato_futebol {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		char[]time = new char [3];
		int l,c;
		
		System.out.println(" ---------------------- ");
		System.out.println(" Campeonato de futebol ");
		System.out.println(" ---------------------- ");
		
		for(c=0;c<time.length;c++) {
			System.out.print("nome do "+c+"o.time");
			time[c]=sc.nextLine().charAt(0);
		}
		
		System.out.println(" --------------------- ");
		System.out.println(" TABELA DE PARTIDAS    ");
		System.out.println(" --------------------- ");
		
		for(l=0;l<time.length;l++) {
		for (c=0;c<time.length;c++) {
			if(l!=c) {
				System.out.printf("%12c [ ] x [ ] %12c%n",time[l],time[c]);
			}
		}
	}
		sc.close();
	}

}
