import java.util.Scanner;

public class ArabicToRomanUsingArrays {

/**
 * A function that gives the corresponding Roman figure 
 * for each of the numbers one to ten
 
 * @Author: Godsgrace Nzewi
 * @Version: 11-01-2018 (Improved: 12-01-2018).
 */

public static void main (String args []) {


String [] numList = {"","I","II","III","IV","V","VI","VII","VIII","IX","X"};

  int size = numList.length;

  Scanner input = new Scanner (System.in);

   int x = input.nextInt();


if (x > 10) {
   System.err.println ("No way! Enter another number");

   x = input.nextInt();
return;

}

String singleNum = numList [x] ;

  System.out.println (singleNum);

    }


 }
