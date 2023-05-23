package logicaJava;

import java.util.Scanner;

public class detectorPesado {

	
		
		
		public static void topo() {
			System.out.println("--------------------------------");
			System.out.println(" D E T E C T O R DE P E S A D O ");
			String mai = null;
			System.out.println(" maior peso ate agora :"+mai+"kg");
		}
		
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			 int i;
			String n,pesado =null;
			double p,mai = 0;
			
			Scanner sc = new Scanner(System.in);
			topo();
			for(i=1;i<=5;i++) {
				System.out.println(" Digite o nome : ");
				n=sc.nextLine();
				
				System.out.println(" Digite o peso de "+n+":");
				p=sc.nextDouble();
				
				if(p>mai) {
					mai=p;
					pesado=n;
				}
				topo();
			}
			topo();
			System.out.println(" A pessoa mais pesada foi "+pesado+"com"+mai+"quilos");
	}

}
