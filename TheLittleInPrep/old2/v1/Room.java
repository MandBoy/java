public class Room    {
   int roomNumber;
   int size;
   double price;
   boolean clean;
   boolean availability;
   //overvej occupied istedet for availability?
   
   Room() {}
   Room(int roomNumber, int size, double price){
      this.roomNumber = roomNumber;
      this.size = size;
      this.price = price;
      this.clean = true;
      this.availability = true;
   }
   
   public int getRoomNumber(){ return this.roomNumber; }
   
   public int getSize() {  return this.size; }
   public void setSize(int size) { this.size = size; }
   
   public double getPrice(){  return this.price; }
   public void setPrice(double price) { this.price = price; }
   
   public boolean getClean(){ return this.clean; }
   public void setClean(boolean clean) { this.clean = clean; }
   
   public boolean getAvailability() { return this.availability; }
   public void setAvailability(boolean availability) { this.availability = availability; }
   
   public String toString() {
      return "Room No: " + roomNumber + " Price: " + price + " Clean: " + clean + " Available: " + availability;
   }
   
   public boolean equals(Room room) {
      if(this.roomNumber == room.getRoomNumber()){
         return true;
      }
      else {
         return false;
      }
   }
   

}