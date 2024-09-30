import java.util.ArrayList;

public class Misc7 {

   public static void main (String [] args) {
      
      ArrayList<String> names = new ArrayList<String>();
      System.out.println ("initial size of names: " + names.size());
      names.add("Chukwuebuka");
      names.add("Ifunaanyachukwu");
      names.add("Chukwuemeka");
      names.add("Onyinyechukwu");
      names.add(0, "Mummy");
      names.add(1, "Daddy");
      
// Add
      
      System.out.println("Size of names after additions: " + names.size());
      System.out.println();
      
//remove
      
      names.remove(2);
      names.remove("Ifunaanyachukwu");
      
      System.out.println("Size of names after removals: " + names.size());
      System.out.println();
      
      int i = 0;
      while (i < names.size())
      {
         String name = names.get(i);
         if (name.length() > 11)
         {
            System.out.println("Names containing more than eleven characters:");
            System.out.println(name + " Nzewi");
            names.remove(i);
            //System.out.println("Names containing more than eleven characters:");
            //System.out.println(name + " Nzewi");
         }
         
         else
         {
            i++;
            System.out.println("Names containing eleven characters or less:");
            System.out.println(name + " Nzewi");
         }
         
      }
      
   }
}