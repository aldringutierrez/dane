package damas;
import java.util.*;

public class P1b {
	public static void main(String[] args) {


		
		int[][] tests = { 
				{ 2, 4, 2, 4 }, 
				{ 3, 7, 3, 7, 2, 1, 2 }, 
				{ 1, 5, 6, 0, 1, 0 }, 
				{ 7, -5, -5, -5, 7, -1, 7 },
				{ 7, -5, -5, -5, -5, -5, 7, -1, 7, -1, 7, -1 }, 
				{ 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },
				{ 3, 2, 3, 2, 3, 5, 4, 5, 7, 8, 7, 8, 7, 8, 7, 8 } 
				};
		for (int i = 0; i < tests.length; ++i) {
			System.out.println(Arrays.toString(tests[i]) + " => " + solve(tests[i]));
		}
	}

	private static int solve(int[] arr) {
		if (arr.length == 1)
			return 1;
		int even = arr[0]; 
		int odd = arr[1];
		int start = 0; 
		int	maxLen = 0;
		for (int i = 2; i < arr.length; ++i) {
			if (i % 2 == 0 && arr[i] != even || i % 2 == 1 && arr[i] != odd) {
				maxLen = Math.max(maxLen, i - start);
				start = i - 1;
				if (i % 2 == 0) {
					even = arr[i];
					odd = arr[i - 1];
				} else {
					even = arr[i - 1];
					odd = arr[i];
				}
			}
		}
		return Math.max(maxLen, arr.length - start);
	}
}