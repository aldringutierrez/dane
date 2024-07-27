package damas;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Histograma {
	static int[] myArray = { 1, 2, 1, 3, 3, 1, 2, 1, 5, 1 };

	public static void main(String args[]) {
		int[] cuenta = new int[6];
		for (int i = 0; i < myArray.length; i++) {
			cuenta[myArray[i]]++;
		}
		for (int i = 1; i <= 5; i++) {
			System.out.print(i + ": ");
			for (int j = 0; j < cuenta[i]; j++) {
				System.out.print( "*");
			
			}
			System.out.println("");
		}
		


    List<String> names = List.of(
        "John",
        "John",
        "Mariam",
        "Alex",
        "Mohammado",
        "Mohammado",
        "Vincent",
        "Alex",
        "Alex"
);

Map<String, Long> map = names.stream()
        .collect(Collectors.groupingBy(
        				x -> x, //Function.identity(),
                Collectors.counting())
        );

System.out.println(map);

int[] integers = {1, 2, 3, 4};
int sum = Arrays.stream(integers).reduce(0, Integer::sum);
System.out.println(sum);
//int sub = Arrays.stream(integers).reduce(0, (a, b) -> a - b);
//System.out.println(sub);
	
	
	}
}
