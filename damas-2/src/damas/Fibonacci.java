package damas;

import java.util.stream.Stream;

public class Fibonacci {

    public static void main(String[] args) {
        // first 10 Fibonanni numbers
        final int MAX_NUMS = 15;
        for (int i = 1; i <= MAX_NUMS; i++) {
            System.out.print(fib(i) + ", ");
        }
        //----- con stream
        System.out.println("..."); // Print nice
        System.out.print(Fibonacci.SEED + ", "); // Print 1st
        Stream.iterate(Fibonacci.SEED, Fibonacci::next)
              .limit(MAX_NUMS)
              .forEach(x -> System.out.print(x + ", "));
        System.out.println("..."); // Print nice
    
    }

     public static long fib(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }
//---------------------------------------------------------------------------
     
     public final int previous;
     public final int value;

     // Seed for stream.iterate()
     public static final Fibonacci SEED = new Fibonacci(1, 1);

     public Fibonacci(int previous, int value) {
         this.previous = previous;
         this.value = value;
     }

     public Fibonacci next() {
         return new Fibonacci(value, value + previous);
     }

     @Override
     public String toString() {
         return String.valueOf(value);
     }

     
     
     
     
     
}