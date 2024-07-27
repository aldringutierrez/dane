package damas;

public class Ocurrencias {
	static int[] myArray = { 1, 2, 2, 2, 2, 8, 2, 8, 5, 8, 7, 8, 2, 8, 2, 3 };

	public static void main(String args[]) {
		int cuenta[] = new int[9];
		int cuenta2[] = new int[9];
		int max = 0;
		int maxi = 0;
		for (int i = 0; i < myArray.length; i++) {
			cuenta[myArray[i]]++;
		}
		for (int i = 1; i < 9; i++) {
			if (cuenta[i] > max) {
				max = cuenta[i];
				maxi = i;
			}
		}
		System.out.println("Longest: " + max);
		System.out.println("Number: " + maxi);

		// consecutivos
		int contadorConsecutivos = 0;
		for (int i = 0; i <9; i++) {
			contadorConsecutivos = 0;
			for (int j = 1; j < myArray.length; j++) {
				if (myArray[j] == i && myArray[j - 1] == i) {
					contadorConsecutivos++;
				}
			}
			cuenta2[i]=contadorConsecutivos;
		}
		for (int i = 1; i < 9; i++) {
			if (cuenta2[i] > max) {
				max = cuenta2[i];
				maxi = i;
			}
		}
		System.out.println("Longest: " + max);
		System.out.println("Number: " + maxi);

	}
}
