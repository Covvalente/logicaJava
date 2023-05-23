package logicaJava;

public class fibonacci_procedimento {

	public static int proximoFibonacci(int[] numeros) {
		int n3 = numeros[0] + numeros[1];
		numeros[0] = numeros[1];
		numeros[1] = n3;
		return n3;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int c, t1, t2, t3;
		t1 = 0;
		System.out.println(t1);
		t2 = 1;
		System.out.println(t2);
		for (c = 2; c < 10; c++) {
			int[] numeros = { t1, t2 };
			t3 = proximoFibonacci(numeros);
			System.out.println(t3);
		}

	}

}
