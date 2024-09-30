public Jan21ProgRun2 {
   
   public static void main (String [] args) {
   
      ContactsManager ggConMang = new ContactsManager();
      
      Contact newCon1 = new Contact();
      
      newCon1.name = "Udo";
      newCon1.phoneNumber = 08012345678;
       ggConMang.addContact(newCon1);
      
      Contact newCon2 = new Contact();
      newCon2.name = "Jerry";
      newCon2.phoneNumber = 08087654321;
       ggConMang.addContact(newCon2)
          
          Contact result = ggConMang.searchContact("Jerry");
       
       System.out.println (result.PhoneNumber);
          
   
   
   }


}