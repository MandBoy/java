class createCustomer {
   int customerID = 1;
   
   public void createNewCustomer(String newCustomerName, String newCustomerAddress, int newCustomerPhone, String newCustomerMailAddr){
      customerID++;
      String customerName = newCustomerName;
      String customerAddress = newCustomerAddress;
      int customerPhone = newCustomerPhone;
      String customerMailAddr = newCustomerMailAddr;       
   }

}