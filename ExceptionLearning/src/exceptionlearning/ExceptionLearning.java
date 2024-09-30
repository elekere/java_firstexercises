/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptionlearning;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author GODSGRACE
 */
public class ExceptionLearning {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

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

