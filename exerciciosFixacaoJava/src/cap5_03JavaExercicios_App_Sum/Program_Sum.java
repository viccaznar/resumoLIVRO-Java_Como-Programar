// Fig. 5.2: Sum.java
// Summing integers with the for statement
package cap5_03JavaExercicios_App_Sum;

public class Program_Sum 
{
	public static void main(String[] args) 
	{
		int total = 0;
		
		// total even integers from 2 through 20
		for (int number = 2; number <= 20; number += 2)
			total += number;
		
		System.out.printf("Sum is %d%n", total);
			
		System.out.println();
				
	}
} // end class Sum