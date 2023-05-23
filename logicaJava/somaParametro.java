package logicaJava;

public class somaParametro {

	public static void soma(int a, int b) {
		a = a + 1;
		b = b + 2;
		System.out.println(" valor de A= " + a);
		System.out.println(" valor de B= " + b);
		System.out.println(" a soma A+B= " +(a + b));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x, y;
		x = 4;
		y = 8;
		soma(x, y);
		System.out.println(" valor de x = " + x);
		System.out.println(" valor de y = " + y);
	}

}
