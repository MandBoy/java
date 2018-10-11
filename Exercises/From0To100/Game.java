import java.util.ArrayList;
import java.util.Scanner;
public class Game {
   boolean running = false;
   int opponentScore = 0;
   int playerScore = 0;
   final int upperBoundScore = 100;
   ArrayList<Integer> runningSum;
   Dice dice = new Dice();
   int runningSumTotal = 0;
   
   
   public Game() {
       this.running = true;

    
       while(running) {
         
         //spil indtil en spiller når 100
         while(this.playerScore <= upperBoundScore && this.opponentScore <= upperBoundScore){
            playersTurn();
            opponentsTurn();
            displayScores();
            
         }
         
         this.running = false;       
      }
   }
   
   public void playersTurn(){
      runningSum = new ArrayList<Integer>();
      int diceNumber = 0;
      boolean lastRound = false;
      
      if(playerScore >= 100 || opponentScore >= 100) { lastRound = true; }
      
      while(diceNumber != 1 && playerScore <= opponentScore && lastRound == true){
         System.out.println("Players last turn");
         diceNumber = dice.throwDice();
         runningSum.add(diceNumber);
      }
      while (diceNumber != 1 && sum(runningSum) < 14 && lastRound == false) {
         diceNumber = dice.throwDice();
         runningSum.add(diceNumber);
      }
      
      if(diceNumber == 1) { 
      this.runningSumTotal = 0;
      playerScore += runningSumTotal; 
      }
      else {
      this.runningSumTotal = sum(runningSum); 
      playerScore += runningSumTotal; 
      }
       
   }
   public void opponentsTurn(){
   System.out.println("Set Total Score for opponent");
   this.opponentScore = readInt();
      
   }
   public void displayScores(){
      System.out.println("Running Sum: " + runningSum +" Total: " + runningSumTotal); 
      System.out.println("Player Total Sum: " + playerScore);
      System.out.println("Opponent Total Sum: " + opponentScore);
   }

   public static int readInt() {
      Scanner scanner = new Scanner(System.in);
      try {
         return scanner.nextInt();
      } catch(Exception e) {
         return readInt();
      }
   }
   public static int sum(ArrayList<Integer> runningSum) {
    int sum = 0;
    for (int i: runningSum) {
        sum += i;
    }
    return sum;
   }
}
