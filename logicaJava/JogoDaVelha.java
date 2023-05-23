package logicaJava;

import java.util.Scanner;

public class JogoDaVelha {
	// tabuleiro é uma matriz 3x3 que representa o jogo da velha
	static char[][] tabuleiro = new char[3][3];
	// simbolo indica qual jogador deve jogar ("X" ou "O")
	static char simbolo = 'X';

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Preenchendo o tabuleiro com espaços em branco
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				tabuleiro[i][j] = ' ';
			}
		}

		int posicao;
		boolean jogadaValida;
		while (true) {
			exibirTabuleiro();

			// Lendo a posição da jogada
			do {
				System.out.print("Vai jogar [" + simbolo + "] em qual posição? ");
				posicao = input.nextInt();
				jogadaValida = fazerJogada(posicao);
				if (!jogadaValida) {
					System.out.println("Jogada inválida! Tente novamente.");
				}
			} while (!jogadaValida);

			// Verificando se o jogo terminou
			if (verificarVencedor()) {
				exibirTabuleiro();
				System.out.println("Parabéns, jogador [" + simbolo + "]! Você venceu o jogo!");
				break;
			}
			if (verificarEmpate()) {
				exibirTabuleiro();
				System.out.println("Empate! O jogo terminou!");
				break;
			}

			// Mudando o jogador
			mudarJogador();
		}
	}

	// Exibe o tabuleiro do jogo
	static void exibirTabuleiro() {
		System.out.println("   1   2   3 ");
		System.out.println(" +---+---+---+");
		for (int i = 0; i < 3; i++) {
			System.out.print((i + 1) + "| ");
			for (int j = 0; j < 3; j++) {
				System.out.print(tabuleiro[i][j] + " | ");
			}
			System.out.println();
			System.out.println(" +---+---+---+");
		}
	}

	// Faz uma jogada na posição informada pelo jogador
	static boolean fazerJogada(int posicao) {
		int linha = (posicao - 1) / 3;
		int coluna = (posicao - 1) % 3;
		if (tabuleiro[linha][coluna] == ' ') {
			tabuleiro[linha][coluna] = simbolo;
			return true;
		} else {
			return false;
		}
	}

	// Verifica se há um vencedor no jogo
	static boolean verificarVencedor() {
		// Verificando linhas
		for (int i = 0; i < 3; i++) {
			if (tabuleiro[i][0] == simbolo && tabuleiro[i][1] == simbolo && tabuleiro[i][2] == simbolo) {
				return true;
			}
		}

		// Verificando colunas
		for (int j = 0; j < 3; j++) {
			if (tabuleiro[0][j] == simbolo && tabuleiro[1][j] == simbolo && tabuleiro[2][j] == simbolo) {
				return true;
			}
		}

		// Verificando diagonais
		if (tabuleiro[0][0] == simbolo && tabuleiro[1][1] == simbolo && tabuleiro[2][2] == simbolo) {
			return true;
		}
		if (tabuleiro[0][2] == simbolo && tabuleiro[1][1] == simbolo && tabuleiro[2][0] == simbolo) {
			return true;
		}

		return false;
	}

	// Verifica se houve um empate
	static boolean verificarEmpate() {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (tabuleiro[i][j] == ' ') {
					return false;
				}
			}
		}
		return true;
	}

	// Muda o jogador atual
	static void mudarJogador() {
		if (simbolo == 'X') {
			simbolo = 'O';
		} else {
			simbolo = 'X';
		}
	}
}
