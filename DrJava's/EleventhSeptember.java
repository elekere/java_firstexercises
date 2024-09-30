import java.util.Scanner;
public class EleventhSeptember {
  public static void main (String[] args) {
    Scanner scan = new Scanner (System.in);
    System.out.println ("Enyi, enter your score ebe a...");
    int score = scan.nextInt ();
    
    switch (score) {
    
    case 90:
    case 100:
    case 80:
      System.out.println ("You shap abegi");
      break;
      
    case 70:
    case 60:
      System.out.println ("You try joor");
      break;
      
    default:
      System.out.println ();
    
    
    }
    
  }


}
  