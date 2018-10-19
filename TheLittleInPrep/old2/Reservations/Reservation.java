package Reservations;

public class Reservation {
   private int reservationid;
   public static int instancecounter = 1;
   private String fromDate;
   private String toDate;
   private Customer customer;
   private Room room;
   
   public Reservation() {}
   public Reservation(Room room, Customer customer, String fromDate, String toDate){
      this.room = room;
      this.customer = customer;
      this.fromDate = fromDate;
      this.toDate = toDate;
      this.reservationid = instancecounter++;
   }

   public int getReservationid(){ return this.reservationid; }
   //ingen set på reservation id
   
   public String getFromDate() { return this.fromDate; }
   public void setFromDate(String fromDate) { this.fromDate = fromDate; } 
   
   public String getToDate() {   return this.toDate; }
   public void setToDate(String toDate) { this.toDate = toDate; }
   
   public Room getRoom(){ return this.room; }
   public void setRoom(Room room) { this.room = room; }
   
   public Customer getCustomer() { return this.customer; }
   public void setCustomer(Customer customer) { this.customer = customer; }
   
   //Mangler og færdiggøress
   public boolean updateReservation() { return true; }
   public boolean deleteReservation() { return true; }
   public double calculateTotalCost() { return 0.0; }
   public String toString() { return ""; }

}