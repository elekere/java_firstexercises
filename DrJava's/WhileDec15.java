public class WhileDec15 {

public static void sequenceOne () {

int i = 1;
while (i < 10) {
double x = i;
System.out.println(x + "   " + Math.log(x));
i = i + 1;
}
}

public static void sequenceTwo () {

int i = 1;
while (i < 10) {
double x = i;
System.out.println(x + "   " + Math.log(x) / Math.log(2));
i = i + 1;
}
}

    String [] igboDays = {"Eke", "Orie", "Afo", "Nkwo"};

public static void sequenceThree() {
final double LOG2 = Math.log(2);
int i = 1;
while (i <  100) {
double x = i;
System.out.println(x + "    " + Math.log(x)/LOG2 );
i = i * 2;
}
}

public static void main (String args []) {

//sequenceOne ();
//sequenceTwo();
sequenceThree();
}
}