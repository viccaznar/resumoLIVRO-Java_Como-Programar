2.3 Modifying Your First Java Program
In this section, we modify the example in Fig. 2.1 to print text on one line by using multiple statements and to print text on several lines by using a single statement.
Displaying a Single Line of Text with Multiple Statements
Welcome to Java Programming! can be displayed several ways. Class Welcome2, shown in
Fig. 2.3, uses two statements (lines 9–10) to produce the output shown in Fig. 2.1. [Note:
From this point forward, we highlight with a yellow background the new and key features
in each code listing, as we’ve done for lines 9–10.]
The program is similar to Fig. 2.1, so we discuss only the changes here. Line 2

is an end-of-line comment stating the purpose of the program. Line 4 begins the Welcome2
class declaration. Lines 9–10 of method main
display one line of text. The first statement uses System.out’s method print to display a
string. Each print or println statement resumes displaying characters from where the last
print or println statement stopped displaying characters. Unlike println, after displaying its argument, print does not position the output cursor at the beginning of the next
line in the command window—the next character the program displays will appear immediately after the last character that print displays. So, line 10 positions the first character
in its argument (the letter “J”) immediately after the last character that line 9 displays (the
space character before the string’s closing double-quote character). 