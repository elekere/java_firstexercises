/**
 * @Author: Godsgrace Nzewi
 * @Version: 13-01-2018
 *
 * 
 * 
 */

public class PraiseTheLord {
 
   public static void main (String args []) {
      
      double [] pawpaw = new double [10];
      pawpaw [5] = 13;
      pawpaw [6] = 38;
      pawpaw [3] = 45;
      pawpaw [1] = 77;
      pawpaw [7] = 23;
      pawpaw [2] = 4;
      
      double [] pawpawExtra = {0, 1, 3, 5, 7, 9, 11, 13, 15, 17,};
      
      System.out.println (pawpawExtra[5]);
      
      System.out.println();
      
      for (int j = 1; j < pawpaw.length; j++ ) {
            System.out.println ("Praise the Lord " + pawpaw[j] + " times!" + " Hallelujah! " + pawpaw[j] + " times!" );
      }
      }
   
}