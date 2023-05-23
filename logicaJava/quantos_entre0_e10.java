package logicaJava;

import java.util.Scanner;

public class quantos_entre0_e10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int c,v,tot010,sImp;
		sImp=0;
		tot010=0;
		
		for(c=0;c<6;c++) {
			System.out.println(" digite um valor : ");
			v=sc.nextInt();
			if(v>=0&&v<=10) {
				tot010++;
				if(v%2==1) {
					sImp=sImp+v;
				}
			}
		}
		System.out.println(" ao todo foram " +tot010+ " valores entre 0 e 10");
		System.out.println(" nesse intervalo , a soma dos impares foi "+sImp);
	}

}
