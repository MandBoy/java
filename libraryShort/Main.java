class Main {
   public static void main(String[] args) {
   
   //Create books
   Book ISBN1 = new Book();
   Book ISBN2 = new Book();   
   //Book1 - Available
   ISBN1.bookISBN = 1;
   ISBN1.bookCount = 3;
   //Book2 - Not available
   ISBN2.bookISBN = 2;
   ISBN2.bookCount = 0;
   
   //Create customer
   Customer customer1 = new Customer();
   customer1.customerID = 10;
   
   
   /*
    int customerID;
   String customerName;
   String customerAddress;
   int customerPhone;
   String customerMailAddr;
   */
   
   
   //ISBN1.printBookCount();   
   //ISBN2.printBookCount();
   ISBN1.loanBook(customer1.customerID);
   ISBN2.loanBook(customer1.customerID);
   WriteFile data = new WriteFile("D:/Temp\test.txt", true);
   }
}
