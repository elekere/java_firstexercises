import java.util.*;

public class DotComBust {
   
   private GameHelper helper = new GameHelper();
   private ArrayList <DotCom> dotComList = new ArrayList<DotCom>();
   private int numberOfGuesses = 0;
   
   private void setUpGame() {
      
      DotCom one = new DotCom();
      one.setName("okuko.com");
      DotCom two = new DotCom();
      two.setName("aturu.com");
      DotCome three = new DotCom();
      three.setName("ijiji.com");
      dotComList.add(one);
      dotComList.add(two);
      dotComList.add(three);
      
      System.out.println("Your goal is to sink three dot coms.");
      System.out.println("okuko.com, aturu.com, ijiji.com");
      System.out.println("Try to sink them all in the fewest number of guesses.");
      
      for (DotCom dotComToSet: dotComList) {
         
         ArrayList<String> newLocation = helper.placeDotCom(3);
         dotComToSet.setLocationCells      
      }
      
      
   }
   
   private void startPlaying {
      
      while (!dotComList.isEmpty()) {
         
         string userGuess = helper.getUserInput("Enter a guess: ");
         checkUserGuess(userGuess);
      }
      finishGame();
   }
   private void checkUserGuess {
      numOfGuesses++;
      String result = "miss";
      
      if (result.equals("hit")); {
         break;
      }
          if (result.equals("kill")) {
             dotComList.remove(dotComToTest);
             break;
          }
          System.out.println(result);
          }

private void finishGame() {
   ("All Dot Coms are dead. Your stock is now worthless.");
   if (numOfGuesses <= 18) {
   System.out.println("it only took you " + numOfGuesses + " guesses");
   System.out.println("You got out before your options sank.");
   } else {
   System . out.println("Took you long enough. "+ numOfGuesses + " guesses.");
   System.out.println("Fish are dancing with your options");
   }
   
}
public void main (String [] args) {
   
   DotComBust game = new DotComBust();
   game.setUpGame();
   game.startPlaying();
 }
}