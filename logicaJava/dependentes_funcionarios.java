package logicaJava;

import java.util.Scanner;

public class dependentes_funcionarios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		String nome;
		double sal,nSal = 0;
		int dep;
		
		System.out.print(" qual o nome do funcionário");
		nome=sc.nextLine();
		System.out.print("qual o salario do funcionario");
		sal=sc.nextDouble();
		System.out.print("qual a quantidade de dependentes");
		dep=sc.nextInt();
		
		switch(dep) {
		case 0:
			nSal=sal+(sal*5/100);
			break;
		case 1:
		case 2:
		case 3:
			nSal=sal+(sal*10/100);
			break;
		case 4:
		case 5:
		case 6:
			nSal=sal+(sal*18/100);
			
		}
		System.out.printf(" o novo Salário de "+nome+" sera de R$ %.2f",nSal);
	}

}
