/**
 * 
American format:
Thursday, July 16, 2015
European format:
Thursday 16 July 2015

 */



public class Date {
public static void main (String args []) {
String day = "Thursday"; 
int date = 16; 
String month = "July";
int year = 2015;

System.out.println ("American format:");
System.out.println (day + "," + " "+ month + " " + date + "," + " " + year );
System.out.println ("European format:");
System.out.println (day + " " + date + " " + month + " "+ year);

}
}