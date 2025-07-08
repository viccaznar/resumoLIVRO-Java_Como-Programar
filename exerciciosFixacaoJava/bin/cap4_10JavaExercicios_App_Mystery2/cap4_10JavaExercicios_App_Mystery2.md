3.2 Instance Variables, set Methods and get Methods
In this section, you’ll create two classes—Account (Fig. 3.1) and AccountTest (Fig. 3.2).
Class AccountTest is an application class in which the main method will create and use an
Account object to demonstrate class Account’s capabilities.
3.2.1 Account Class with an Instance Variable, a set Method and a get
Method
Different accounts typically have different names. For this reason, class Account (Fig. 3.1)
contains a name instance variable. A class’s instance variables maintain data for each object
(that is, each instance) of the class. Later in the chapter we’ll add an instance variable named
balance so we can keep track of how much money is in the account. Class Account contains two methods—method setName stores a name in an Account object and method
getName obtains a name from an Account object. 

Class Declaration
The class declaration begins in line 5:
The keyword public (which Chapter 8 explains in detail) is an access modifier. For now,
we’ll simply declare every class public. Each public class declaration must be stored in a file
having the same name as the class and ending with the .java filename extension; otherwise,
1 // Fig. 3.1: Account.java
2 // Account class that contains a name instance variable
3 // and methods to set and get its value.
4
5 public class Account
6 {
7
8
9
10
11
12
13
14
15
16
17
18
19
20 } // end class Account
Fig. 3.1 | Account class that contains a name instance variable and methods to set and get its
value.
public class Account
private String name; // instance variable
// method to set the name in the object
public void setName(String name)
{
 this.name = name; // store the name
}
// method to retrieve the name from the object
public String getName()
{
 return name; // return value of name to caller
}
72 Chapter 3 Introduction to Classes, Objects, Methods and Strings
a compilation error will occur. Thus, public classes Account and AccountTest (Fig. 3.2)
must be declared in the separate files Account.java and AccountTest.java, respectively.
Every class declaration contains the keyword class followed immediately by the
class’s name—in this case, Account. Every class’s body is enclosed in a pair of left and right
braces as in lines 6 and 20 of Fig. 3.1.
Identifiers and Camel Case Naming
Class names, method names and variable names are all identifiers and by convention all use
the same camel case naming scheme we discussed in Chapter 2. Also by convention, class
names begin with an initial uppercase letter, and method names and variable names begin
with an initial lowercase letter.
Instance Variable name
Recall from Section 1.5 that an object has attributes, implemented as instance variables
and carried with it throughout its lifetime. Instance variables exist before methods are
called on an object, while the methods are executing and after the methods complete execution. Each object (instance) of the class has its own copy of the class’s instance variables.
A class normally contains one or more methods that manipulate the instance variables belonging to particular objects of the class.
Instance variables are declared inside a class declaration but outside the bodies of the
class’s methods. Line 7
declares instance variable name of type String outside the bodies of methods setName (lines
10–13) and getName (lines 16–19). String variables can hold character string values such
as "Jane Green". If there are many Account objects, each has its own name. Because name
is an instance variable, it can be manipulated by each of the class’s methods.
Access Modifiers public and private
Most instance-variable declarations are preceded with the keyword private (as in line 7).
Like public, private is an access modifier. Variables or methods declared with access modifier private are accessible only to methods of the class in which they’re declared. So, the
variable name can be used only in each Account object’s methods (setName and getName in
this case). You’ll soon see that this presents powerful software engineering opportunities.
setName Method of Class Account
Let’s walk through the code of setName’s method declaration (lines 10–13):
private String name; // instance variable
Good Programming Practice 3.1
We prefer to list a class’s instance variables first in the class’s body, so that you see the names
and types of the variables before they’re used in the class’s methods. You can list the class’s
instance variables anywhere in the class outside its method declarations, but scattering the
instance variables can lead to hard-to-read code.