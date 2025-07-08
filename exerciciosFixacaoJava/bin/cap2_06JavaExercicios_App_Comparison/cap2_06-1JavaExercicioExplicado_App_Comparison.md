The declaration of class Comparison begins at line 6
The class’s main method (lines 9–40) begins the execution of the program. Line 12
declares Scanner variable input and assigns it a Scanner that inputs data from the standard input (i.e., the keyboard).
Lines 14–15
declare the int variables used to store the values input from the user.
Lines 17–18
31
32
33
34
35
36
37
38
39
40 } // end method main
41 } // end class Comparison
Enter first integer: 777
Enter second integer: 777
777 == 777
777 <= 777
777 >= 777
Enter first integer: 1000
Enter second integer: 2000
1000 != 2000
1000 < 2000
1000 <= 2000
Enter first integer: 2000
Enter second integer: 1000
2000 != 1000
2000 > 1000
2000 >= 1000
public class Comparison
Scanner input = new Scanner(System.in);
int number1; // first number to compare
int number2; // second number to compare
System.out.print("Enter first integer: "); // prompt
number1 = input.nextInt(); // read first number from user
Fig. 2.15 | Compare integers using if statements, relational operators and equality operators.
(Part 2 of 2.)
if (number1 > number2)
 System.out.printf("%d > %d%n", number1, number2);
if (number1 <= number2)
 System.out.printf("%d <= %d%n", number1, number2);
if (number1 >= number2)
 System.out.printf("%d >= %d%n", number1, number2);
2.8 Decision Making: Equality and Relational Operators 57
prompt the user to enter the first integer and input the value, respectively. The value is
stored in variable number1.
Lines 20–21
prompt the user to enter the second integer and input the value, respectively. The value is
stored in variable number2.
Lines 23–24
compare the values of number1 and number2 to determine whether they’re equal. An if
statement always begins with keyword if, followed by a condition in parentheses. An if
statement expects one statement in its body, but may contain multiple statements if
they’re enclosed in a set of braces ({}). The indentation of the body statement shown here
is not required, but it improves the program’s readability by emphasizing that the statement in line 24 is part of the if statement that begins at line 23. Line 24 executes only if
the numbers stored in variables number1 and number2 are equal (i.e., the condition is true).
The if statements in lines 26–27, 29–30, 32–33, 35–36 and 38–39 compare number1 and
number2 using the operators !=, <, >, <= and >=, respectively. If the condition in one or
more of the if statements is true, the corresponding body statement executes.

Common Programming Error 2.9
Confusing the equality operator, ==, with the assignment operator, =, can cause a logic error or a compilation error. The equality operator should be read as “is equal to” and the
assignment operator as “gets” or “gets the value of.” To avoid confusion, some people read
the equality operator as “double equals” or “equals equals.”
Good Programming Practice 2.11
Place only one statement per line in a program for readability.