Calling Class Account’s getName Method
Line 16 displays the initial name, which is obtained by calling the object’s getName method. Just as we can use object System.out to call its methods print, printf and println,
we can use object myAccount to call its methods getName and setName. Line 16 calls
getName using the myAccount object created in line 13, followed by a dot separator (.),
then the method name getName and an empty set of parentheses because no arguments are
being passed. When getName is called:
1. The app transfers program execution from the call (line 16 in main) to method getName’s declaration (lines 16–19 of Fig. 3.1). Because getName was called via the myAccount object, getName “knows” which object’s instance variable to manipulate.
2. Next, method getName performs its task—that is, it returns the name (line 18 of
Fig. 3.1). When the return statement executes, program execution continues
where getName was called (line 16 in Fig. 3.2).
3. System.out.printf displays the String returned by method getName, then the
program continues executing at line 19 in main.
null—the Default Initial Value for String Variables
The first line of the output shows the name “null.” Unlike local variables, which are not
automatically initialized, every instance variable has a default initial value—a value provided by Java when you do not specify the instance variable’s initial value. Thus, instance variables are not required to be explicitly initialized before they’re used in a program—unless they
must be initialized to values other than their default values. The default value for an instance
variable of type String (like name in this example) is null, which we discuss further in
Section 3.3 when we consider reference types.
Calling Class Account’s setName Method
Line 21 calls myAccounts’s setName method. A method call can supply arguments whose
values are assigned to the corresponding method parameters. In this case, the value of
main’s local variable theName in parentheses is the argument that’s passed to setName so
that the method can perform its task. When setName is called:
1. The app transfers program execution from line 21 in main to setName method’s
declaration (lines 10–13 of Fig. 3.1), and the argument value in the call’s parentheses (theName) is assigned to the corresponding parameter (name) in the method
header (line 10 of Fig. 3.1). Because setName was called via the myAccount object,
setName “knows” which object’s instance variable to manipulate.
Error-Prevention Tip 3.1
Never use as a format-control a string that was input from the user. When method
System.out.printf evaluates the format-control string in its first argument, the method
performs tasks based on the conversion specifier(s) in that string. If the format-control string
were obtained from the user, a malicious user could supply conversion specifiers that would
be executed by System.out.printf, possibly causing a security breach.
3.2 Instance Variables, set Methods and get Methods 77
2. Next, method setName performs its task—that is, it assigns the name parameter’s
value to instance variable name (line 12 of Fig. 3.1).
3. When program execution reaches setName’s closing right brace, it returns to where
setName was called (line 21 of Fig. 3.2), then continues at line 22 of Fig. 3.2.
The number of arguments in a method call must match the number of parameters in
the method declaration’s parameter list. Also, the argument types in the method call must
be consistent with the types of the corresponding parameters in the method’s declaration.
(As you’ll learn in Chapter 6, an argument’s type and its corresponding parameter’s type
are not required to be identical.) In our example, the method call passes one argument of
type String (theName)—and the method declaration specifies one parameter of type
String (name, declared in line 10 of Fig. 3.1). So in this example, the type of the argument
in the method call exactly matches the type of the parameter in the method header. 