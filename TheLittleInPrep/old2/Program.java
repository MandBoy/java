import Reservations.*;
public class Program {
   public static void main(String[] args) {
   
      Room[] room = new Room[5];
      
      //Student[] students = new Student[4]; 
      
      room[0] = new Room(1, 2, 500);
      room[1] = new Room(1, 2, 500);
      room[2] = new Room(1, 2, 500);
      room[3] = new Room(1, 2, 500);
      room[4] = new Room(1, 2, 500);
      
      System.out.println(room[0].getRoomNumber());
      System.out.println(room[0].getSize());
      System.out.println(room[0].getPrice());
      System.out.println(room[0].getClean());
      System.out.println(room[0].getAvailability());
      
   }
}