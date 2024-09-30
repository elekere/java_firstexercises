/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author GODSGRACE
 */

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterDemo {

   public static void main (String [] args) {
   
      try {
         File file = new File("Elekere1.txt");
         
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