package damas;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

public class ParallelStream1 {


	public static void main(String[] args) {
		long ini = System.currentTimeMillis();
		List<Integer> listOfNumbers2 = Arrays.asList(999,999,999,999,999,999,999,999,999);
		listOfNumbers2.stream().forEach(number -> factorial1(number));
		long fin = System.currentTimeMillis();
		System.out.println("used mSeconds : "+(fin - ini));

		ini = System.currentTimeMillis();
		List<Integer> listOfNumbers = Arrays.asList(999,999,999,999,999,999,999,999,999);
		listOfNumbers.parallelStream().forEach(number -> factorial1(number));
		fin = System.currentTimeMillis();
		System.out.println("parallel used mSeconds : "+(fin - ini));
	}

	public static void factorial1(int num) {
		BigDecimal iNumero = new BigDecimal(num);
		BigDecimal iFactorial = new BigDecimal(1);
		for (int x = 2; x <= iNumero.doubleValue(); x++) {
			iFactorial = iFactorial.multiply(new BigDecimal(x));
		}
		System.out.println(iNumero + "! = " + iFactorial.toPlainString()  + " hilo : "+Thread.currentThread().getName());
	}

}
