public class Customer {
   int passportNumber;
   String guestName;
   
   Customer() {}
   
   Customer(int passportNumber, String guestName) {
      this.passportNumber = passportNumber;
      this.guestName = guestName;
   }
   
   public int getPassportNumber(){ return this.passportNumber; }
   public void setPassportNumber(int passportNumber) { this.passportNumber = passportNumber; }
   
   public String getGuestName(){ return this.guestName; }
   public void setGuestName(String guestName) { this.guestName = guestName; }
   
   public String toString(){
      return "Guestname: " + guestName + " Passport Number: " + passportNumber;
   }
   public boolean equals(Customer cust){
      if(this.passportNumber == cust.getPassportNumber() && this.guestName == cust.getGuestName()){
         return true;
      }
      else { 
      return false;
      }
   }
}