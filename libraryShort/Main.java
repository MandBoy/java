class Main {
   public static void main(String[] args) {
   
   //Create books
   Book book1 = new Book(1234, "Authorname", 3, "drama");
   Book book2 = new Book(1235, "Authorname2", 0, "romance");   
      
   //Book book3 = new Book(1236, "Authorname3", 2, "Sci-Fi");
   book1.printBook();
   book2.printBook();

   
   //Create customer
   Customer customer1 = new Customer("Customer name1", "customerAdress 11", 22442244, "at@gmail.com");
   Customer customer2 = new Customer("Customer name2", "customerAdress 22", 22442244, "at@gmail.com");
   //customer1.setCustomer("Customer name1", "customerAdress 22", 22442244, "at@gmail.com");
   //customer1.printCustomer();
   //customer2.printCustomer();
   
   //Create 5 customer objects.
   Customer[] customer = new Customer[10];
   for (int i=0; i < 5; i++){
      customer[i] = new Customer("Customer name" + i, "customerAdress 11", 22442244, "at@gmail.com");
      customer[i].printCustomer();
      System.out.println("customer" + i + " oprettet");
   }
   
   //public void createCustomer(String customerName, String customerAddress, int customerPhone, String customerMailAddr

   //ISBN1.printBookCount();   
   //ISBN2.printBookCount();
   //ISBN1.loanBook(customer1.customerID);
   //ISBN2.loanBook(customer1.customerID);
   
   }
}
