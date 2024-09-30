public class UdacityRandomNumber2 {

public int diceRoll (int sides) {

double randomNum = Math.random() * sides;

randomNum = randomNum + 1;

return (int) randomNum;

}

public void main (String args []) {

monopollyRoll();

}

public int monopollyRoll() {

int rollA = diceRoll(6);
int rollB = diceRoll(6);
int total = rollA + rollB;

if (rollA == rollB) {

int rollC = diceRoll(6);
int rollD = diceRoll(6);

total = total + rollC + rollD;

}
return total;


}





}