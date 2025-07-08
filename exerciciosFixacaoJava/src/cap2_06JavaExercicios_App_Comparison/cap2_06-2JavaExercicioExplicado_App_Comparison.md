There’s no semicolon (;) at the end of the first line of each if statement. Such a semicolon would result in a logic error at execution time. For example,
would actually be interpreted by Java as
where the semicolon on the line by itself—called the empty statement—is the statement
to execute if the condition in the if statement is true. When the empty statement executes,
no task is performed. The program then continues with the output statement, which always executes, regardless of whether the condition is true or false, because the output statement is not part of the if statement.
System.out.print("Enter second integer: "); // prompt
number2 = input.nextInt(); // read second number from user
if (number1 == number2)
 System.out.printf("%d == %d%n", number1, number2);
Common Programming Error 2.9
Confusing the equality operator, ==, with the assignment operator, =, can cause a logic error or a compilation error. The equality operator should be read as “is equal to” and the
assignment operator as “gets” or “gets the value of.” To avoid confusion, some people read
the equality operator as “double equals” or “equals equals.”
Good Programming Practice 2.11
Place only one statement per line in a program for readability.
if (number1 == number2); // logic error
 System.out.printf("%d == %d%n", number1, number2);
if (number1 == number2)
 ; // empty statement
System.out.printf("%d == %d%n", number1, number2);
58 Chapter 2 Introduction to Java Applications; Input/Output and Operators
White space
Note the use of white space in Fig. 2.15. Recall that the compiler normally ignores white
space. So, statements may be split over several lines and may be spaced according to your
preferences without affecting a program’s meaning. It’s incorrect to split identifiers and
strings. Ideally, statements should be kept small, but this is not always possible.
Operators Discussed So Far
Figure 2.16 shows the operators discussed so far in decreasing order of precedence. All but
the assignment operator, =, associate from left to right. The assignment operator, =, associates from right to left. An assignment expression’s value is whatever was assigned to the variable on the = operator’s left side—for example, the value of the expression x = 7 is 7. So an
expression like x = y = 0 is evaluated as if it had been written as x = (y = 0), which first
assigns the value 0 to variable y, then assigns the result of that assignment, 0, to x.
2.9 Wrap-Up
In this chapter, you learned many important features of Java, including displaying data on
the screen in a Command Prompt, inputting data from the keyboard, performing calculations and making decisions. The applications presented here introduced you to many basic
programming concepts. As you’ll see in Chapter 3, Java applications typically contain just
a few lines of code in method main—these statements normally create the objects that perform the work of the application. In Chapter 3, you’ll learn how to implement your own
classes and use objects of those classes in applications.
Error-Prevention Tip 2.5
A lengthy statement can be spread over several lines. If a single statement must be split
across lines, choose natural breaking points, such as after a comma in a comma-separated
list, or after an operator in a lengthy expression. If a statement is split across two or more
lines, indent all subsequent lines until the end of the statement.
Operators Associativity Type
* / % left to right multiplicative
+ - left to right additive
< <= > >= left to right relational
== != left to right equality
= right to left assignment
Fig. 2.16 | Precedence and associativity of operators discussed.

Good Programming Practice 2.12
When writing expressions containing many operators, refer to the operator precedence
chart (Appendix A). Confirm that the operations in the expression are performed in the
order you expect. If, in a complex expression, you’re uncertain about the order of evaluation, use parentheses to force the order, exactly as you’d do in algebraic expressions.