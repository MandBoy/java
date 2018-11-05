public class Transfer{
   
   private int transferNo = 1000;
   private static int instanceCounter = 0;
   private final int withdrawFromAcc;
   private final int depositToAcc;
   private final int amount;
   
   public Transfer(int withdrawFromAcc, int depositToAcc, int amount){
   instanceCounter++;
   this.transferNo = instanceCounter;
   this.withdrawFromAcc = withdrawFromAcc;
   this.depositToAcc = depositToAcc;
   this.amount = amount;
   
   }
   public void confirm(){
   
   }
   
}