public class Reservation {
   int reservationid = 10000;
   public static int instanceCounter = 0;
   
   Customer customer;
   Room room;
   String dateOfBooking;
   
   Reservation(){ }
   
   Reservation(Room room, Customer customer) {
   
   this.instanceCounter++;
   this.reservationid += instanceCounter;
   this.dateOfBooking = "Today";
   this.customer = customer;
   this.room = room;
   this.room.setAvailability(false);
   } 
   
   public int getReservationid() {return this.reservationid; }
   
   public Customer getCustomer() {return this.customer;}
   public void setCustomer(Customer customer) { this.customer = customer; }
   
   public Room getRoom() { return this.room; }
   public void setRoom(Room room) { this.room = room; }
   
   public String getDateOfBooking() {return this.dateOfBooking;}
   public void setDateOfBooking(String dateOfBooking) { this.dateOfBooking = dateOfBooking; }
   
   public boolean updateReservation() { return true; }
   public boolean deleteReservation() { return true; }
   
   public String toString() { return "Reservation ID: " + this.reservationid + " Date: " + this.dateOfBooking + " Customer: " + customer.toString(); }
   
   public boolean equals(Reservation reservation) {
      if(this.reservationid == reservation.getReservationid()){
         return true;
      }
      else {
         return false;
      }
   } 
}