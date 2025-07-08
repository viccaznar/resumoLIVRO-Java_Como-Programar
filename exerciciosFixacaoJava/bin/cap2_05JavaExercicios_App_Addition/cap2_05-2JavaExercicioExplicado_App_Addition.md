2.5.4 Declaring Variables to Store Integers
The variable declaration statements in lines 13–15
declare that variables number1, number2 and sum hold data of type int—they can hold integer values (whole numbers such as 72, –1127 and 0). These variables are not yet initialized. The range of values for an int is –2,147,483,648 to +2,147,483,647. [Note: The int
values you use in a program may not contain commas.]
Some other types of data are float and double, for holding real numbers, and char,
for holding character data. Real numbers contain decimal points, such as in 3.4, 0.0 and
–11.19. Variables of type char represent individual characters, such as an uppercase letter
(e.g., A), a digit (e.g., 7), a special character (e.g., * or %) or an escape sequence (e.g., the
tab character, \t). The types int, float, double and char are called primitive types.
Primitive-type names are keywords and must appear in all lowercase letters. Appendix D
summarizes the characteristics of the eight primitive types (boolean, byte, char, short,
int, long, float and double).
Several variables of the same type may be declared in a single declaration with the variable names separated by commas (i.e., a comma-separated list of variable names). For
example, lines 13–15 can also be written as:
Scanner input = new Scanner(System.in);
int number1; // first number to add
int number2; // second number to add
int sum; // sum of number1 and number2
int number1, // first number to add
 number2, // second number to add
 sum; // sum of number1 and number2
Good Programming Practice 2.7
Declare each variable in its own declaration. This formThis format allows a descriptive comment
to be inserted next to each variable being declared. 

Good Programming Practice 2.8
Choosing meaningful variable names helps a program to be self-documenting (i.e., one
can understand the program simply by reading it rather than by reading associated documentation or creating and viewing an excessive number of comments).
Good Programming Practice 2.9
By convention, variable-name identifiers begin with a lowercase letter, and every word in
the name after the first word begins with a capital letter. For example, variable-name identifier firstNumber starts its second word, Number, with a capital N. This naming convention is known as camel case, because the uppercase letters stand out like a camel’s humps.