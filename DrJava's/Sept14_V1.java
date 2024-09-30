// #METHODS

/*public class Sept14_V1 {
  public static void main (String[] args) {
  ggFirstMethod();
  ggFirstMethod();
  }
  public static void ggFirstMethod() {
     System.out.println("Otito diri Chi-ukwu kere elu-igwe kee elu-uwa");
  }
}*/

/* #1
 * public class Sept14_V1 {
  public static void main (String[] args) {
  ggKedu("Chukwuebuka");
  ggKedu("Chukwuemeka");
  }
  public static void ggKedu(String name) {
     System.out.println("Kedu, " + name);
  }
}*/


/* #2
  * public static void add(double a, double b) {
     //System.out.println(a + b);
    System.out.printf ("%.10f", a + b);
  
  }*/


public class Sept14_V1 {
  public static void main (String[] args) {
  double product = Multiply(20.00, 10.00, 3.00);
  double result = product / 5.00;
  System.out.println(product);
  System.out.println(result);
  }
 
  public static double Multiply (double a, double b, double c){
  
  // System.out.println (a * b * c );
  return (a * b * c);
  }
  }