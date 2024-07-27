package damas;

import java.util.ArrayList;
import java.util.List;

public class Sumas {

	List<? extends Number> list = new ArrayList<Integer>();
	
	
	List<Number> superclassedList = (List<Number>)(List<?>)list;
	

	public void mainx() {
		//list.add(100);
		superclassedList.add(200);

		System.out.println("a[i] : ");
}
	
	
	
	public static void main(String[] args) {

						System.out.println("a[i] : ");
}
}