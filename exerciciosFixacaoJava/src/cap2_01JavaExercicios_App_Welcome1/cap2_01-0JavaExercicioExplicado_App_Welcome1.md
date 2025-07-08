Commenting Your Programs
We insert comments to document programs and improve their readability. The Java compiler ignores comments, so they do not cause the computer to perform any action when the
program is run.
By convention, we begin every program with a comment indicating the figure number
and filename. The comment in line 1
begins with //, indicating that it’s an end-of-line comment—it terminates at the end of
the line on which the // appears. An end-of-line comment need not begin a line; it also
can begin in the middle of a line and continue until the end (as in lines 6, 10 and 11). Line
2
by our convention, is a comment that describes the purpose of the program.
Java also has traditional comments, which can be spread over several lines as in
These begin and end with delimiters, /* and */. The compiler ignores all text between the
delimiters. Java incorporated traditional comments and end-of-line comments from the C
and C++ programming languages, respectively. We prefer using // comments.
Java provides comments of a third type—Javadoc comments. These are delimited by
/** and */. The compiler ignores all text between the delimiters. Javadoc comments
enable you to embed program documentation directly in your programs. Such comments
are the preferred Java documenting format in industry. The javadoc utility program (part
of the JDK) reads Javadoc comments and uses them to prepare program documentation
in HTML format. We demonstrate Javadoc comments and the javadoc utility in online
Appendix G, Creating Documentation with javadoc.
Welcome to Java Programming!
// Fig. 2.1: Welcome1.java
// Text-printing program.
/* This is a traditional comment. It
 can be split over multiple lines */
Common Programming Error 2.1
Forgetting one of the delimiters of a traditional or Javadoc comment is a syntax error. A
syntax error occurs when the compiler encounters code that violates Java’s language rules
(i.e., its syntax). These rules are similar to a natural language’s grammar rules specifying
sentence structure. Syntax errors are also called compiler errors, compile-time errors or
compilation errors, because the compiler detects them when compiling the program.
When a syntax error is encountered, the compiler issues an error message. You must eliminate all compilation errors before your program will compile properly.
Fig. 2.1 | Text-printing program. (Part 2 of 2.)
2.2 Your First Program in Java: Printing a Line of Text 37
Using Blank Lines
Line 3 is a blank line. Blank lines, space characters and tabs make programs easier to read.
Together, they’re known as white space (or whitespace). The compiler ignores white space.
Declaring a Class
Line 4
begins a class declaration for class Welcome1. Every Java program consists of at least one
class that you (the programmer) define. The class keyword introduces a class declaration
and is immediately followed by the class name (Welcome1). Keywords (sometimes called
reserved words) are reserved for use by Java and are always spelled with all lowercase letters. The complete list of keywords is shown in Appendix C.
In Chapters 2–7, every class we define begins with the public keyword. For now, we
simply require public. You’ll learn more about public and non-public classes in Chapter 8.
Filename for a public Class
A public class must be placed in a file that has a filename of the form ClassName.java, so
class Welcome1 is stored in the file Welcome1.java.
