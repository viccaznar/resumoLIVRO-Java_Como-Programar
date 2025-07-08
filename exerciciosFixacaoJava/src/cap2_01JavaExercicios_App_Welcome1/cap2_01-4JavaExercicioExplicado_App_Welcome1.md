Compiling Your First Java Application
We’re now ready to compile and execute our program. We assume you’re using the Java
Development Kit’s command-line tools, not an IDE. To help you compile and run your
programs in an IDE, we provide online Dive Into® videos for the popular IDEs Eclipse,
NetBeans and IntelliJ IDEA. These are located on the book’s website:
To prepare to compile the program, open a command window and change to the
directory where the program is stored. Many operating systems use the command cd to
change directories. On Windows, for example,
changes to the fig02_01 directory. On UNIX/Linux/Max OS X, the command
changes to the fig02_01 directory. To compile the program, type
If the program contains no compilation errors, this command creates a new file called
Welcome1.class (known as the class file for Welcome1) containing the platform-independent Java bytecodes that represent our application. When we use the java command to
execute the application on a given platform, the JVM will translate these bytecodes into
instructions that are understood by the underlying operating system and hardware.
Each syntax-error message contains the filename and line number where the error
occurred. For example, Welcome1.java:6 indicates that an error occurred at line 6 in
Welcome1.java. The rest of the message provides information about the syntax error.
} // end class Welcome1
http://www.deitel.com/books/jhtp10
cd c:\examples\ch02\fig02_01
cd ~/examples/ch02/fig02_01
javac Welcome1.java
Common Programming Error 2.4
When using javac, if you receive a message such as “bad command or filename,” “javac:
command not found” or “'javac' is not recognized as an internal or external command, operable program or batch file,” then your Java software installation was not
completed properly. This indicates that the system’s PATH environment variable was not
set properly. Carefully review the installation instructions in the Before You Begin section
of this book. On some systems, after correcting the PATH, you may need to reboot your computer or open a new command window for these settings to take effect.
Common Programming Error 2.5
The compiler error message “class Welcome1 is public, should be declared in a file
named Welcome1.java” indicates that the filename does not match the name of the public class in the file or that you typed the class name incorrectly when compiling the class.
2.3 Modifying Your First Java Program 41
Executing the Welcome1 Application
The following instructions assume that the book’s examples are located in C:\examples
on Windows or in your user account’s Documents/examples folder on Linux/OS X. To
execute this program in a command window, change to the directory containing
Welcome1.java—C:\examples\ch02\fig02_01 on Microsoft Windows or ~/Documents/
examples/ch02/fig02_01 on Linux/OS X. Next, type
and press Enter. This command launches the JVM, which loads the Welcome1.class file.
The command omits the .class file-name extension; otherwise, the JVM will not execute
the program. The JVM calls class Welcome1’s main method. Next, the statement at line 9
of main displays "Welcome to Java Programming!". Figure 2.2 shows the program executing in a Microsoft Windows Command Prompt window. [Note: Many environments show
command windows with black backgrounds and white text. We adjusted these settings to
make our screen captures more readable.]
2.3 Modifying Your First Java Program
In this section, we modify the example in Fig. 2.1 to print text on one line by using multiple statements and to print text on several lines by using a single statement.
Displaying a Single Line of Text with Multiple Statements
Welcome to Java Programming! can be displayed several ways. Class Welcome2, shown in
Fig. 2.3, uses two statements (lines 9–10) to produce the output shown in Fig. 2.1. [Note:
From this point forward, we highlight with a yellow background the new and key features
in each code listing, as we’ve done for lines 9–10.]
The program is similar to Fig. 2.1, so we discuss only the changes here. Line 2
java Welcome1
Error-Prevention Tip 2.4
When attempting to run a Java program, if you receive a message such as “Exception in
thread "main" java.lang.NoClassDefFoundError: Welcome1,” your CLASSPATH environment variable has not been set properly. Please carefully review the installation instructions in the Before You Begin section of this book. On some systems, you may need to
reboot your computer or open a new command window after configuring the CLASSPATH.