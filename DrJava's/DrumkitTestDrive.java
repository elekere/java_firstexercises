public class DrumkitTestDrive {

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