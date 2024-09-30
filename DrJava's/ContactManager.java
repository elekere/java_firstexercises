public class ContactManager {
// Fields
   Contact [] myFriends;
   int friendsCount;
   
// Constructor
   ContactManager() {
      
   this.friendsCount = 0;
   this.myFriends = new Contact [200];
   
}

// Methods
   void addContact (Contact contact) {

   myFriends[friendsCount] = contact; // a variety is --> xyz[1] = abc;
   friendsCount++;

/**
 * for the array used in this method, this is an illustration:
 * String [] name = new String[2];
 * name[0] = "opi";
 **/
   }
   
   Contact searchContact (String searchName) {
   
      for (int i =0; i < friendsCount; i++) {
         
         
// I modified the default 'myFriends[i].name' to 'myFriends[i].getName()'
// because I made the field -- 'name' -- private in the Contact class
         if (myFriends[i].getName().equals(searchName)) {
            return myFriends[i];
         
         }
         
      }
   return null;
   }
   
}