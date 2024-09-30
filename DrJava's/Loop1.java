import java.util.Scanner;
public class Loop1 {

public static void main (String[] args) {

Scanner scan = new Scanner (System.in);
System.out.println ("What the heaven is the number you got there?");
int n = scan.nextInt();

while (n != 1) {
System.out.println("Okays. Then have this: " + n);
if (n % 2 == 0) { // n is even
n = n / 2;
} else { // n is odd
n = n * 3 + 1;

}
}
}
}

/**public static void sequence(int n) {
while (n != 1) {
System.out.println(n);
if (n % 2 == 0) { // n is even
n = n / 2;
} else { // n is odd
n = n * 3 + 1;
}
}
}
}**/
