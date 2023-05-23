package logicaJava;


import java.util.Scanner;

public class crianca_esperanca {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d;
        double valor;
        valor = 0;
        System.out.println("----------------------");
        System.out.println("  CRIANÇA ESPERANÇA    ");
        System.out.println("----------------------");
        System.out.println("Muito obrigado por ajudar.");
        System.out.println("[1] para doar R$10");
        System.out.println("[2] para doar R$25");
        System.out.println("[3] para doar R$50");
        System.out.println("[4] para doar outros valores");
        System.out.println("[5] para cancelar a doação");
        d = sc.nextInt();

        switch (d) {
            case 1:
            	System.out.println("[1] para doar R$10");
                valor = 10;
                break;

            case 2:
                valor = 25;
                break;

            case 3:
                valor = 50;
                break;

            case 4:
                System.out.print("Qual o valor da doação? R$");
                valor = sc.nextDouble();
                break;
                
            case 5:
                valor = 0;
                break;
                
        }
        System.out.println("-------------------");
        System.out.println("Sua doação foi de R$ " + valor);
        System.out.println("Muito obrigado!");
        System.out.println("-------------------");
        
        sc.close(); // Movido para depois do switch
        
    }
}
