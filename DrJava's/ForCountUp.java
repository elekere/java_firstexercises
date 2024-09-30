public class ForCountUp {

/**
 * This class uses the For Loop in counting 
 * up by two -- displaying only even numbers
 * */

public static void main (String args []) {

countUp(0);

}

public static int countUp (int counts) {

counts = 0;

for (int a = 7; a <= 10 && a >= -10; a--) {
counts = counts + a;
//System.out.println(counts);
//System.out.println(a);

}

return counts;

}


}
