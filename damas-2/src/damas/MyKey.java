package damas;

import java.util.HashMap;
import java.util.Map;

public class MyKey {

	private int id;

	@Override
	public int hashCode() {
		System.out.println("Calling hashCode()");
		return id;
	}

	public MyKey(int id) {
		super();
		this.id = id;
	}

	public static void main(String[] args) {
		//Scanner keyboard = new Scanner(System.in);
		MyKey key = new MyKey(1);
		Map<MyKey, String> map = new HashMap<>();
		map.put(key, "val1");
		map.put(key, "val2");
		map.put(key, "val3");
		map.put(key, "val4");
		
		
		
		//MyKey key2 = new MyKey(1);
    //Map<MyKey, String> map = new HashMap<>();
    //map.put(key, "val2");
    System.out.println("mapa : "+map.get(key));		
	}
}