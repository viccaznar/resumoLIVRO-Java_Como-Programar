// Fig. 5.1: WhileCounter.java
package cap5_01JavaExercicios_App_WhileCounter;

public class Program_WhileCounter 
{
	public static void main(String[] args) 
	{
		int counter = 1; // declare and initialize control variable

		while (counter <= 10) // Loop-continuation condition
		{
			System.out.printf("%d ", counter);
				++counter; // increment control variable
		}

			System.out.println();
	}
} // end class WhileCounter