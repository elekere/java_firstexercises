import java.util.ArrayList;

public class Misc6 {

   public static void main (String [] args) {

   ArrayList<Integer> list = new ArrayList<Integer>();
   
   list.add(1);
   
   ArrayList<String> buddies = new ArrayList<String>();
   buddies.add("Cindy");
   int i = 0;
   String name = buddies.get(i);
   buddies.set(i, "Harry");
   
   System.out.println(buddies.size());
   
    }
}