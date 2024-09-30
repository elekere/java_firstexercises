// *STRINGS*

public class Sept13_V3 {
  public static void main (String [] args) {
    
    /* #LENGTH
     * String nzString = "Kee ife na-eme?";
    int nzStringLength = nzString.length();
    System.out.println (nzStringLength);
  */
    /* #UPPERCASE
     * String nzString = "Kee ife na-eme?";
   String nzStringUpper = nzString.toUpperCase();
    System.out.println (nzStringUpper);
  */
    
    /* #REPLACE
    String nzString = "Kee ife na-eme?";
    System.out.println (nzString.replace ('e', 'u'));
    */
String nzString = "Kee ife na-eme?";
System.out.println ("Leta 'm', na ajuju 'Kee ife na-eme?', bu letter nke " + "*" + nzString.indexOf ('m') + "*" + " n'onodu ya na ahiri okwu-a");
   
/*WHAT WAY IS POSSIBLE IN GETTING THE POSITION OF EACH OF THE e-letter?:
 * System.out.println (nzString.indexOf ('e', 'e','e','e'));*/                                        
  }
}