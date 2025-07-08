package cap4_02JavaExercicios_App_StudentTest;

// Fig. 4.5: StudentTest.java
// Create and test Student objects

import java.util.Locale;

import cap4_01JavaExercicios_Class_Student.Student;

public class StudentTest
{
	public static void main(String[] args)
	{
		Locale.setDefault(Locale.US);
		
		Student account1 = new Student("Jane Green", 93.5);
		Student account2 = new Student("John Blue", 72.75);
		
		System.out.printf("%s's letter grade is: %s%n",
				account1.getName(), account1.getLetterGrade());
		System.out.printf("%s's letter grade is: %s%n",
				account2.getName(), account2.getLetterGrade());
	}
} // end class StudentTest