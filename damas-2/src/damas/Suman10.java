package damas;

public class Suman10 {
	static int[] myArray = {1,3,4,2,7,0};

	public static void main(String args[]) {
		for (int i = 0; i < myArray.length; i++) {
			for (int j = i; j < myArray.length; j++) {
				if (myArray[i]+myArray[j]==10) { 
					System.out.println(myArray[i]+" "+myArray[j]);
				}
			}
			
		}
	}
}
