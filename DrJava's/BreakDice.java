public class BreakDice {

public void main (String args []) {

rollADice();

}

public boolean rollADice() {

double dice = rollDice(6);

while (dice!=6) {

dice = rollDice(6);

if (dice == 3) 
break;
}

if (dice == 6){ 
System.out.println("true");
return true;}
else {
return false;
}}

/*
 * 
 * */
public double rollDice (double sides) {

double b = Math.random();
b = b + 1;
b = b * sides;
int randomInt = (int) b;
return randomInt;
}
}


