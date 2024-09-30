import java.util.*;

public class Misc8 {

   public static void main (String [] args) {
   
      ArrayList<Integer> aL = new ArrayList<Integer>();
      
// Add elements to the array list
      aL.add(34);
      aL.add(47);
      aL.add(12);
      
      System.out.println("aL consists: " + aL);
      
// Get the array
      
      Integer [] ar = new Integer[aL.size()];
      ar = aL.toArray(ar);
      
      int sum = 0;
      
// Sum the array
      
      for (int i: ar) sum += i;
      
      System.out.println("The sum is: " + sum);
   }
}