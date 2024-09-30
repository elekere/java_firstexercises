public class Sept15_V1_ {
  public static void main(String[] args) {
  
int inch = 100;
final double CM_PER_INCH;
CM_PER_INCH = 2.54;
double cm = inch * CM_PER_INCH;
System.out.printf("%d in = %.3f cm\n", inch, cm);

inch = (int) (cm / CM_PER_INCH);
System.out.printf("%f cm = %d in\n", cm, inch);

 double pi = 3.14159; 
  int x = (int) pi;
 System.out.printf ("%03d", x);
  }
}

//0223230896
  //0030396633