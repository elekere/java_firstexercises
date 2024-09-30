import java.util.Scanner;
import java.util.InputMismatchException;


public class ExceptionsLearn2 {


   public static void main (String [] args) {
   
      String [] months = {"jun", "apr", "feb", };
      
      try {
      
      Scanner scan = new Scanner(System.in);
      int month = scan.nextInt();
      System.out.print(months[month]);
      
      }
      catch (IndexOutOfBoundsException exception) {
         System.out.println("Index is out of bounds!");
   
   }
      catch (InputMismatchException exception) {
         System.out.println("Index mismatch!");



}
   }
}