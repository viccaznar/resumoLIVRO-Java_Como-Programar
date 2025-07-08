// Fig. 4.16: Mystery.java
package cap4_11JavaExercicios_App_Mystery3;

public class Program_Mystery3 {
	public static void main(String[] args) 
	{
		int row = 10;

		while (row >= 1) // while row is greater than or equal to 1
		{
			int column = 1;

			while (column <= 10) 
			{
				System.out.print(row % 2 == 1 ? "<" : ">");
				++column; // increment column
			}

			--row;
			System.out.println();
		}
	}
} // end class Mystery3
