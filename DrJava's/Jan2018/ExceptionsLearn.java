import java.util.Scanner;
import java.util.InputMismatchException;

public class ExceptionsLearn {
   public static void main (String [] args) {
    
      String [] months = {"jan", "mar", "may", "july",};
      
      Scanner scanner = new Scanner(System.in);
      try {
         int month = scanner.nextInt();
         System.out.print(months[month]); 
      }
      catch (IndexOutOfBoundsException exception) {
      
      System.out.print("Index is out of bounds!");
      
      } catch (InputMismatchException exception) {
         
         System.out.print ("Input mismatch");
      
      
      }
   }



}