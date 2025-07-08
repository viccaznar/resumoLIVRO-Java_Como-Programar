getName Method of Class Account
Method getName (lines 16–19)
Good Programming Practice 3.2
We could have avoided the need for keyword this here by choosing a different name for
the parameter in line 10, but using the this keyword as shown in line 12 is a widely accepted practice to minimize the proliferation of identifier names.
public String getName()
{
 return name; // return value of name to caller
}
Keyword return passes the String name back to
the method’s caller
74 Chapter 3 Introduction to Classes, Objects, Methods and Strings
returns a particular Account object’s name to the caller. The method has an empty parameter list, so it does not require additional information to perform its task. The method returns a String. When a method that specifies a return type other than void is called and
completes its task, it must return a result to its caller. A statement that calls method getName on an Account object (such as the ones in lines 16 and 26 of Fig. 3.2) expects to receive the Account’s name—a String, as specified in the method declaration’s return type.
The return statement in line 18 of Fig. 3.1 passes the String value of instance variable name back to the caller. For example, when the value is returned to the statement in
lines 25–26 of Fig. 3.2, the statement uses that value to output the name.