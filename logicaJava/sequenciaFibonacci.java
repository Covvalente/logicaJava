package logicaJava;

public class sequenciaFibonacci {

	public static int proximoFibonacci(int a, int b) {
		int c;
		c = a + b;
		System.out.print(c + " ");
		return c;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c, t1, t2, t3;
		t1 = 0;
		System.out.print(t1 + " ");
		t2 = 1;
		System.out.print(t2 + " ");
		for (c = 3; c < 10; c++) {
			t3 = proximoFibonacci(t1, t2);
			t1 = t2;
			t2 = t3;
		}
	}

}
