import java.util.Scanner;


public class FromZeroToHundred {
   
   
   //actor vars
   public static int playerTotalScore = 0;
   public static int playerRunningSum = 0;  

   
   //opponent vars
   public static int opponentCurrentScore = -1;
   
   //dice
   public static int dice;
     
   public static void main(String[] args) {
       //show menu
       displayMenu();
       
       //input
       int choice = readInt();
       
       //if opponent starts
       if(choice == 1) {
         opponentCurrentScore++;
         setOpponentScore();
         startGame();
       }
       //if player starts
       else if(choice == 2) {
         startGame();
       }
       else {
         displayMenu();
       }
          
   }
   

//system methods.  

   public static void startGame() {
      
      if (opponentCurrentScore == -1){
         opponentCurrentScore++;
      }

      if (opponentCurrentScore == playerTotalScore) {
         for (int i = 0; i < 4; i++) {
            dice == throwDice();
            if(dice == 1) {
               i += 10;
            }
            playerRunningSum += dice();      
         }      
      }
      
      
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
   public static void displayCurrentScores(){
      System.out.println("Opponent Current Score: " + opponentCurrentScore);
      System.out.println("Player current Score: " + playerTotalScore);   
   }
   public static void displayCurrentRunningSum() {
      System.out.println("Player running sum: " + playerRunningSum);
   }
   public static void setOpponentScore(){
      System.out.println("Write opponent running sum: ");
      opponentCurrentScore += readInt();
   }
   public static int throwDice() {
      dice = getRandomInt();
      System.out.println("Dice: " + dice);
      return dice;
   }  
   public static void displayMenu(){
      System.out.println("Who Starts?\n1. Opponent\n2. Actor");  
   }
}