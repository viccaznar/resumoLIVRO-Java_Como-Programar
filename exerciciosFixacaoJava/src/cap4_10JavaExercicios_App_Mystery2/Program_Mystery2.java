// Fig. 4.16: Mystery.java
package cap4_10JavaExercicios_App_Mystery2;

public class Program_Mystery2 
{
	public static void main(String[] args) 
	{
		int count = 1;

		while (count <= 10) // while x is less than or equal to 10
		{
			System.out.println(count % 2 == 1 ? "****" : "+++++++++++");
			++count; // increment count
		}
	}
} // end class Mystery 2
