public class GGNzewiRecursion {

public static void main (String args []) {

factorial (7);

System.out.println (factorial(7));


}


public static int factorial (int n) {

if (n == 0) {

return 1;

}

int recurse = factorial (n - 1);
int result = n * recurse;
return result;

} 

public static int fibonacci (int n) {

if (n == 1 || n == 2) {

return 1;
}
return fibonacci (n -1) + (n -2);
}
}