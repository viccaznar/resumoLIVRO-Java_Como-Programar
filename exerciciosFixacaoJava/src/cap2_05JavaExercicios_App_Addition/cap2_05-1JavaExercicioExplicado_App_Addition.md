2.5.2 Declaring Class Addition
Line 5
begins the declaration of class Addition. The filename for this public class must be
Addition.java. Remember that the body of each class declaration starts with an opening
left brace (line 6) and ends with a closing right brace (line 27).
The application begins execution with the main method (lines 8–26). The left brace
(line 9) marks the beginning of method main’s body, and the corresponding right brace
(line 26) marks its end. Method main is indented one level in the body of class Addition,
and the code in the body of main is indented another level for readability.
2.5.3 Declaring and Creating a Scanner to Obtain User Input from the
Keyboard
A variable is a location in the computer’s memory where a value can be stored for use later
in a program. All Java variables must be declared with a name and a type before they can be
used. A variable’s name enables the program to access the value of the variable in memory. A
import java.util.Scanner; // program uses class Scanner
Common Programming Error 2.7
All import declarations must appear before the first class declaration in the file. Placing
an import declaration inside or after a class declaration is a syntax error.
Common Programming Error 2.8
Forgetting to include an import declaration for a class that must be imported results in a
compilation error containing a message such as “cannot find symbol.” When this occurs,
check that you provided the proper import declarations and that the names in them are
correct, including proper capitalization.
Software Engineering Observation 2.1
In each new Java version, the APIs typically contain new capabilities that fix bugs, improve
performance or offer better means for accomplishing tasks. The corresponding older versions
are no longer needed and should not be used. Such APIs are said to be deprecated and might
be removed from later Java versions.
 You’ll often encounter deprecated APIs when browsing the online API documentation.
The compiler will warn you when you compile code that uses deprecated APIs. If you compile
your code with javac using the command-line argument -deprecation, the compiler will
tell you which deprecated features you’re using. For each one, the online documentation
(http://docs.oracle.com/javase/7/docs/api/) indicates and typically links to the new
feature that replaces the deprecated one.
public class Addition
2.5 Another Application: Adding Integers 47
variable’s name can be any valid identifier—again, a series of characters consisting of letters,
digits, underscores (_) and dollar signs ($) that does not begin with a digit and does not contain spaces. A variable’s type specifies what kind of information is stored at that location in
memory. Like other statements, declaration statements end with a semicolon (;).
Line 11
is a variable declaration statement that specifies the name (input) and type (Scanner) of a
variable that’s used in this program. A Scanner enables a program to read data (e.g., numbers and strings) for use in a program. The data can come from many sources, such as the
user at the keyboard or a file on disk. Before using a Scanner, you must create it and specify the source of the data.
The = in line 11 indicates that Scanner variable input should be initialized (i.e., prepared for use in the program) in its declaration with the result of the expression to the right
of the equals sign—new Scanner(System.in). This expression uses the new keyword to
create a Scanner object that reads characters typed by the user at the keyboard. The standard input object, System.in, enables applications to read bytes of data typed by the user.