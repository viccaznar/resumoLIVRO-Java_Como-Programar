// Ex. 2.6: Product.java
// Ex. 2.6: Calculate the product of three integers.
package cap2_07JavaExercicios_App_Product;

import java.util.Scanner; // Ex. 2.6: program uses Scanner

public class Program_Product {

	public static void main(String[] args) {

		// Ex. 2.6: create Scanner object resource to obtain input from command window
		Scanner input = new Scanner(System.in);
		
		int x;	// Ex. 2.6: first number input by user
		int y;	// Ex. 2.6: second number input by user
		int z;	// Ex. 2.6: third number input by user
		int result;	// Ex. 2.6: product of numbers
		
		System.out.print("Enter first integer: "); // Ex. 2.6: prompt for input
		x = input.nextInt(); // Ex. 2.6: read first integer
		
		System.out.print("Enter second integer: "); // Ex. 2.6: prompt for input
		y = input.nextInt(); // Ex. 2.6: read second integer
		
		System.out.print("Enter third integer: "); // prompt for input
		z = input.nextInt(); // Ex. 2.6: read third integer
		
		result = x * y * z; // Ex. 2.6: calculate product o numbers
		
		System.out.printf("Product is %d%n", result);
		
		// Ex. 2.6: close created Scanner object resource 
		input.close();

	} // Ex. 2.6: end method main
} // Ex. 2.6: end class Program_Product

