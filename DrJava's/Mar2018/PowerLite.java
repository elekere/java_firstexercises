import java.util.*;

public class PowerLite {

   public static void main (String [] args) {
      
      System.err.println("PowerLite gi nu!");
      
      ArrayList<String> names = new ArrayList<String>();
      
      names.add("Pamela");
      names.add("Priscilla");
      names.add("Prisca");
      
      ListIterator<String> i = names.listIterator();
      
      while (i.hasNext())
      System.out.println(i.next());  
      
      System.out.println();
      
      while (i.hasPrevious())
         System.out.println(i.previous());
      
      Iterator<String> a = names.iterator();
      
      System.out.println();
      
      while (a.hasNext())
      System.out.println(a.next());  
   

}
}

