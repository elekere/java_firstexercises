/*
 * 
 * 

Exercise 3.2 Write a program that converts a temperature from Celsius to
Fahrenheit. It should (1) prompt the user for input, (2) read a double value
from the keyboard, (3) calculate the result, and (4) format the output to one
decimal place. For example, it should display "24.0 C = 75.2 F".
Here is the formula. Be careful not to use integer division!

F = C × 9/5 + 32

...........

declare
request for input
format output printf("%.1f C =  )


**/

/**import java.util.Scanner;

public class CelsiusToFahrenheit {
public static void main (String[] args) {
  
double cel;
double fah;
final double x = (float) 9/5;
final double y = 32;
Scanner in = new Scanner (System.in);

System.out.println ("THIS PROGRAM CONVERTS CELSIUS TO FAHRENHEIT\n");

//prompt the user and get value
System.out.println("Enter Celsius Value:");
cel =  in.nextDouble();

//Convert and output result
fah = (cel * x) + y;

System.out.println ("\nYour Converted Value:");
System.out.printf ("%.1f C = %.1f F\n", cel, fah);
*/

import java.util.Scanner;
public class CelsiusToFahrenheit { 
public static void main (String[] args) { 
double c;
double f;
final double a = (float) 9/5;
final double b = 32;
Scanner in = new Scanner (System.in);

//prompt the user to input celcius value
System.out.println ("DIS PROGRAM DEY KONVAT CELCIUS GO FAHRENHEIT\n");

System.out.println ("Abeg, enta wetin you get for celcius");
c = in.nextDouble();

//convert and output result
f  = (c  *  a) + b;

System.out.println ("Na dis komot afta konvat:");
System.out.printf ("%.1f C = %.1f F", c, f);
}

}
