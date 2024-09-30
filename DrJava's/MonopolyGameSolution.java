/**
 * Udacity: Problem set 4
 * Question 8

Let’s improve the monopolyRoll() function from the previous problem set. Recall that in
Monopoly, players roll two six-sided dice to determine their move. If the same value is on
both dice, this is called \rolling doubles," and it means they go again. In the last problem
set, you wrote a function that rolled two six-sided dice and, if the values on both die were
the same, rolled two more and returned the sum. This time, write a function that does the
same except it continues rolling until two non-equal values appear on the two dice. In other
words, the function should behave as follows:

1. Generate two random numbers in the 1 to 6 range.
2. If they are not the same, return the sum of all numbers rolled so far.
3. If they are the same, keep track of the total rolled so far and return to step 1.

Think about what kind of loop you want to define to repeat these steps. Again, you may
want to define a separate function for generating dice rolls.

Optional challenge: in Monopoly, if a player rolls doubles three times in a row, they go
to \jail." Modify your function to keep track of the number of rolls made so far. If three
consecutive doubles are rolled, return -1 instead of continuing to roll.

Optional challenge 2: in the last lesson, you learned about while loops and for loops as a
way to make a computer program repeat. There is another method for making a program
repeat using only functions called recursion. A \recursive" function is one which calls itself
inside itself. See if you can write the monopolyRoll() function by calling monopolyRoll()
inside the function itself to handle the case where further rolls are made.
You can get an overview of recursion in Java here:
https://howtoprogramwithjava.com/java-recursion/

*/

public class MonopolyGameSolution {
   
   public int diceRoll (int sides) {
    
      double randomNumber = Math.random() * sides;
      randomNumber = randomNumber + 1;
      return (int) randomNumber;
   }
   
   public int monopolyRoll() {
      
      int roll1 = diceRoll(6);
      int roll2 = diceRoll(6);
      int total = roll1 = roll2;
      
      while (roll1 == roll2) {
       roll1 = diceRoll (6); 
       roll2 = diceRoll (6);  
       total = total + roll1 + roll2;
      } return total;
      
      }
// Challenge 1
   public int monopolyRoll2() {
    
      int roll1 = diceRoll(6);
      int roll2 = diceRoll(6);
      int total = roll1 + roll2;
      
      int rollsSoFar = 1;
      
      while (roll1 == roll2){ 
      
      if (rollsSoFar >= 3) return -1;
      
      roll1 = diceRoll(6);
      roll2 = diceRoll(6);
      total = total + roll1 + roll2;
      
      rollsSoFar = rollsSoFar + 1;
      }
   return total;
   }

// Challenge 2 
   
   public int monopolyRoll3() {
   
      int roll1 = diceRoll(6);
      int roll2 = diceRoll(6);
      
      if (roll1 == roll2) {
      return roll1 + roll2;

      } else {
         
      return roll1 + roll2 + monopolyRoll();
      }
         
      }
   }
      

