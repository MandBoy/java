class Account {
   String accountFullName;
   int accountID;
   double bankroll;
   
   void transaction(double amount){
      bankroll = bankroll + amount;
   }
   void printBankroll(){
      System.out.println("Full name: " + accountFullName);
      System.out.println("Account: " + accountID);
      System.out.println("Current bankroll: " + bankroll);
   }
}