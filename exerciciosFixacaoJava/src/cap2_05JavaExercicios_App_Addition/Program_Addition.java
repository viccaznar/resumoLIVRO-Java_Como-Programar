package cap2_05JavaExercicios_App_Addition;

import java.util.Scanner;

// Fig. 2.7: Addition.java
// Fig. 2.7: Addition program that inputs two numbers the displays their sum.

public class Program_Addition 
{
	
	// Fig. 2.7: main method begins execution Java application
	public static void main(String[] args) 
	{
		// Fig. 2.7: create a Scanner object resource to obtain input from command window
		Scanner input = new Scanner(System.in);
		
		int number1; // Fig. 2.7: first number to add
		int number2; // Fig. 2.7: second number to ass
		int sum; // Fig. 2.7: sum of number 1 and number 2
		
		System.out.print("Enter first integer: "); //Fig. 2.7: prompt
		number1 = input.nextInt(); // Fig. 2.7: read first number from user
		
		System.out.print("Enter second integer: "); //Fig. 2.7: prompt
		number2 = input.nextInt(); // Fig. 2.7: read second number from user
		
		sum = number1 + number2; // add numbers, then store total in sum.
		
		System.out.printf("Sum is %d", sum); // Fig. 2.7: display sum		
		
		input.close(); // Fig. 2.7: close Scanner object resource
	} // Fig. 2.7: end method main
} // Fig. 2.7: end class Comparison
