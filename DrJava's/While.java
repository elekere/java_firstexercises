public class While {

public static void main (String args []) {

//countdown (3);

//sequence (3);

sequenceTwo();

System.out.println();

isBook(); 

}

public static void countdown (int n) {

String oroma = "orange";
while (n > 0) {
System.out.println (n);
n = n - 1;
} 
System.out.println ("Blastoff!" + oroma);


}

public static void sequence (int n) {

while (n != 1) {
System.out.println (n);
if (n % 2 == 0) {
n = n/2;
} 
else {
n = n * 3 + 1;
}
}
}

public static void sequenceTwo () {

int i = 1;
while (i < 10) {
double x = i;
System.out.println(x + "   " + Math.log(x));
i = i + 1;
}
}

public static void isBook() {
      boolean isBookBorrowed = true;
   if (isBookBorrowed = true) {
      
         System.out.println("Okay.");
   }
   
   else {
   System.out.println("No.");
   
   }
   }

}