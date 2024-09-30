public class Misc2 {


   public static void main (String [] args) {
   
      final int LENGTH = 4;
      int [] numbers = new int[LENGTH];
      numbers[2] = 12;
      numbers[1] = 43;
      numbers[0] = 23;
      numbers[3] = 62;
      
      System.out.println(numbers[numbers.length-1]);
      System.out.println(numbers.length);
      
      int [] scores = {83, 43, 77};
      int sum = addScores(scores);
      
      System.out.println();
      System.out.println("The sum of the scores = " + sum + ".");
   }
   
   public static int addScores (int[] values){
      
        int totalScore = 0;
      
      for (int i = 0; i < values.length; i++) {
       
        totalScore = totalScore + values[i];
         
      }
      return totalScore;
}
}
