// Fig. 4.15: Increment.java
// Prefix increment and postfix increment operators.
package cap4_05JavaExercicios_App_Increment;

public class Increment {
	public static void main(String[] args) 
	{
		// demonstrate postfix increment operator
		int c = 5;
		System.out.printf("c before postincrement: %d%n", c); // prints 5
		System.out.printf("       postincrement c: %d%n", c++); // prints 5
		System.out.printf(" c after postincrement: %d%n", c); // prints 6

		System.out.println(); // skip a line

		// demonstrate prefix increment operator
		c = 5;
		System.out.printf("c before  preincrement: %d%n", c); // prints 5
		System.out.printf("        preincrement c: %d%n", ++c); // prints 6
		System.out.printf(" c after  preincrement: %d%n", c); // prints 6
	}
}	// end class Increment