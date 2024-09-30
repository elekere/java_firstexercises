package cool;


/**
 * Write a description of SecondsConverter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 /* Exercise 3.3 Write a program that converts a total number of seconds to
hours, minutes, and seconds. It should (1) prompt the user for input, (2) read
an integer from the keyboard, (3) calculate the result, and (4) use printf to
display the output. For example, "5000 seconds = 1 hours, 23 minutes,
and 20 seconds".
Hint: Use the modulus operator
 * 
 * */
 
import java.util.Scanner;

public class SecondsConverter {
public static void main (String[] args){
Scanner in = new Scanner(System.in);

int secs;
int hours;
int mins;
int remainder;

final int SEC_PER_MIN = 60;
final int SEC_PER_HOUR = 3600;

System.out.print("Enter Exact Seconds: ");
secs = in.nextInt();

mins = ((secs % SEC_PER_HOUR) / SEC_PER_MIN);
hours = (secs / SEC_PER_HOUR);
remainder =((secs % SEC_PER_HOUR) % SEC_PER_MIN);

System.out.printf("%d seconds = %d hours, %d minutes, %d seconds\n", secs, hours, mins, remainder);
}
}