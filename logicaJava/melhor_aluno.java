package logicaJava;

import java.util.Scanner;

public class melhor_aluno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int tot, cont;
		String nome, melhorAluno = null;
		double nota, maiorNota = 0;

		System.out.println(" --------------------------- ");
		System.out.println(" Escola santa paciencia ");
		System.out.println(" --------------------------- ");
		System.out.println(" quantos alunos a turma tem ");
		tot = sc.nextInt();
		cont = 1;
		while (cont <= tot) {
			System.out.println("----------------");
			System.out.println(" aluno " + cont);
			System.out.print("nome do aluno ");
			nome = sc.next();
			System.out.print("nota de " + nome + ":");
			nota = sc.nextDouble();

			if (nota > maiorNota) {
				maiorNota = nota;
				melhorAluno=nome;
			}
			cont++;
		}
		System.out.println("----------------");
		System.out.println(" o melhor aproveitamento foi de " + melhorAluno + " com a nota " + maiorNota);
	}

}
