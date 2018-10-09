import java.util.Scanner;


public class FromZeroToHundred {
   
   
   //actor vars
   public static int playerTotalScore = 0;
   public static int playerRunningSum = 0;  
   
   //opponent vars
   public static int opponentCurrentScore = 0;
     
   public static void main(String[] args) {
   
       int choice = displayMenu();
       //opponent turn
       if(choice == 1) {
         setOpponentScore();
         startGame();
       }
       //players turn
       else if(choice == 2) {
         startGame();
       
       }
       else {
         displayMenu();
       }
          
   }
   

//system methods.  

   public static void startGame() {
      displayCurrentScores();
      
   }
   public static int readInt() {
      Scanner scanner = new Scanner(System.in);
      try {
         return scanner.nextInt();
      } catch(Exception e) {
         return readInt();
      }
   }
   public static int getRandomInt() {
      return (int)(Math.random()*6)+1;
   }
 
   public static int displayMenu(){
      System.out.println("Who Starts?\n1. Opponent\n2. Actor");
      return readInt();
   }
  
   public static void displayCurrentScores(){
      System.out.println("Opponent Current Score: " + opponentCurrentScore);
      System.out.println("Player current Score: " + playerTotalScore);   
   }
   public static void setOpponentScore(){
      opponentCurrentScore += readInt();
   }
   
   public static int throwDice() {
      return getRandomInt();  
   }
   
   public static int playersTurn() {
      //throwDice();
      return 0;
   }
   
}