2.8 Decision Making: Equality and Relational Operators
A condition is an expression that can be true or false. This section introduces Java’s if
selection statement, which allows a program to make a decision based on a condition’s
value. For example, the condition “grade is greater than or equal to 60” determines whether a student passed a test. If the condition in an if statement is true, the body of the if
statement executes. If the condition is false, the body does not execute. We’ll see an example shortly.
Conditions in if statements can be formed by using the equality operators (== and
!=) and relational operators (>, <, >= and <=) summarized in Fig. 2.14. Both equality operators have the same level of precedence, which is lower than that of the relational operators.
The equality operators associate from left to right. The relational operators all have the
same level of precedence and also associate from left to right.
Fig. 2.13 | Order in which a second-degree polynomial is evaluated.
Algebraic
operator
Java equality or
relational operator
Sample Java
condition Meaning of Java condition
Equality operators
= == x == y x is equal to y
¹ != x != y x is not equal to y

Algebraic
operator
Java equality or
relational operator
Sample Java
condition Meaning of Java condition
Relational operators
> > x > y x is greater than y
< < x < y x is less than y
≥ >= x >= y x is greater than or equal to y
≤ <= x <= y x is less than or equal to y

Figure 2.15 uses six if statements to compare two integers input by the user. If the
condition in any of these if statements is true, the statement associated with that if statement executes; otherwise, the statement is skipped. We use a Scanner to input the integers
from the user and store them in variables number1 and number2. The program compares
the numbers and displays the results of the comparisons that are true.