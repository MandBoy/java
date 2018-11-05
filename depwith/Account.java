public class Account {
   int accountNo = 0;
   static int instanceCounter = 1;
   double balance;
     
   public Account() {
      this.accountNo = this.instanceCounter;
      this.instanceCounter++;
      this.balance = 100;
   }
   
   public boolean withdraw(double withdrawAmount){
      if(balance >= withdrawAmount){
         this.balance -= withdrawAmount;
         return true;
      }
      System.out.println("Der er ikke dækning");
      return false;  
   }
   public void deposit(double depositAmount){
      this.balance += depositAmount;
   }
   public void printAccount(){
      System.out.println("Account No: " + this.accountNo + " balance: " + this.balance);
   }

}