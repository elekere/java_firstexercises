import java.util.Scanner;
public class NinthSeptember {
public static void main (String[] args) {
 int inch = 100;
   final double CM_PER_INCH;
   CM_PER_INCH = 2.54;
double cm = inch * CM_PER_INCH;
System.out.printf ("%d in = %.2f cm\n", inch, cm);
System.out.println();

int mpekele;
double obere_mita;
System.out.println("Purogramu a na-atuaghari mpekele ka-oburu obere mita");
System.out.println();
Scanner in = new Scanner (System.in);
System.out.print("mpekele ole ?");
mpekele =in.nextInt();
obere_mita =mpekele * 2.54;
                 System.out.print (mpekele + "mp = ");
                 System.out.println (obere_mita + "om");

}
}