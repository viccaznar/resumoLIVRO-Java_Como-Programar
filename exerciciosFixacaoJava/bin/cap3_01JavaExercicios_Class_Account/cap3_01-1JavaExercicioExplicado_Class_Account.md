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
public void setName(String name)
{
 this.name = name; // store the name
}
This line is the method header
3.2 Instance Variables, set Methods and get Methods 73
We refer to the first line of each method declaration (line 10 in this case) as the method
header. The method’s return type (which appears before the method name) specifies the
type of data the method returns to its caller after performing its task. The return type void
(line 10) indicates that setName will perform a task but will not return (i.e., give back) any
information to its caller. In Chapter 2, you used methods that return information—for example, you used Scanner method nextInt to input an integer typed by the user at the keyboard. When nextInt reads a value from the user, it returns that value for use in the
program. As you’ll soon see, Account method getName returns a value.
Method setName receives parameter name of type String—which represents the name
that will be passed to the method as an argument. You’ll see how parameters and arguments
work together when we discuss the method call in line 21 of Fig. 3.2.
Parameters are declared in a parameter list, which is located inside the parentheses
that follow the method name in the method header. When there are multiple parameters,
each is separated from the next by a comma. Each parameter must specify a type (in this
case, String) followed by a variable name (in this case, name).
Parameters Are Local Variables
In Chapter 2, we declared all of an app’s variables in the main method. Variables declared
in a particular method’s body (such as main) are local variables which can be used only in
that method. Each method can access only its own local variables, not those of other methods. When a method terminates, the values of its local variables are lost. A method’s parameters also are local variables of the method.
setName Method Body
Every method body is delimited by a pair of braces (as in lines 11 and 13 of Fig. 3.1) containing one or more statements that perform the method’s task(s). In this case, the method
body contains a single statement (line 12) that assigns the value of the name parameter (a
String) to the class’s name instance variable, thus storing the account name in the object.
If a method contains a local variable with the same name as an instance variable (as in
lines 10 and 7, respectively), that method’s body will refer to the local variable rather than
the instance variable. In this case, the local variable is said to shadow the instance variable
in the method’s body. The method’s body can use the keyword this to refer to the shadowed instance variable explicitly, as shown on the left side of the assignment in line 12.
After line 12 executes, the method has completed its task, so it returns to its caller. As
you’ll soon see, the statement in line 21 of main (Fig. 3.2) calls method setName.