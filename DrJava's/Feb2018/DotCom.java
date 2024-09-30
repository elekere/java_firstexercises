// New & Improved DotCom Class

import java.util.ArrayList;

public class DotCom {

   private ArrayList<String> locationCells;
   // private ArrayList<String> locationCells;
   public void setLocationCells (ArrayList<String> loc) {
   // public void setLocationCells (ArrayList<String> loc) {
      locationCells = loc;
      //locationCells = loc;
   }
   // }
   public String checkYourself (String userInput) {
   //public String checkYourself (String userInput) {
      String result = "miss";
      // String result = "miss";
      int index = locationCells.indexOf(userInput);
      // int index = locationCells.indexOf(userInput);
      if (index >= 0) {
         // if (index >= 0) {
         locationCells.remove(index);
         // locationCells.remove(index);
         
      
      if (locationCells.isEmpty()) {
         // if (locationCells.isEmpty()) {
         
         result = "kill";
         //result = "kill";
      
      } else {
         // } else {
         result = "hit";
         // result = "hit";
   }
   //}
   }
   // }
 return result;
 // return result
   }
   //}
}
//}