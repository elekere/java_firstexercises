/*
This program would verify the Igbo day in which the 19th of July 1994 falls under.

/**
 *
 * @author GODSGRACE
 */
public class VerifyEke {
    
    
    public VerifyEke (int daysGone) {
        
    daysGone = 3; //8365
    
}
    
    public static void main (String [] args) {
        
     String [] igboDays = new String[3]; 
    igboDays[0] = "Eke";
    igboDays[1] = "Orie";
    igboDays[2] = "Afor";
    igboDays[3] = "Nkwo";
    
    int i= 3;
    
        while (i >= 0) {
    
   
        
            System.out.println(igboDays[i]);
            
            i = i - 1;
            
        }
        
    }
    
    
    
}
