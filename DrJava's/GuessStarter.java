/*
 * 
Exercise 3.4

The goal of this exercise is to program a Guess My Number"
game. When it’s finished, it will work like this:
I'm thinking of a number between 1 and 100
(including both). Can you guess what it is?
Type a number: 45
Your guess is: 45
The number I was thinking of is: 14
You were off by: 31
 * 
 * */

import java.util.Random;
import java.util.Scanner;

public class GuessStarter {

public static void main (String[] args) {

int guessNum, randomNum, diff, diffAbsVal;

//Request for Input
Scanner in = new Scanner(System.in);
System.out.print ("Type a number: ");
guessNum = in.nextInt ();

System.out.println ("\nYour guess is: " + guessNum);

//Compute and output random number
Random random = new Random();
randomNum = random.nextInt (100) + 1;
System.out.println ("\nThe number I was thinking of is: " + randomNum); 

// Compute difference and absolute value of difference
diff = guessNum - randomNum;
diffAbsVal = diff < 0 ? -diff : diff; // to get absolute value of diff
System.out.println ("\nYou were off by: " + diffAbsVal);

System.out.println();

}

}