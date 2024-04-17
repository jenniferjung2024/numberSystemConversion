# numberSystemConversion
In progress....

----

CSE118 Fundamentals of Programming

Project 01: Write program to convert numbers

Spring Semester, 2024

....

**Function**
Write a Java program to implement functions to convert a number from one number system to another.

**Requirement: **

1. Write a Java program to:

   		a. Convert binary number to decimal and hexadecimal number.

    	b. Convert decimal number to binary and hexadecimal number.

    	c. Convert hexadecimal number to binary and decimal number.


2. Functions:
The program repeatedly displays the following menu:
    1. Binary to hexadecimal and decimal
    2. Hexadecimal to binary and decimal
    3. Decimal to binary and hexadecimal
    4. Exit

User selects one item from the meu by entering a number (1 to 3) to perform a conversion: once a menu item is selected, user is prompt to enter a number (in string) which is the source value. If this source is valid, it will be converted to destination numbers. Display message: source number, destination-1 number, destination-2 number.

For example, if menu item 1 is select, the following message will be displayed:

    Binary number: [binary-number]

    Decimal number: [decimal-number]

    Hexadecimal number: [hexadecimal-number]


After this message is displayed, the menu will be displayed again, so user can select another item.
If menu item 4 is entered, the program will be terminated.

3. Requirement:
   
	(1) The input must be a string. The program will validate this input string. For example, if menu item 1 is selected, all characters in the string must be ‘0’ or ‘1’; if item 2 is selected, all characters in the string must be hexadecimal digits ({‘0’, ‘1’, ‘2’, … ‘9’, ‘A’, ‘B’, …, ‘F’}).

	(2) The conversion function should be packed/implemented in methods. For example, to define a method to convert binary number to decimal; to define another method to convert binary to hexadecimal.

	(3) You must write a program to perform conversion. You CANNOT call any build-in functions/utilities (Integer.parseInt(), Integer.toHexString() … ) in Java JDK to do conversion.

....

**Grading**
The project is graded based on implementation, modularity, performance, and coding style.


