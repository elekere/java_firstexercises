import java.util.Scanner;
public class Oct25b {
public static void main (String[] args) {

int jiHa;
int jiUnu;

Scanner scan = new Scanner (System.in);
System.out.println ("ji ole ka unu nwere?");
jiUnu = scan.nextInt();

System.out.println ("ji ole ka ha nwere?");
jiHa = scan.nextInt();

if ( jiHa>jiUnu) System.out.println ("ji ha nwere ka nke unu nwere");
if (jiHa<jiUnu) System.out.println ("ji unu nwere ka nke ha nwere");
}
}

