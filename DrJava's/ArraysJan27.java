public class ArraysJan27 {

   public static void main (String [] args) {
   
      int [] numbers = {89, 33, 52, 74, 73, 13, 64, 78, 8};
      
      RandomNumberGenerator abc = new RandomNumberGenerator();
      int randNum;
      randNum = abc.randomNumber(8);
      while (randNum < 9) {
         
         System.out.println (numbers [randNum]);
         randNum++;
      }
      
      System.out.println ("");
      
   String [] states = new String [5];
      states[0] = "Abia";
      states[1] = "Adamawa";
      states[2] = "AkwaIbom";
      states[3] = "Anambra";
      states[4] = "Bauchi";
      
      System.out.println (states[3]);
   }


}