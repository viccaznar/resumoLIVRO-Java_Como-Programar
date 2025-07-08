2.5.7 Prompting for and Inputting a Second int
Line 20
prompts the user to enter the second integer. Line 21
reads the second integer and assigns it to variable number2.
2.5.8 Using Variables in a Calculation
Line 23
is an assignment statement that calculates the sum of the variables number1 and number2
then assigns the result to variable sum by using the assignment operator, =. The statement
is read as “sum gets the value of number1 + number2.” When the program encounters the
addition operation, it performs the calculation using the values stored in the variables
number1 and number2. In the preceding statement, the addition operator is a binary operator—its two operands are the variables number1 and number2. Portions of statements that
contain calculations are called expressions. In fact, an expression is any portion of a statement that has a value associated with it. For example, the value of the expression number1
+ number2 is the sum of the numbers. Similarly, the value of the expression input.nextInt() is the integer typed by the user.
2.5.9 Displaying the Result of the Calculation
After the calculation has been performed, line 25
uses method System.out.printf to display the sum. The format specifier %d is a placeholder for an int value (in this case the value of sum)—the letter d stands for “decimal integer.”
The remaining characters in the format string are all fixed text. So, method printf displays "Sum is ", followed by the value of sum (in the position of the %d format specifier)
and a newline.
Calculations can also be performed inside printf statements. We could have combined the statements at lines 23 and 25 into the statement
The parentheses around the expression number1 + number2 are optional—they’re included
to emphasize that the value of the entire expression is output in the position of the %d format specifier. Such parentheses are said to be redundant.
2.5.10 Java API Documentation
For each new Java API class we use, we indicate the package in which it’s located. This
information helps you locate descriptions of each package and class in the Java API documentation. A web-based version of this documentation can be found at
System.out.print("Enter second integer: "); // prompt
number2 = input.nextInt(); // read second number from user
sum = number1 + number2; // add numbers then store total in sum
System.out.printf("Sum is %d%n", sum); // display sum
System.out.printf("Sum is %d%n", (number1 + number2));
http://docs.oracle.com/javase/7/docs/api/index.html
50 Chapter 2 Introduction to Java Applications; Input/Output and Operators
You can download it from the Additional Resources section at
Appendix F shows how to use this documentation