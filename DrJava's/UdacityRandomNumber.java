public class UdacityRandomNumber {

public void main (String args []) {

monopolyRoll();

}

public int monopolyRoll () {

double randomNum = Math.random();
randomNum = randomNum * 6;
randomNum = randomNum + 1;

int randomNumX = (int) randomNum;
int randomNumY = (int) randomNum;
int sum = randomNumX + randomNumY;

if (randomNumX != randomNumY) {

int sumA = sum;
return sumA;

} else { 

int randomA = ranGen();
int randomB = ranGen();
int sumA = randomA + randomB;
return sumA;

}

}

public int ranGen() {

double randomNumZ = Math.random();
randomNumZ = randomNumZ * 6;
randomNumZ = randomNumZ + 1;

int randomInt = (int) randomNumZ;

return randomInt;

}
}
