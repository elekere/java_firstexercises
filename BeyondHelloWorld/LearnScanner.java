
/**
 * Write a description of LearnScanner here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.Scanner;

   public class LearnScanner{ 
    public static void main (String [] args) {
        
    Scanner scan = new Scanner (System.in);
   System.out.println ("Enter Text or String");
   String inputString = scan.nextLine();
System.out.println ("The Text you entered is "+inputString);
    }
}

