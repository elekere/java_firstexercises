import java.util.Scanner;

public class Dec4Chap5 {

public static void main (String[] args) {

System.out.println ("Which number is on your mind: ");

Scanner in = new Scanner (System.in);
int n = in.nextInt();

countdown (n);

}

public static void countdown (int n){

if (n == 0){
System.out.println ("Blastoff!");
}
else {
System.out.println (n);
countdown (n-1);

}

}




}