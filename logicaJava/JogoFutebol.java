package logicaJava;

import java.util.Scanner;

public class JogoFutebol {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int gol1,gol2,diferenca;
		
		System.out.println("------------------------");
		System.out.println(" CORINTHANS X PALMEIRAS ");
		System.out.println("------------------------");
		System.out.print(" quantos gols tem o corinthans");
		gol1=sc.nextInt();
		System.out.print(" quantos tem o palmeiras ");
		gol2=sc.nextInt();
		
		if (gol1>gol2) {
			diferenca=gol1-gol2;
		}else {
			diferenca=gol2-gol1;
		}
		System.out.println("------------------------");
		System.out.print("a diferença é : "+diferenca);
		
		switch(diferenca) {
		case 0:
			System.out.println("Status empate");
			break;
		case 1:
		case 2:
		case 3:
			System.out.println("Status normal");
		break;
		case 4:
		case 5:
			System.out.println(" Status goleada ");
		break;
		}
		
	}

}
