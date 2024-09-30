
/**
 * Write a description of OnyeAgoziri here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class OnyeAgoziri {
  public static void main(String[] arg) {
 String firstName;
 String lastName;
 int hour; 
 double minute;         
  
 firstName = "Chukwuebuka "; // give firstName the value "Chukwuebuka"
 lastName = "Nzewi";/* give lastName the value "Nzewi" to remind Him of...
 * 29th of August when He wrote this programme*/
 hour = 11; // assign the value 11 to hour
 minute = 34; // set minute to 34 

 System.out.print(firstName);
 System.out.print (lastName);
 System.out.println (" bu afa mu. Abu mu onye agoziri agozi.");

 System.out.print("The current time is ");
 System.out.print(hour);
 System.out.print(":");
 System.out.print(minute);
 System.out.println(".");
 System.out.println ();
 
 System.out.print("The number of minutes since midnight is \"definitely,\" ");
 System.out.print (hour * 60 + minute);
 System.out.println (".");
 System.out.println ();
 
 System.out.print("Reducing hour by one \tequals\t "); 
 System.out.print(hour - 1);
 System.out.println (".");
 
System.out.println ();
System.out.println("The Fraction of the hour that has passed is: ");
System.out.println(minute / 60);
 }
} 