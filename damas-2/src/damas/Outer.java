package damas;

	public class Outer {
  
    public static void main(String arg[])
    {
        System.out.println("Outer class main method");
    }

    static class Nested {
      public static void main(String arg[])
      {
          System.out.println(
              "static method class main method");
      }
  }

	
	}