package logicaJava;

import java.util.Scanner;

public class creuza05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner (System.in);
		double valor,taxa,valor_taxa,parcela,valor_parcelado;
		System.out.print("qual o valor do emprestimo R$ : ");
		valor=sc.nextDouble();
		taxa=(valor*20)/100;
		valor_taxa=taxa+valor;
		System.out.print("quantas parcelas : ");
		parcela=sc.nextDouble();
		valor_parcelado=valor_taxa/parcela;
		System.out.printf(" o valor parcelado em "+parcela+"x é: %.2f",valor_parcelado);
		sc.close();
	}

}
