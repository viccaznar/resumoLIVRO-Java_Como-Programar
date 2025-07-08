2.5.5 Prompting the User for Input
Line 17
uses System.out.print to display the message "Enter first integer: ". This message is
called a prompt because it directs the user to take a specific action. We use method print
here rather than println so that the user’s input appears on the same line as the prompt.
Recall from Section 2.2 that identifiers starting with capital letters typically represent class
names. Class System is part of package java.lang. Notice that class System is not imported with an import declaration at the beginning of the program.
2.5.6 Obtaining an int as Input from the User
Line 18
uses Scanner object input’s nextInt method to obtain an integer from the user at the keyboard. At this point the program waits for the user to type the number and press the Enter
key to submit the number to the program.
Our program assumes that the user enters a valid integer value. If not, a runtime logic
error will occur and the program will terminate. Chapter 11, Exception Handling: A
Deeper Look, discusses how to make your programs more robust by enabling them to
handle such errors. This is also known as making your program fault tolerant.
In line 18, we place the result of the call to method nextInt (an int value) in variable
number1 by using the assignment operator, =. The statement is read as “number1 gets the
value of input.nextInt().” Operator = is called a binary operator, because it has two
operands—number1 and the result of the method call input.nextInt(). This statement
is called an assignment statement, because it assigns a value to a variable. Everything to the
right of the assignment operator, =, is always evaluated before the assignment is performed.
Good Programming Practice 2.8
Choosing meaningful variable names helps a program to be self-documenting (i.e., one
can understand the program simply by reading it rather than by reading associated documentation or creating and viewing an excessive number of comments).
Good Programming Practice 2.9
By convention, variable-name identifiers begin with a lowercase letter, and every word in
the name after the first word begins with a capital letter. For example, variable-name identifier firstNumber starts its second word, Number, with a capital N. This naming convention is known as camel case, because the uppercase letters stand out like a camel’s humps.
System.out.print("Enter first integer: "); // prompt
Software Engineering Observation 2.2
By default, package java.lang is imported in every Java program; thus, classes in
java.lang are the only ones in the Java API that do not require an import declaration.
number1 = input.nextInt(); // read first number from user
Good Programming Practice 2.10
Place spaces on either side of a binary operator for readability