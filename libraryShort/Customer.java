class Customer {
   private String customerName;
   private String customerAddress;
   private int customerPhone;
   private String customerMailAddr;
   
   public Customer(String customerName, String customerAddress, int customerPhone, String customerMailAddr)
   {  
      this.customerName = customerName;
      this.customerAddress = customerAddress;
      this.customerPhone = customerPhone;
      this.customerMailAddr = customerMailAddr; 
   }

   public void printCustomer() {
      //System.out.println("Customer ID:\t" + customerID);
      System.out.println("customer Name:\t" + customerName);
      System.out.println("Address:\t" + customerAddress);
      System.out.println("Phone:\t" + customerPhone);
      System.out.println("Mail Address:\t" + customerMailAddr);
   }
}


   
  