2.4 Displaying Text with printf
The System.out.printf method (f means “formatted”) displays formatted data.
Figure 2.6 uses this method to output on two lines the strings "Welcome to" and "Java
Programming!". 

Lines 9–10
call method System.out.printf to display the program’s output. The method call specifies three arguments. When a method requires multiple arguments, they’re placed in a
comma-separated list. Calling a method is also referred to as invoking a method.
Lines 9–10 represent only one statement. Java allows large statements to be split over
many lines. We indent line 10 to indicate that it’s a continuation of line 9.

Common Programming Error 2.6
Splitting a statement in the middle of an identifier or a string is a syntax error.

Method printf’s first argument is a format string that may consist of fixed text and
format specifiers. Fixed text is output by printf just as it would be by print or println.
Each format specifier is a placeholder for a value and specifies the type of data to output.
Format specifiers also may include optional formatting information.
Format specifiers begin with a percent sign (%) followed by a character that represents
the data type. For example, the format specifier %s is a placeholder for a string. The format
string in line 9 specifies that printf should output two strings, each followed by a newline
character. At the first format specifier’s position, printf substitutes the value of the first
argument after the format string. At each subsequent format specifier’s position, printf
substitutes the value of the next argument. So this example substitutes "Welcome to" for
the first %s and "Java Programming!" for the second %s. The output shows that two lines
of text are displayed on two lines.
Notice that instead of using the escape sequence \n, we used the %n format specifier,
which is a line separator that’s portable across operating systems. You cannot use %n in the

argument to System.out.print or System.out.println; however, the line separator
output by System.out.println after it displays its argument is portable across operating
systems. Online Appendix I presents more details of formatting output with printf.