public class MonopolyGame {
   
   public int ranGen() {
       
          double randomNumZ = Math.random();
          randomNumZ = randomNumZ * 6;
          randomNumZ = randomNumZ + 1;
          
          int randomInt = (int) randomNumZ;
          
          return randomInt;
       
       }
   
   public int monopolyRoll (int x, int y) {
      
      double randomNum = Math.random();
      randomNum = randomNum * 6;
      randomNum = randomNum + 1;
       
       int randomNumX = (int) randomNum;
       int randomNumY = (int) randomNum;
       int sum = randomNumX + randomNumY;
       
       if (randomNumX != randomNumY) {
          
          sum = randomNumX + randomNumY;
          
          return sum;
       }
       
       else {
          
          int randomA = ranGen();
          int randomB = ranGen();
          
          int sum2 = randomA + randomB;
          
          return sum2;
       }
       
       
       
       }
       
       }