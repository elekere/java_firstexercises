//20-02-2018

public class Misc5 {

   public static void main (String [] args) {
   
      Double [] numbers = new Double[6];
      
      numbers [0] = 9.0;
      numbers [1] = 6.0;
      numbers [2] = 5.0;
      numbers [5] = 3.0;
         
         System.out.println(numbers[5]+numbers[2]);
         
         System.out.println();
        int y = addNum(22, 33);
        System.out.println(y);
   }



public static int addNum (int a, int b) {
   int sum = a + b;
   return sum;
   
}
}