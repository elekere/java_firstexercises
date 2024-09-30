/**
 * Learning Java: Random learnt tips are being applied.
 * 
 * @author (Chukwuebuka Godsgrace Nzewi) 
 * @version (01 - 09 - 17)
 */
public class OnyeAgoziri {
  public static void main(String[] arg) {
System.out.println("I ga ekwunwu \"gbowam\" ka odaa ka egbe enu-igwe?");

 String firstName;
 String lastName;
 int hour, minute;
 int nextminute;         
  
 firstName = "Chukwuebuka "; // give firstName the value "Chukwuebuka"
 lastName = "Nzewi";/* give lastName the value "Nzewi" to remind Him of...
 * 29th of August when He wrote this programme*/
 hour = 11; // assign the value 11 to hour
 minute = 34; // set minute to 34 
 minute += 10;
 minute++; // This would increase my minute
 minute--; // This would decrease the minute
 nextminute = minute + minute++;
 System.out.println ();
 
 System.out.print(firstName);
 System.out.print (lastName);
 System.out.println (" bu afa mu. Abu mu onye agoziri agozi.");

 System.out.print("The current time is ");
 System.out.print(hour);
 System.out.print(":");
 System.out.print(minute);
 System.out.println(".");
 System.out.println ();

 System.out.print("The number of minutes since midnight is ");
 System.out.print (hour * 60 + minute);
 System.out.println (".");
 System.out.println ();
 System.out.println (hour - 1);
 System.out.println ();
 
System.out.print("Percent of the hour that has passed: "+minute * 100 / 60);
System.out.println();

System.out.println( "this is the current minute: "+minute);
System.out.println("the next minute together with the past minute is "+nextminute);
}
}