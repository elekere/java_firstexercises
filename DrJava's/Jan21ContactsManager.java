public class Jan21ContactsManager {
 
   // Fields

   int friendsCount;
   Contact [] myFriends;
   
   // Constructor:
   
   public ContactsManager() {
   
      this.friendsCount = 0;
      this.myFriends = new Contact[400];
      
      // Methods:
      
      public void addContacdt (Contact contact) {
      
         myFriends [friendsCount] = contact;
         friendsCount++;
      
      }
      
      Contact searchContact (String searchName) {
      
         for (int i = 0; i < friendCount; i++) {
         
            if (myFriends[i].name.equals(searchName)) {
            
               return myFriends[i];
            
            }
         
         }
         return null;
      
      }
   
   }
}