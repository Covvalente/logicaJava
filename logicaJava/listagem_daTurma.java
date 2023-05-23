package logicaJava;

import java.util.Scanner;

public class listagem_daTurma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		String vetor[] = new String[4];
		double n1[] = new double[4];
		double n2[] = new double[4];
		double m[] = new double[4];
		double sm = 0, mt;
		int i, tot = 0;

		for (i = 1; i < 4; i++) {
			System.out.println(" aluno :" + i);
			System.out.print("nome: ");
			vetor[i] = sc.next();
			System.out.print(" primeira nota:");
			n1[i] = sc.nextDouble();
			System.out.print("Segunda nota :");
			n2[i] = sc.nextDouble();
			m[i] = (n1[i] + n2[i]) / 2;
			sm = sm + m[i];

		}
		mt = sm / 3;
		System.out.println("listagem de alunos");
		System.out.println("------------------");
		for (i = 1; i <= 3; i++) {
			System.out.println(vetor[i] + " " + m[i]);
			if (m[i] > mt) {
				tot++;
			}
		}
		System.out.println(" AO TODO TEMOS %d Alunos acima da media da turma que é %.2f " + tot + mt);
	}

}
