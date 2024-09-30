import java.util.Scanner;
import java.util.Random;

public class GuessStarter2 {
public static void main (String[] args) {

int numGuess, numRandom, diff, diffAbsValue;

//Request for Input
Scanner in = new Scanner (System.in);
System.out.println ("Guess the number I'm thinking of: ");
numGuess = in.nextInt();
System.out.println ("\nThe number you guessed is: " + numGuess);

//Compute and Output Random number
Random random = new Random();
numRandom = random.nextInt (70); 
System.out.println ("The number I was thinking of is: " + numRandom);

//Absolute Value Difference: Guessed Number minus Random Number
diff = numGuess - numRandom;
diffAbsValue = diff < 0 ? -diff : diff;
System.out.println ("You were off by: " + diffAbsValue);

}
}