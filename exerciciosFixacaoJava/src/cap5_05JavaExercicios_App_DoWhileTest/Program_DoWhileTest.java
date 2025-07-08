// Fig. 5.7: DoWhileTest.java
// do...while repetition statement.
package cap5_05JavaExercicios_App_DoWhileTest;

import java.util.Locale;

public class Program_DoWhileTest 
{
	public static void main(String[] args) 
	{
		Locale.setDefault(Locale.US);
		
		int counter = 1;
		
		do
		{
			System.out.printf("%d ", counter);
			++counter;
		} while (counter <= 10); // end do...while
		
		System.out.println();
	}
} // end class DoWhileTest