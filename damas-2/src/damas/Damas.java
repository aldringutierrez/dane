package damas;

import java.util.Scanner;

public class Damas {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("n : ");
		int n = keyboard.nextInt();		
		System.out.println("____________________________________________");
		String[][] tablero = new String[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i%2 == 0 && j%2 == 0) {
					tablero[i][j] = "X";
				} else {
					if (i%2 != 0 && j%2 != 0) {
						tablero[i][j] = "X";
					} else {
						tablero[i][j] = "_";
					}
				}
				System.out.print(tablero[i][j]);
			}
			System.out.println("");
		}
		System.out.println("____________________________________________");
		String cuadro="";
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i%2 == 0 && j%2 == 0) {
					cuadro = "X";
				} else {
					if (i%2 != 0 && j%2 != 0) {
						cuadro = "X";
					} else {
						cuadro = "_";
					}
				}
				System.out.print(cuadro);
			}
			System.out.println("");
		}
		keyboard.close();
	}
}
