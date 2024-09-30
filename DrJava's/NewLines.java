public class NewLines {
   
   public static void nl (int n) // nl -> newLines 
   
   {
      if (n > 0) { 
        
         System.out.println();
         nl(n - 1); // recursion of 'nl'
         
      }
 }
   
}