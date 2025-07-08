Class Names and Identifiers
By convention, class names begin with a capital letter and capitalize the first letter of each
word they include (e.g., SampleClassName). A class name is an identifier—a series of characters consisting of letters, digits, underscores (_) and dollar signs ($) that does not begin
with a digit and does not contain spaces. Some valid identifiers are Welcome1, $value,
_value, m_inputField1 and button7. The name 7button is not a valid identifier because
it begins with a digit, and the name input field is not a valid identifier because it contains
a space. Normally, an identifier that does not begin with a capital letter is not a class name.
Good Programming Practice 2.1
Some organizations require that every program begin with a comment that states the purpose of the program and the author, date and time when the program was last modified.
Error-Prevention Tip 2.1
As you write new programs or modify existing ones, keep your comments up-to-date with
the code. Programmers will often need to make changes to existing code to fix errors or to
enhance capabilities. Updating your comments helps ensure that they accurately reflect
what the code does. This will make your programs easier to understand and modify in the
future. Programmers using or updating code with out-of-date comments might make incorrect assumptions about the code that could lead to errors or even security breaches.
Good Programming Practice 2.2
Use blank lines and spaces to enhance program readability.
public class Welcome1
Common Programming Error 2.2
A compilation error occurs if a public class’s filename is not exactly same name as the class
(in terms of both spelling and capitalization) followed by the .java extension.
38 Chapter 2 Introduction to Java Applications; Input/Output and Operators
Java is case sensitive—uppercase and lowercase letters are distinct—so value and Value
are different (but both valid) identifiers.
Class Body
A left brace (as in line 5), {, begins the body of every class declaration. A corresponding
right brace (at line 11), }, must end each class declaration. Lines 6–10 are indented.
Declaring a Method
Line 6
is an end-of-line comment indicating the purpose of lines 7–10 of the program. Line 7
is the starting point of every Java application. The parentheses after the identifier main indicate that it’s a program building block called a method. Java class declarations normally
contain one or more methods. For a Java application, one of the methods must be called
main and must be defined as shown in line 7; otherwise, the Java Virtual Machine (JVM)
will not execute the application. Methods perform tasks and can return information when
they complete their tasks. We’ll explain the purpose of keyword static in Section 3.2.5.
Keyword void indicates that this method will not return any information. Later, we’ll see
how a method can return information. For now, simply mimic main’s first line in your
Java applications. In line 7, the String[] args in parentheses is a required part of the
method main’s declaration—we discuss this in Chapter 7.
The left brace in line 8 begins the body of the method declaration. A corresponding
right brace must end it (line 10). Line 9 in the method body is indented between the
braces.

Good Programming Practice 2.5
Indent the entire body of each method declaration one “level” between the braces that define the body of the method. This makes the structure of the method stand out and makes
the method declaration easier to read.