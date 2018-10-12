import java.util.ArrayList;
public class Test {
   ArrayList<Integer> runningSum;
   ArrayList<Integer> savePointsOfTurn;
   ArrayList<Integer> saveCountsOfThrow;
   int runningSumTotal = 0;
   Dice dice = new Dice();
   int runTimes = 100000;
   
   public Test(){
      runningSum = new ArrayList<Integer>();
      savePointsOfTurn = new ArrayList<Integer>();
      saveCountsOfThrow = new ArrayList<Integer>();

      for (int i = 0; i < runTimes; i++){
         int diceNumber = 0;
         while (diceNumber != 1) {
            diceNumber = dice.throwDice();
            runningSum.add(diceNumber);
         }
         savePointsOfTurn.add(sum(runningSum) - 1);         
         runningSum = new ArrayList<Integer>();

      }
         //beregn gennemsnit af array   
         double sum = 0;
         double laengdeAfArray = 0;
         
         for (int i = 0; i < savePointsOfTurn.size(); i++){
            sum += savePointsOfTurn.get(i);
            laengdeAfArray++;
         }
           System.out.println("Sum: " + sum + "\nLaengde af array: " + laengdeAfArray);
           double average =  sum / laengdeAfArray;
           System.out.println("Gennemsnitlige running sum: " + average);


   }
   
   
   public static int sum(ArrayList<Integer> runningSum) {
    int sum = 0;
    for (int i: runningSum) {
        sum += i;
    }
    return sum;
   }
}