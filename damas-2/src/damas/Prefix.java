package damas;

public class Prefix {
	public static void main(String[] args) {
		
		int [] qq = { 1,2,3 }; 
		
		
		
		String arr[] = { "developer", "developing", "development" };
		//String arr[] = { "caterpilar", "cat", "catch" };
		//String arr[] = { "flow", "floor", "flood" };
		//String arr[] = { "cat", "dog", "fish" };
		int n = arr.length;
		String prefix = arr[0];
		for (int i = 1; i <= n - 1; i++) {
			prefix = commonPrefix(prefix, arr[i]);
		}
		System.out.printf("prefix : %s", prefix);
	}

	// function to find prefix between two strings
	static String commonPrefix(String str1, String str2) {
		String result = "";
		int n1 = str1.length(), n2 = str2.length();
		for (int i = 0, j = 0; i <= n1 - 1 && j <= n2 - 1; i++, j++) {
			if (str1.charAt(i) != str2.charAt(j)) {
				break;
			}
			result += str1.charAt(i);
		}
		return (result);
	}

}
