package Reservations;

public class Customer {
   
   private int passportNumber;
   private String guestName;
   
   public Customer() {}
   public Customer(int passportNumber, String guestName){
      this.passportNumber = passportNumber;
      this.guestName = guestName;
   }
   
   public boolean updateCustomer() { return true; }
   public boolean deleteCustomer() { return true; }
   public String toString() {
      return "Passport no: " + this.passportNumber + "GuestName: " + this.guestName;
   }
}