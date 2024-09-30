import java.util.Scanner;

public class Misc4 {

   public static void main (String [] args) {
   
      Scanner scan = new Scanner(System.in);
      
      System.out.println("Day what of the week? (Enter 1, 2, 3, 4, 5, 6, or 7.)");
      
      int day = scan.nextInt();
      
      String schedule;
      
      switch (day) {
         
         case 1: schedule = "Church";
         break;
         case 2: schedule = "Code";
         break;
         case 3: schedule = "Peniel";
         break;
         case 4: schedule = "Code & Write";
         break;
         case 5: schedule = "Evangelism";
         break;
         case 6: schedule = "Shopping";
         break;
         default: schedule = "Free";
         
         System.out.println(schedule);
      
      }
   
   }

}