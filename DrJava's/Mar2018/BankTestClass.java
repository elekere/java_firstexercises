public class BankTestClass {

   public static void main (String [] args) {
   
      Bank abc = new Bank_ABC();
      Bank ijk = new Bank_IJK();
      Bank lmn = new Bank_LMN();
   
      System.out.println(abc.getInterestRate());
      System.out.println(ijk.getInterestRate());
      System.out.println(lmn.getInterestRate());
   }
}