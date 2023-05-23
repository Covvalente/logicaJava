package logicaJava;

import java.util.Locale;

public class saida_dados_java {

	public static void main(String Arrgs[]) {

		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		int idade;
		double salario;
		String nome;
		char sexo;

		idade = 20;
		salario = 5000.9;
		nome = "Marcela";
		sexo = 'F';

		System.out.println(" A funcionaria" + nome + ",sexo" + sexo + ",ganha" + String.format("%2.f", salario)
				+ "e tem" + idade + "anos");

	}

}
