//enum er et set af predefinerede konstanter.
//Fordi det er konstanter skrives felterne med uppercase

class EnumTest {

   public static void main(String[] args) {
      Enum firstDay = new Enum(Day.MONDAY);
   }
   //constructor
   public EnumTest(Day day){
      this.day = day;
   }
   
   public void tellItLikeItIs() {
      switch (day) {
         case MONDAY:
            System.out.println("Mondays are bad");
            break;
         case FRIDAY:
            System.out.println("Fridays are better");
            break;
         case SATURDAY: case SUNDAY:
            System.out.println("Weekends are the best");
            break;
         default:
            System.out.println("Midweek days are so-so");
            break;
      
      }  
   }
}

/*   public enum Day {
   SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY

   } */
