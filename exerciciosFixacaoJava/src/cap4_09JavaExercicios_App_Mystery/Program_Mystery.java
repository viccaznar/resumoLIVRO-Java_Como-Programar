// Fig. 4.16: Mystery.java
package cap4_09JavaExercicios_App_Mystery;

public class Program_Mystery {
	public static void main(String[] args) {
		
		int x = 1;
		int total = 0;
		
		while (x <= 10) // while x is less than or equal to 10
		{
			int y = x * x;
			System.out.println(y);
			total += y;
			++x; // increment x
		}

		System.out.printf("The sum is: %d%n", total);
	}
} // end class Calculate
