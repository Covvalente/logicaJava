package logicaJava;

import java.util.Scanner;

public class CorrigindoProva_vetor {

	// TODO Auto-generated method stub
	char[] gab = new char[5];
	char[][] provas = new char[3][5];
	String[] nome = new String[3];
	double[] notas = new double[3];
	double s = 0, m;

	public void cadastroGabarito() {
		Scanner sc = new Scanner(System.in);
		System.out.println("PASSO 1- cadastro de gabarito");
		System.out.println("-----------------------------");
		for (int c = 0; c < gab.length; c++) {
			System.out.println("Questão" + (c + 1) + ":");
			char resposta = sc.nextLine().charAt(0);
			gab[c] = resposta;
			sc.close();
		}
	}

	public void cadastroProvas() {
		Scanner sc = new Scanner(System.in);
		for (int a = 0; a < 3; a++) {
			System.out.println("-----------------------");
			System.out.println("ALuno" + (a + 1));
			System.out.println("-----------------------");
			System.out.println("Nome:");
			String entrada = sc.next();
			nome[a] = entrada;
			sc.close();

			System.out.println("Respostas dadas");
			double notaFinal = 0;

			for (int c = 0; c < 5; c++) {
				System.out.println("Questão" + (c + 1) + ":");
				provas[a][c] = sc.next().charAt(0);

				if (provas[a][c] == gab[c] || Character.toUpperCase(provas[a][c]) == Character.toUpperCase(gab[c])) {
					notaFinal += 2;
				}
			}
			notas[a] = notaFinal;
			s += notaFinal;
		}

	}

	public void exibeNotas() {
		System.out.println("NOTAS FINAIS");
		System.out.println("------------------");
		for (int a = 0; a < 3; a++) {
			System.out.printf("%-10s%4.1f\n", nome[a], notas[a]);
		}
		m = s / 3;
		System.out.println("------------------");
		System.out.printf(" Média da turma:%1f\n", m);
	}

	public static void main(String[] args) {
		CorrigindoProva_vetor cpv = new CorrigindoProva_vetor();
		cpv.cadastroGabarito();
		cpv.cadastroProvas();
		cpv.exibeNotas();
	}

}