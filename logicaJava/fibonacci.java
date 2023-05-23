package logicaJava;

public class fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i, n1, n2;
		n1 = 1;
		n2 = 0;
		System.out.println(n2);
		System.out.println(n1);
		for (i = 0; i < 15; i++) {
			n1 = n1 + n2;
			n2 = n1 + n2;
			System.out.println(n1);
		}
	}

}
