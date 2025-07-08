// Fig. 5.19: LogicalOperators.java
// Logical Operators.
package cap5_11JavaExercicios_App_LogicalOperators;

public class Program_LogicalOperators 
{
	public static void main(String[] args)
	{	
		// create truth table for && (conditional AND) operator
		System.out.printf("%s%n%s: b%n%s%: b%n%s%: b%n%s%: b%n%n%",
				"Conditional AND (&&)", "false && false", (false && false) ,
				"false && true", (false && true) ,
				"true && false", (true && false) ,
				"true && true", (true && true) );
		
	}	
} // end class LogicalOperators