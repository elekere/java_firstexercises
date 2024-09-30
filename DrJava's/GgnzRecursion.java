public class GgnzRecursion {

public static void main (String [] args) {

forever("endless");  
}

public static void forever (String s) {
        System.out.println(s);
        forever(s);
}

}