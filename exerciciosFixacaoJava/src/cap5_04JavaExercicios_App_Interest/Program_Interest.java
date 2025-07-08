// Fig. 5.2: Interest.java
// Compound interest calculations with for.
package cap5_04JavaExercicios_App_Interest;

import java.util.Locale;

public class Program_Interest 
{
	public static void main(String[] args) 
	{
		Locale.setDefault(Locale.US);
		
		double amount; // amount on deposit at end of each year
		double principal = 1000.00; // initial amount before interest
		double rate = 0.05; // interest rate
		
		// display headers
		System.out.printf("%s%20s%n", "Year", "Amount on deposit");
		
		// calculate amount on deposit for each of ten years
		for (int year = 1; year <= 10; ++year)
		{
			// calculate new amount for specified year
			amount = principal * Math.pow(1.0 + rate, year);
		
			// display the year and the amount
			System.out.printf("%4d%,20.2f%n", year, amount);
		}	
	}
} // end class Interest