

// Fig. 4.8: ClassAverage.java
// 4.8.1: Solving the class-average problem using counter-controlled repetition.
package cap4_03JavaExercicios_App_Avarage;

import java.util.Locale;
import java.util.Scanner; // 4.8.2: program uses class Scanner

public class ClassAverage
{
	public static void main(String[] args)
	{
		Locale.setDefault(Locale.US);
		// 4.8.3: create Scanner to obtain input from command window
		Scanner input = new Scanner(System.in);
		
		// 4.8.4: initialization phase
		int total = 0; // initialize sum of grades entered by the user
		int gradeCounter = 0; // initialize # of grade to be entered next
		
		// processing phase
		// prompt for input and read grade from user
		System.out.print("Enter grade or -1 to quit: ");
		int grade = input.nextInt();
		
		// 4.8.5: processing phase uses counter-controlled repetition
		while (grade != -1) // 4.8.6: loop 10 times
		{
			total = total + grade; // add grade to total
			gradeCounter = gradeCounter + 1; // increment counter
			
			// prompt for input and red next grade from user
			System.out.print("Enter grade or -1 to quit: ");
			grade = input.nextInt();
		}
		
		// 4.8.11: termination phase
		// if user entered at least one grade...
		if (gradeCounter != 0)
		{
			// user number with decimal point to calculate average grades
			double average = (double) total / gradeCounter;
			
			// display total and average (with two digits of precision)
			System.out.printf("%nTotal o the %d grades enteres is %d%n",
					gradeCounter, total);
			System.out.printf("Class average is %.2f%n", average);
		}
		else
			System.out.println("No grades were entered");		
		
		// 4.8.12: close Scanner object resource 
		input.close();
	}
}