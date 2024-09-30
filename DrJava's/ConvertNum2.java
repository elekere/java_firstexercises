import java.util.Scanner;

public class ConvertNum2 {

public static void main (String[] args) {

Scanner scan = new Scanner (System.in);

System.out.println ("Kedu akara Arabik di gi n'obi? (1 - 20)");  // requests for Arabic numeral
int akara = scan.nextInt();

switch (akara) {

case 1: Explain ("'Otu'");
break;
case 2: Explain ("'Abuo'");
break;
case 3: Explain ("'Ato'");
break;
case 4: Explain ("'Ano'");
break;
case 5: Explain ("'Ise'");
break;
case 6: Explain ("'Isii'");
break;
case 7: Explain ("'Asaa'");
break;
case 8: Explain ("'Asato'");
break;
case 9: Explain ("'Itoolu'");
break;
case 10: Explain ("'Iri'");
break;
case 11: Explain ("'Iri na Otu'");
break;
case 12: Explain ("'Iri na Abuo'");
break;
case 13: Explain ("'Iri na Ato'");
break;
case 14: Explain ("'Iri na Ano'");
break;
case 15: Explain ("'Iri na Ise'");
break;
case 16: Explain ("'Iri na Isii'");
break;
case 17: Explain ("'Iri na Asaa'");
break;
case 18: Explain ("'Iri na Asato'");
break;
case 19: Explain ("'Iri na Itoolu'");
break;
case 20: Explain ("'Iri Abuo'");
break;
default: System.out.println ("Akara I denyere esoghi. Denye akara no na agbata '1 - 20'. Ndeewo.");

}


}
 
public static void Explain (String okwuIgbo) //explains the action on 'okwuIgbo' 

{

System.out.println ("Ihe oputara na okwu igbo bu " + okwuIgbo);
                    
                    }

}