public class RandomNumberGenerator {
   
   
      public static int randomNumber(int sides) {
   
      double a = Math.random();
      a = a * sides;
      a = a + 1;
      int ai = (int) a;
      return ai;
      //System.out.println (ai);
      
   }
}