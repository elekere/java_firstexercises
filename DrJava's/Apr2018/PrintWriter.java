import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterClass {

   public static void main (String [] args) {
   
      try {
      
         File file = new File("Elekere.txt");
         
         if (!file.exists()) {
         
            file.createNewFile();
         
         }
      
         PrintWriter pw = new PrintWriter(file);
         pw.println("This is my file content");
         pw.println(777);
         pw.close();
         System.out.println("done");
      
      } catch (IOException e) {
         e.printStackTrace();
      }
   
   }
}