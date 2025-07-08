// Fig. 2.15: Comparison.java
// Fig. 2.15: Compare integers using if statements, relational operators
// and equality operators.
package cap2_06JavaExercicios_App_Comparison;

import java.util.Scanner; // Fig. 2.15: program uses class Scanner to read user's input

public class Program_Comparison {
	// main method begins Java application
	public static void main(String[] args) {
		
		// Fig. 2.15: instancing Scanner object resource to obtain input from command line
		Scanner input = new Scanner(System.in); 
		
		int number1; // Fig. 2.15: first number to compare
		int number2; // Fig. 2.15: second number to compare
		
		System.out.print("Enter first integer: "); // Fig. 2.15: prompt
		number1 = input.nextInt(); // Fig. 2.15: read first number from user
		
		System.out.print("Enter second integer: "); // Fig. 2.15: prompt
		number2 = input.nextInt(); // Fig. 2.15: read second number from user
		
		if(number1 == number2)
			System.out.printf("%d == %d%n", number1, number2);
		if(number1 != number2)
			System.out.printf("%d != %d%n", number1, number2);
		if(number1 < number2)
			System.out.printf("%d < %d%n", number1, number2);
		if(number1 > number2)
			System.out.printf("%d > %d%n", number1, number2);
		if(number1 <= number2)
			System.out.printf("%d <= %d%n", number1, number2);
		if(number1 >= number2)
			System.out.printf("%d >= %d%n", number1, number2);		
		
		input.close(); // Fig. 2.15: closing Scanner object resource
	} // Fig. 2.15: end method main
} // Fig. 2.15: end class Comparison
