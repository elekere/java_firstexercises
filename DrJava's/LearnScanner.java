
/**
 * Write a description of Scanner here.
 * 
 * @author (ggNzewi) 
 * @version (01-09-17)
 */ 

import java.util.Scanner;

   public class LearnScanner { 
    public static void main (String [] args) {
        
   Scanner scan = new Scanner (System.in);
   System.out.println ("Enter any number");
   int inputNum = scan.nextInt();
   System.out.println ("The number you entered is "+inputNum);
    }
}