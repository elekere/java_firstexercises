public class DrumkitEdit {

boolean topHat = true;
boolean snare = true;

void playTopHat() {
   
   System.out.println("ding ding da-ding");
}

void playSnare() {
   
   System.out.println("bang bang ba-bang");
}
}

public class DrumkitTestDriveEdit {

   Drumkit d = new Drumkit();
   
   d.snare = false;
   d.playSnare();
   
   public static void main (String args []) {
      
      if (d.snare == true) {
      
      d.playSnare();
      }
   d.playTopHat();
   }


}