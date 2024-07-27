package damas;

public class RutaMenorSuma {

	static int[] myArray = { 1, 2, 9, 2, 5, 3, 5, 1, 5 };
	static int n = 3;

	public static void main(String args[]) {
		int filas = n;
		int columnas = n;
		int x = 0;
		int menor = 9;
		int matriz[][] = new int[filas][columnas];
		int[] camino = new int[n];
		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < columnas; j++) {
				matriz[i][j] = myArray[x];
				x = x + 1;
			}
		}
		int control = 0;
		for (int i = 0; i < columnas; i++) {
			for (int j = 0; j < filas; j++) {
				if (matriz[j][i] < menor) {
					if (control == j) {
						menor = matriz[j][i];
						camino[i] = menor;
					} else if (control + 1 == j) {
						menor = matriz[j][i];
						camino[i] = menor;
					} else if (control - 1 == j) {
						menor = matriz[j][i];
						camino[i] = menor;
					}
				}
			}
			menor = 9;
		}
		System.out.print(camino[0] + " ");
		System.out.print(camino[1] + " ");
		System.out.print(camino[2]);
	}
}
