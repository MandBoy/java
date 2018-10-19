package Reservations;

public class Room {
   private int roomNumber;
   private int size;
   private double price;
   private boolean clean;
   private boolean availability;
   
   public Room() {   }
   public Room(int roomNumber, int size, double price){
      this.roomNumber = roomNumber;
      this.size = size;
      this.price = price;
      this.clean = true;
      this.availability = true;
   }
   
   public int getRoomNumber() { return this.roomNumber; }
   
   public int getSize() {  return this.size; }
   public void setSize( int size ) { this.size = size; }
   
   public double getPrice() { return this.price; }
   public void setPrice( double price ) { this.price = price; }  
   
   public boolean getClean() { return this.clean; }
   public void setClean(boolean clean) { this.clean = clean; }
   
   public boolean getAvailability() {  return this.availability; }
   public void setAvailability ( boolean availability ) { this.availability = availability; }
   
   
   //equals mangler
}