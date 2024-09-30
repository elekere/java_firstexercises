public class Dec5Chap5Chap6 {

public static void main (String[] args) {
//for n number of lines
System.out.println("beginning");
nLines(4);
System.out.println("end");

//for countup of n
countup(4);
nLines(2);

//for displaying of binary
displayBinary (19);
nLines(2);
displayBinary (18);

nLines(2);

aPc(7);


}

public static void nLines(int n) {

if (n > 0) {
System.out.println();
nLines (n - 1);


}
}

public static void countup (int n) {

if (n == 0) {
System.out.println ("Blastoff!");
} else {
countup (n-1);
System.out.println(n);
}

}

public static void displayBinary(int value) {
if (value > 0) {
displayBinary(value / 2);
System.out.print(value % 2);
}
}


public static void aPc ( int x) {
 if (x > 0 && x < 10) {
 System.out.println("x is a single positive digit number");
 }
 }
 
}

/*
 * public static void displayBinary (int value) {
 
 if (n > 0) {
 
 displayBinary (value / 2);
 System.out.print (value%2);
 
 }
 
 public static void aPc ( int x) {
 if (x > 0 && x < 10) {
 System.out.println("x is a single positive digit number")
 }
 }
 
 
 * */