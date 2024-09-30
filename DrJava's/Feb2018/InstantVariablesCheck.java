public class InstantVariablesCheck {

  public boolean isBookBorrowed;
   public String name;
   
   // Contructor
   public InstantVariablesCheck (boolean isBookBorrowed, String name) {
      this.isBookBorrowed = isBookBorrowed;
      this.name = name;
   
   }
   
   public static void main (String [] args) {
      isBook();
      }
   
   // method
   public static void isBook() {
      
      boolean isBookBorrowed = false;
   if (isBookBorrowed) {
      
         System.out.println("Okay.");
   }
   
   else {
   System.out.println("No.");
   
   }
   }

}