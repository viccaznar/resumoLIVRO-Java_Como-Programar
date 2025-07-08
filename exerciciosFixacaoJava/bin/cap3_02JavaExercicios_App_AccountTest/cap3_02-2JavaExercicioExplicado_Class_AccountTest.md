Displaying the Name That Was Entered by the User
Line 22 of Fig. 3.2 outputs a blank line. When the second call to method getName (line 26)
executes, the name entered by the user in line 20 is displayed. When the statement at lines
25–26 completes execution, the end of method main is reached, so the program terminates.
3.2.3 Compiling and Executing an App with Multiple Classes
You must compile the classes in Figs. 3.1 and 3.2 before you can execute the app. This is
the first time you’ve created an app with multiple classes. Class AccountTest has a main
method; class Account does not. To compile this app, first change to the directory that
contains the app’s source-code files. Next, type the command
to compile both classes at once. If the directory containing the app includes only this app’s
files, you can compile both classes with the command
The asterisk (*) in *.java indicates that all files in the current directory ending with the
filename extension “.java” should be compiled. If both classes compile correctly—that is,
no compilation errors are displayed—you can then run the app with the command
3.2.4 Account UML Class Diagram with an Instance Variable and set
and get Methods
We’ll often use UML class diagrams to summarize a class’s attributes and operations. In industry, UML diagrams help systems designers specify a system in a concise, graphical, programming-language-independent manner, before programmers implement the system in
a specific programming language. Figure 3.3 presents a UML class diagram for class Account of Fig. 3.1.
Top Compartment
In the UML, each class is modeled in a class diagram as a rectangle with three compartments. In this diagram the top compartment contains the class name Account centered horizontally in boldface type.

Chapter 3 Introduction to Classes, Objects, Methods and Strings
Middle Compartment
The middle compartment contains the class’s attribute name, which corresponds to the instance variable of the same name in Java. Instance variable name is private in Java, so the
UML class diagram lists a minus sign (–) access modifier before the attribute name. Following the attribute name are a colon and the attribute type, in this case String.
Bottom Compartment
The bottom compartment contains the class’s operations, setName and getName, which
correspond to the methods of the same names in Java. The UML models operations by
listing the operation name preceded by an access modifier, in this case + getName. This plus
sign (+) indicates that getName is a public operation in the UML (because it’s a public
method in Java). Operation getName does not have any parameters, so the parentheses following the operation name in the class diagram are empty, just as they are in the method’s
declaration in line 16 of Fig. 3.1. Operation setName, also a public operation, has a String
parameter called name.
Return Types
The UML indicates the return type of an operation by placing a colon and the return type
after the parentheses following the operation name. Account method getName (Fig. 3.1)
has a String return type. Method setName does not return a value (because it returns void
in Java), so the UML class diagram does not specify a return type after the parentheses of
this operation.
Parameters
The UML models a parameter a bit differently from Java by listing the parameter name,
followed by a colon and the parameter type in the parentheses after the operation name.
The UML has its own data types similar to those of Java, but for simplicity, we’ll use the
Java data types. Account method setName (Fig. 3.1) has a String parameter named name,
so Fig. 3.3 lists name : String between the parentheses following the method name. 