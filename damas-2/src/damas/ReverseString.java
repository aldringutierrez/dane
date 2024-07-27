package damas;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseString {

	public static void main(String args[]) {
		String entrada = "hello";
		String salida = "";

		//la antigua
		for (int i = entrada.length() - 1; i > -1; i--) {
			salida = salida + entrada.substring(i,i+1);
		}
		System.out.println("rev1 : " + salida);
		
		//la mas facil
		salida = new StringBuilder(entrada).reverse().toString();
		System.out.println("rev2 : " + salida);

		//con streams
		salida = entrada.chars()
										.mapToObj(c -> (char) c)
										.reduce("", (c1, c2) -> c2 + c1, (s1, s2) -> s2 + s1);
		System.out.println("rev3 : " + salida);
		
		salida = Arrays.asList(entrada).stream()
		    .map(ss -> new StringBuilder(ss).reverse().toString())
		    .collect(Collectors.toList()).get(0);
		System.out.println("rev4 : "+salida);
		
		//recursiva
		System.out.print("rev5 : ");
		printReverse(entrada);
		
	}

	public static void printReverse(String s) {
	  if (s.length() > 0) {      					// Recursive case:
	     printReverse(s.substring(1));  	// Print tail
	     System.out.print(s.charAt(0)); 	// Print first char
	  }
	
	}
	
}


/*
 

<String> String java.util.stream.Stream.reduce(String identity, 
                                               BiFunction<String, ? super Character, String> accumulator, 
                                               BinaryOperator<String> combiner)


Performs a reduction on the elements of this stream, using the provided identity, accumulation and combining functions. This is equivalent to: 
U result = identity;
     for (T element : this stream)
         result = accumulator.apply(result, element)
     return result;
but is not constrained to execute sequentially. 
The identity value must be an identity for the combinerfunction. This means that for all u, combiner(identity, u)is equal to u. Additionally, the combiner functionmust be compatible with the accumulator function; for all u and t, the following must hold: 
combiner.apply(u, accumulator.apply(identity, t)) == accumulator.apply(u, t)

This is a terminaloperation.
Type Parameters:<U> The type of the resultParameters:identity the identity value for the combiner functionaccumulator an associative, non-interfering, statelessfunction for incorporating an additional element into a resultcombiner an associative, non-interfering, statelessfunction for combining two values, which must becompatible with the accumulator functionReturns:the result of the reductionSee Also:reduce(BinaryOperator)reduce(Object, BinaryOperator)API Note:Many reductions using this form can be represented more simplyby an explicit combination of map and reduce operations.The accumulator function acts as a fused mapper and accumulator,which can sometimes be more efficient than separate mapping and reduction,such as when knowing the previously reduced value allows you to avoidsome computation.

 
 
 
 */



