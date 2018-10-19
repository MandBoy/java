public class ReservationSystem {
   
   //one room, one reservation, one day
   public static Reservation[] reservations = new Reservation[2];
   public static Room[] room = new Room[2];
   
   public static void main(String[] args) {
            
            //opret rooms
            for(int i = 0; i < room.length; i++) {
               room[i] = new Room(i, 3, 500);
             }
             
             //Opret customers
             Customer customer1 = new Customer(10120302, "Andreas Rømer");
             Customer customer2 = new Customer(20929292, "Lone Hansen");
             
             //opret reservationer.
             reservations[0] = new Reservation(room[0], customer1);
             reservations[1] = new Reservation(room[1], customer2);
             
             //list alle reservationer
             System.out.println(listReservations());
             
             //"søg" på en reservation med reservationid
             System.out.println(listReservation(10001));
                            
         }
    //List Èn reservation
    public static String listReservation(int reservationid) {
      String reservation = "";
      for (int i = 0; i < reservations.length; i++) {
         if(reservations[i].getReservationid() == reservationid) {
         reservation += reservations[i].toString(); 
         }
      }
      return reservation;
   }
   
   public static String listReservations() {  
      String allReservations = "";
      for(int i = 0; i < reservations.length; i++) {
         allReservations += reservations[i].toString() + "\n";
      }   
      return allReservations;
   }

}