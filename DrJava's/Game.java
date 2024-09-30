public class Game {
   
  /**
   * 
   * public Game (String [] movies) {
   
      this.movieList = movies;
      
      movies = new String();
      
      */
    


      public static void main (String [] args) {
         
          String [] movieList = {"", "Aki Na Ukwa", "Ube na Oka", 
         "Osa Na Uze", "Egbe Na Nma", "Ji Na Ede"};
      
         
         RandomNumberGenerator ran = new RandomNumberGenerator();
         int randNum = ran.randomNumber(5);
      
         System.out.println("okay --> " + movieList[randNum]);
      
      }
}
