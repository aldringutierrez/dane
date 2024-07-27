package damas;

import java.util.HashMap;
import java.util.Map;

public class EmployeeCollision {
	
	public static void main(String[] args) {
		
		Employee e1 = new Employee();
		e1.setId(1);
		e1.setFirstName("juan");
		e1.setLastName("Perez");
		e1.setSalary(500);

		Employee e2 = new Employee();
		e2.setId(2);
		e2.setFirstName("pedro");
		e2.setLastName("jimenez");
		e2.setSalary(700);

		Employee e3 = new Employee();
		e3.setId(3);
		e3.setFirstName("ana");
		e3.setLastName("romero");
		e3.setSalary(900);

		Map<Employee,String> mapa = new HashMap<Employee,String>();
		mapa.put(e1,e1.toString()+" x");
		mapa.put(e2,e2.toString()+" y");
		mapa.put(e3,e3.toString()+" z");
		System.out.println(mapa.get(e1));
		System.out.println(mapa.get(e2));
		System.out.println(mapa.get(e3));
		System.out.println(mapa);
		String qq="FB";
		System.out.println(qq.hashCode());
		qq="Ea";
		System.out.println(qq.hashCode());
		
		
		Map<String,Integer> mapa2 = new HashMap<>();
		mapa2.put("FB", 1);
		mapa2.put("Ea", 2);
		System.out.println(mapa2);
		
		
	
	}

}
