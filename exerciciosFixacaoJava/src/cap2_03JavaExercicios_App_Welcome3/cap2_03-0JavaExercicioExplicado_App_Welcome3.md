Displaying Multiple Lines of Text with a Single Statement
A single statement can display multiple lines by using newline characters, which indicate
to System.out’s print and println methods when to position the output cursor at the
beginning of the next line in the command window. Like blank lines, space characters and
tab characters, newline characters are whitespace characters. The program in Fig. 2.4 outputs four lines of text, using newline characters to determine when to begin each new line.
Most of the program is identical to those in Figs. 2.1 and 2.3. 

Line 9
displays four lines of text in the command window. Normally, the characters in a string are
displayed exactly as they appear in the double quotes. However, the paired characters \ and
n (repeated three times in the statement) do not appear on the screen. The backslash (\) is
an escape character, which has special meaning to System.out’s print and println methods. When a backslash appears in a string, Java combines it with the next character to form
an escape sequence—\n represents the newline character. When a newline character appears
in a string being output with System.out, the newline character causes the screen’s output
cursor to move to the beginning of the next line in the command window.
Figure 2.5 lists several common escape sequences and describes how they affect the display of characters in the command window. For the complete list of escape sequences, visit
2.4 Displaying Text with printf
The System.out.printf method (f means “formatted”) displays formatted data.
Figure 2.6 uses this method to output on two lines the strings "Welcome to" and "Java
Programming!".
9 System.out.println("Welcome to Java Programming!");
10 } // end method main
11 } // end class Welcome3
Welcome
to
Java
Programming!
System.out.println("Welcome\nto\nJava\nProgramming!");
http://docs.oracle.com/javase/specs/jls/se7/html/
 jls-3.html#jls-3.10.6
Escape
sequence Description
\n Newline. Position the screen cursor at the beginning of the next line.
\t Horizontal tab. Move the screen cursor to the next tab stop.
\r Carriage return. Position the screen cursor at the beginning of the current
line—do not advance to the next line. Any characters output after the carriage return overwrite the characters previously output on that line.
\\ Backslash. Used to print a backslash character.
\" Double quote. Used to print a double-quote character. For example,
 System.out.println("\"in quotes\"");
displays "in quotes".