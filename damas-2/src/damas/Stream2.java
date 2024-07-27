package damas;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream2 {

	public static void main(String[] args) {
		
		List<String> qq = Stream.of("one", "two", "three", "four")
			.filter(e -> e.length() <= 3)
			.peek(System.out::println)
			.map(String::toUpperCase)
			.peek(e -> System.out.println("Mapped value: " + e))
		  .collect(Collectors.toList());
			qq.forEach(System.out::println);
						
						
				List<Integer> lst1 = Arrays.asList(1, 2, 3, 4, 5, 6, 12, 18); 
				Integer lcm = lst1.stream() 
						.filter(i -> i % 2 == 0) 
						.filter(i -> i % 3 == 0) 
						.findFirst().get();
				System.out.println(lcm);
			
			List<Integer> lst2 = Arrays.asList(1, 2, 3, 4, 5, 6, 12, 18); 
			List<Integer> lst3= lst2.stream() 
					.filter(i -> i % 3 == 0)
					.map(e -> e*2)
					.collect(Collectors.toList());
			System.out.println(lst3);
			
				
			Employee[] arrayOfEmps = {
		      new Employee(1, "Jeff Bezos", 100000.0), 
		      new Employee(2, "Bill Gates", 200000.0), 
		      new Employee(3, "Mark Zuckerberg", 300000.0)
		    };

		    List<Employee> empList = Arrays.asList(arrayOfEmps);
		    
		    empList.stream().parallel().forEach(e -> e.salaryIncrement(10.0));
		    			
			
			Double sumSal = empList.stream()
		      .map(Employee::getSalary)
		      .reduce(0.0, Double::sum);
			System.out.println(sumSal);
		    //assertEquals(sumSal, new Double(600000));			
			
			
	}
	
}
