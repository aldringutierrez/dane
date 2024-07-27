package damas;

public class Factorial {

	public static void main(String[] args) {
		int iNumero = 5;
		int iFactorial = 1;
		String sCadena = Integer.toString(iNumero) + "! = 1";
		for (int x = 2; x <= iNumero; x++) {
			iFactorial = iFactorial * x;
			sCadena = sCadena + " x " + Integer.toString(x);
		}
		System.out.println(sCadena + " = " + Integer.toString(iFactorial));
	}
	
}
