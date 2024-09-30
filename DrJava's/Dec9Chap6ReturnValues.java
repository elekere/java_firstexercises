import java.util.Scanner;
public class Dec9Chap6ReturnValues {

public static void main (String args []) {

Scanner in = new Scanner (System.in);

double radius, angle;

System.out.println ("Enter radius value (in cm) here:"); 

radius = in.nextDouble(); // requests input of radius value

System.out.println ("Enter angle value (in degrees) here:");

angle = in.nextDouble(); // requests input of angle value

double height = Math.abs(radius * Math.sin(angle)); // computes height

System.out.println ("the height is: " + height);

}

}
