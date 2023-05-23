package logicaJava;

import java.util.Scanner;

public class escolhendoPessoas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	
		String sexo,resp;
		
		int idade,cabelo,totH18=0,totM25=0;
		
		do {
			System.out.println("======================");
			System.out.println("  SELETOR DE PESSOAS  ");
			System.out.println("======================");
			System.out.println(" Qual é o seu sexo [M/F]");
			sexo=sc.nextLine();
			System.out.println(" Qual a sua idade");
			idade=sc.nextInt();
			System.out.println("Qual a cor do cabelo");
			System.out.println("----------------------");
			System.out.println("[1] Preto");
			System.out.println("[2] Castanho");
			System.out.println("[3] Loiro");
			System.out.println("[4] Ruivo");
			cabelo=sc.nextInt();
			sc.nextLine();
			sc.close();
			
			if (sexo.equals("M")&&idade>=18&&cabelo==2) {
				totH18++;
			}
			else if (sexo.equals("F")&&idade>=25&&idade<=30&&cabelo==3){
				totM25++;
			}
			
			System.out.println("Quer continuar?[S/N]");
			resp=sc.nextLine();
			
		}while(resp.equals("S"));
			System.out.println("----------------------");
			System.out.println(" RESULTADO FINAL ");
			System.out.println("----------------------");
			System.out.println(" Total de homens com mais de 18 e cablos castanhos foi:"+totH18);
			System.out.println(" Total de mulheres entre 24 e 30 e cabelos loiros "+totM25);
	}

}
