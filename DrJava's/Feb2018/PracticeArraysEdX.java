public class PracticeArraysEdX {

   public static void main (String [] args ) {
      
      int [][] numbers = new int [3][4];
      for (int c = 0; c < numbers.length; c++) {
      
         int r = 0;
         numbers[r][c] = r + c;
         System.out.println(numbers[r][c]);
      }
   
   }
   
}