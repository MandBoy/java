import java.util.ArrayList;
import java.util.Scanner;
public class Game {
   boolean running = false;
   int opponentScore = 0;
   int playerScore = 0;
   int round = 0;
   final int upperBoundScore = 100;
   ArrayList<Integer> runningSum;
   Dice dice = new Dice();
   int runningSumTotal = 0;
   boolean lastRound = false;
   
   
   public Game() {
       this.running = true;
       while(running) {      
         //spil indtil så længe begge spillere har en score under 100.
         while(this.playerScore <= upperBoundScore && this.opponentScore <= upperBoundScore){
            playersTurn();
            opponentsTurn();
            displayScores();
            
            if(playerScore >= 100) {
               System.out.println("Player reached >= 100 points - Opponents Last turn");
               lastRound = true;
               opponentsTurn();   
            }
            else if(opponentScore >= 100){
               System.out.println("Opponent reached >= 100 points - Players last turn.");
               lastRound = true;
               playersTurn();
            }
            
         }
         //Vis scores når spillet slutter
         displayScores();
         this.running = false;       
      }
   }
   //spillers tur.
   public void playersTurn(){
      runningSum = new ArrayList<Integer>();
      int diceNumber = 0;
      
      //Sidste runde
      while(diceNumber != 1 && playerScore <= opponentScore && lastRound == true){
         diceNumber = dice.throwDice();
         runningSum.add(diceNumber);
      }
      //"normale runder"
      while (diceNumber != 1 && sum(runningSum) < 18 && lastRound == false) {
         diceNumber = dice.throwDice();
         runningSum.add(diceNumber);
      }
      
      //Hvis der er slået 1 sættes runningSumTotal til 0
      if(diceNumber == 1) { 
      this.runningSumTotal = 0;
      playerScore += runningSumTotal; 
      }
      //ellers lægges runningSumTotal til playercore;
      else {
      this.runningSumTotal = sum(runningSum); 
      playerScore += runningSumTotal; 
      }
       
   }
   //modstanders tur - indtast TotalScoren. (ikke running sum);
   public void opponentsTurn(){
   System.out.println("Set Total Score for opponent");
   this.opponentScore = readInt();
      
   }
   //vis scores for hver runde
   public void displayScores(){
      this.round++;
      System.out.println("----------------\nRound no: " + round);
      System.out.println("Running Sum: " + runningSum +" Total: " + runningSumTotal); 
      System.out.println("Player Total Sum: " + playerScore);
      System.out.println("Opponent Total Sum: " + opponentScore);
   }
   //input (opponentScore)
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
