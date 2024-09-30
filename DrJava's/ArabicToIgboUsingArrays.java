/* 
 * A java program that gives the corresponding
 * Igbo word for each of the Arabic figures One to Ten
 * 
 * @Author: Godsgrace Nzewi
 * @Version: 11-01-2018
 */


import java.util.Scanner;

public class ArabicToIgboUsingArrays {

   public static void main (String args []) { 
      
      String [] ahiriOnuogugu = 
         
      {"Otu","Abuo","Ato","Ano","Ise",
         "Isii","Asaa","Asato","Itolu","Iri"};
      
      int size = ahiriOnuogugu.length;
      
      Scanner input = new Scanner(System.in);
      
      // Requests for input of Arabic figures 1 to 10
      
      System.out.println("Tinye akara onuogu Arabik n'agbata '1' rue '10': ");
      
      int x = input.nextInt();
      x = --x;
      
      // Takes in 0 if x is negative
     
      if ( x < 0) {
         //x = 0;
         System.err.println("Akara " + (x + 1) + " I tinyere a dabaghi. Tinye ozo.");
         return;
      }
      
      if (x >= 10) {
         System.err.println("Akara " + (x + 1) + " I tinyere a dabaghi. Tinye ozo.");
      return;
      }
      

      // Outputs Igbo equivalence
     
      String mkpuruOnuogugu = ahiriOnuogugu[x];
      System.out.println();  
      System.out.print ("Nke a putara " + "'" + mkpuruOnuogugu + "'"); 
      System.out.println (" n'okwu Igbo." + " Daalu!");
   }

}