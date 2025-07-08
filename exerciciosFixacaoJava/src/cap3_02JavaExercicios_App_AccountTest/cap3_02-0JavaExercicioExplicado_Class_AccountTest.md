3.2.2 AccountTest Class That Creates and Uses an Object of Class
Account
Next, we’d like to use class Account in an app and call each of its methods. A class that
contains a main method begins the execution of a Java app. Class Account cannot execute
by itself because it does not contain a main method—if you type java Account in the command window, you’ll get an error indicating “Main method not found in class Account.”
To fix this problem, you must either declare a separate class that contains a main method
or place a main method in class Account.
Driver Class AccountTest
To help you prepare for the larger programs you’ll encounter later in this book and in industry, we use a separate class AccountTest (Fig. 3.2) containing method main to test class
Account. Once main begins executing, it may call other methods in this and other classes;
those may, in turn, call other methods, and so on. Class AccountTest’s main method creates one Account object and calls its getName and setName methods. Such a class is sometimes called a driver class—just as a Person object drives a Car object by telling it what to
do (go faster, go slower, turn left, turn right, etc.), class AccountTest drives an Account
object, telling it what to do by calling its methods. 

Scanner Object for Receiving Input from the User
Line 10 creates a Scanner object named input for inputting the name from the user. Line
19 prompts the user to enter a name. Line 20 uses the Scanner object’s nextLine method to
read the name from the user and assign it to the local variable theName. You type the name
and press Enter to submit it to the program. Pressing Enter inserts a newline character after
the characters you typed. Method nextLine reads characters (including white-space characters, such as the blank in "Jane Green") until it encounters the newline, then returns a
String containing the characters up to, but not including, the newline, which is discarded.
Class Scanner provides various other input methods, as you’ll see throughout the
book. A method similar to nextLine—named next—reads the next word. When you press
Enter after typing some text, method next reads characters until it encounters a white-space
character (such as a space, tab or newline), then returns a String containing the characters
up to, but not including, the white-space character, which is discarded. All information
after the first white-space character is not lost—it can be read by subsequent statements that
call the Scanner’s methods later in the program.
Instantiating an Object—Keyword new and Constructors
Line 13 creates an Account object and assigns it to variable myAccount of type Account.
Variable myAccount is initialized with the result of the class instance creation expression
new Account(). Keyword new creates a new object of the specified class—in this case, Account. The parentheses to the right of Account are required. As you’ll learn in Section 3.4,
those parentheses in combination with a class name represent a call to a constructor, which
is similar to a method but is called implicitly by the new operator to initialize an object’s
instance variables when the object is created. In Section 3.4, you’ll see how to place an argument in the parentheses to specify an initial value for an Account object’s name instance
variable—you’ll enhance class Account to enable this. For now, we simply leave the parentheses empty. Line 10 contains a class instance creation expression for a Scanner object—
18 // prompt for and read name
19 System.out.println("Please enter the name:");
20
21
22 System.out.println(); // outputs a blank line
23
24 // display the name stored in object myAccount
25 System.out.printf("Name in object myAccount is:%n%s%n",
26 );
27 }
28 } // end class AccountTest
Initial name is: null
Please enter the name:
Jane Green
Name in object myAccount is:
Jane Green
Fig. 3.2 | Creating and manipulating an Account object. (Part 2 of 2.)
String theName = input.nextLine(); // read a line of text
myAccount.setName(theName); // put theName in myAccount
myAccount.getName()
76 Chapter 3 Introduction to Classes, Objects, Methods and Strings
the expression initializes the Scanner with System.in, which tells the Scanner where to
read the input from (i.e., the keyboard).