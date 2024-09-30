import java.util.Scanner;
public class WeekDayActivities {

   
   
   public static void main (String [] args) {
   
      Scanner sc = new Scanner(System.in);
      System.out.println("Day what? (Enter a corresponding number to the week's day)");
     
      try {
      
      int dayOfWeek = sc.nextInt();
      String schedule;
      
      switch (dayOfWeek) {
   
      case 1: schedule = "Gym";
      break;
      case 2: schedule = "Code";
      break;
      case 3: schedule = "Church";
      break;
      case 4: schedule = "Write";
      break;
      case 5: schedule = "Evangelism";
      break;
      default: schedule = "Free";
      break;

   }
      System.out.println(schedule);   
      } catch (Exception exception) {
         System.err.println("Your input was not recognized.");      
      }
   }
}