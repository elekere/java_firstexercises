/**
 * @author GODSGRACE
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadingFile {
     
    public static void main(String[] args) {

File file = new File("Olodo.txt");
    
try { 
   Scanner sc = new Scanner(System.in);
   while (sc.hasNextLine()) {
    
      String line = sc.nextLine();
      System.out.println(line);
   }
} catch (FileNotFoundException e) {

   e.printStackTrace();

}
    }
    
}