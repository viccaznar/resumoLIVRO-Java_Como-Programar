// Fig. 4.18: Calculate.java
// Calculate the sum of he integers from 1 to 10.
package cap4_08JavaExercicios_App_Calculate;

public class Program_Calculate {
	public static void main(String[] args) 
	{
		int sum = 0;
		int x = 1;

		while (x <= 10) // while x is less than or equal to 10
		{
			sum += x; // add x to sum
			++x; // increment x
		}
		
		System.out.printf("The sum is: %d%n", sum);		
	}
} // end class Calculate
