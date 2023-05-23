package logicaJava;

import java.util.Locale;
import java.util.Scanner;

public class entradaDados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		String nome1, nome2;
		Double salario1, salario2;
		int idade;
		char sexo;

		System.out.print("Digite o nome da primeira pessoa:");
		nome1 = sc.nextLine();
		
		System.out.print("Digite o salário  da primeira pessoa:");
		salario1 = sc.nextDouble();
		
		System.out.print("Digite o nome da segunda pessoa:");
		sc.nextLine();
		nome2 = sc.nextLine();
		
		System.out.print("Digite o salário  da segunda  pessoa:");
		salario2 = sc.nextDouble();
		
		System.out.print("Digite a tua idade");
		idade=sc.nextInt();
		System.out.print("digite seu sexo (F/M)");
		sexo=sc.next().charAt(0);
		
		sc.close();
	
		

	}

}
