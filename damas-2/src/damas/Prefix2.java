package damas;

public class Prefix2 {
	public static void main(String[] args) {
		// String[] arr = { "caterpilar", "cat", "catch" };
		String[] arr = { "developer", "developing", "development" };
		// String[] arr = { "flow", "flower", "flood" };
		// String[] arr = { "dog", "cat", "fish" };
		int[] lengs = new int[3];
		String prefix = "";
		String prefix_ant = "";
		for (int i = 0; i < arr.length; i++) {
			lengs[i] = arr[i].length();
		}
		int min = 0;//NumberUtils.min(lengs);
		outerloop: for (int j = 1; j <= min; j++) {
			prefix = arr[0].substring(0, j);
			for (int i = 1; i < arr.length; i++) {
				if (!prefix.equalsIgnoreCase(arr[i].substring(0, j))) {
					break outerloop;
				}
			}
			prefix_ant = prefix;
		}
		System.out.println("prefix : " + prefix_ant);
	}

}

/**
 * Input: String[] (an array of Strings to compare) Output: String (the longest
 * common prefix) This method returns the longest common prefix for all
 * passed-in strings. Example: caterpillar, cat, catch -> cat Example:
 * developer, development, developing -> develop Example: flow, flower, flood ->
 * flo Example: cat, dog, fish -> "" (empty string)
 */
