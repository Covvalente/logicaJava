package logicaJava;

public class matriz_identidade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mID[][] = new int[4][4];
		int i, j;

		for (i = 0; i <4; i++) {
			for (j = 0; j < 4; j++) {
				if (i == j) {
					mID[i][j] = 1;
				} else {
					mID[i][j] = 0;
				}
			}
		}
		for(i=0;i<4;i++) {
			for(j=0;j<4;j++) {
				System.out.print(mID[i][j]+" ");
			}
			System.out.println();
		}
	}

}
