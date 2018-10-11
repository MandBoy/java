import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class FromZeroToHundred {
   
   //
   public static int choiceToStop = 1;
   //actor vars
   public static int playerTotalScore = 0;
   public static int playerRunningSum = 0;
   
   //opponent vars
   public static int opponentTotalScore = 0;
     
   public static void main(String[] args) {
       
       System.out.println("Who Starts?\n1. Opponent\n2. Actor");
       boolean playerStarts = false;
       int choice = readInt();
       switch (choice) {
         case 1: playerStarts = false;
                 break;
         case 2: playerStarts = true;
                 break;
         default:
                 break;            
       }
       startGame(playerStarts);   
   }

   public static void startGame(boolean playerStarts) {
      int round = 1;         
      
      while (choiceToStop != 2) {
         System.out.println("----------------------------------\nRound no: " + round++);
         displayCurrentScores();
         
         //opponent starts
         if (playerStarts == false){
            setOpponentScore();
         }
         
         //players turn
         if(playerTotalScore <= opponentTotalScore){           
            System.out.println("Aggressive Playstyle");        
            playerTotalScore += throwDice(3);
         }
         else if(playerTotalScore >= opponentTotalScore){
            System.out.println("Defensive Playstyle");
            playerTotalScore += throwDice(2);
         }
         //opponent ends
         if (playerStarts == true){
            setOpponentScore();
         }
         
         if (playerTotalScore >= 100) {
            System.out.println("Player: You've reached: " + playerTotalScore);
            System.out.println("Opponent has last chance to score");
            setOpponentScore();
            choiceToStop = 2;
         }
         else if (opponentTotalScore >= 100) {
            System.out.println("Opponent: You've reached: " + opponentTotalScore);
            System.out.println("Player has last chance to score");
            choiceToStop = 2;
            
               int runningSum = -1;
              
               while (playerTotalScore <= opponentTotalScore && runningSum != 0){
               runningSum = throwDice(1);
               if (runningSum == 0){
                  runningSum = 0;
               }     
           }      
        }          
      } 
      System.out.println("-----Final Scores -----\nPlayer scores: " + playerTotalScore + "\nOpponent Total Score: " + opponentTotalScore);              
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
      return ThreadLocalRandom.current().nextInt(1, 6 + 1);
   }
 
   public static void displayCurrentScores(){
      System.out.println("Opponent Current Score: " + opponentTotalScore);
      System.out.println("Player current Score: " + playerTotalScore);
   }
   public static void setOpponentScore(){
      System.out.println("Set opponent running sum");
      opponentTotalScore += readInt();
   }
   
   public static int throwDice(int times) {
      playerRunningSum = 0;
      int dice;
      while(times != 0){
        times--;
        dice = getRandomInt();
        System.out.println("Dice: " + dice);      
        if(dice == 1) {
         times = 0;
         playerRunningSum = 0;
        }
        else {
         playerRunningSum += dice;
        }
      }
      System.out.println("Total Player Running Sum: " + playerRunningSum);
      return playerRunningSum;
   } 
}