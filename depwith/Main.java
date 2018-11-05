public class Main {

   public static void main(String[] args){
      Account account1 = new Account();
      Account account2 = new Account();
      
      account1.deposit(100);
      account2.withdraw(100);
      account1.printAccount();
      account2.printAccount();      
   }
}