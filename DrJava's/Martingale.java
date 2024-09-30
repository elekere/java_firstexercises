public class Martingale {

public int maringale () {

int money = 1000;
int target = 1200;
int bet = 10;
  while (money > bet) {
  boolean win = play();
  
  if (money == target) 
  break;
  
  }
  
  if (win) {
   money += bet;
   bet = 10;
  } else { 
  money -= bet;
  bet *= 2;}
  
}
return money;
}