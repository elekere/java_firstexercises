class Misc3 {

   public static void main (String [] args) {
     
      int[] scores = { 98, 78, 39, 37, 89, 44 };
      int sum = addScores(scores);
      System.out.println(sum);
   }

   public static int addScores(int[] values) {
      int totalScore = 0;
      
      for (int i = 0; i < values.length; i++) {
        
         totalScore = totalScore + values[i];
      }
      
      
   return totalScore;
   }
   

}