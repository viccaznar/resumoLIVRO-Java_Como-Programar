2.5 Another Application: Adding Integers
Our next application reads (or inputs) two integers (whole numbers, such as –22, 7, 0 and
1024) typed by a user at the keyboard, computes their sum and displays it. This program
must keep track of the numbers supplied by the user for the calculation later in the program.
Programs remember numbers and other data in the computer’s memory and access that data
through program elements called variables. The program of Fig. 2.7 demonstrates these concepts. In the sample output, we use bold text to identify the user’s input (i.e., 45 and 72). As
in prior programs, Lines 1–2 state the figure number, filename and purpose of the program. 

2.5.1 import Declarations
A great strength of Java is its rich set of predefined classes that you can reuse rather than
“reinventing the wheel.” These classes are grouped into packages—named groups of related
1 // Fig. 2.7: Addition.java
2 // Addition program that inputs two numbers then displays their sum.
3
4
5 public class Addition
6 {
7 // main method begins execution of Java application
8 public static void main(String[] args)
9 {
10
11
12
13
14
15
16
17 System.out.print("Enter first integer: "); // prompt
18
19
20 System.out.print("Enter second integer: "); // prompt
21
22
23
24
25
26 } // end method main
27 } // end class Addition
Enter first integer: 45
Enter second integer: 72
Sum is 117
Fig. 2.7 | Addition program that inputs two numbers then displays their sum.
import java.util.Scanner; // program uses class Scanner
// create a Scanner to obtain input from the command window
Scanner input = new Scanner(System.in);
int number1; // first number to add
int number2; // second number to add
int sum; // sum of number1 and number2
number1 = input.nextInt(); // read first number from user
number2 = input.nextInt(); // read second number from user
sum = number1 + number2; // add numbers, then store total in sum
System.out.printf("Sum is %d%n", sum); // display sum
46 Chapter 2 Introduction to Java Applications; Input/Output and Operators
classes—and are collectively referred to as the Java class library, or the Java Application
Programming Interface (Java API). Line 3
is an import declaration that helps the compiler locate a class that’s used in this program.
It indicates that the program uses the predefined Scanner class (discussed shortly) from
the package named java.util. The compiler then ensures that you use the class correctly.
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