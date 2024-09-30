//Hashset
import java.util.*;
public class UsingHashSet {
   public static void main (String [] args) {
   HashSet<String> names = new HashSet<String>();
   
   names.add("Indigo");
   names.add("Violet");
   names.add("Blue");
   names.add("Orange");
   
   Iterator<String> itr = names.iterator();
   
   while (itr.hasNext())
      System.out.println(itr.next());  
   
   }

}