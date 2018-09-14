import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.Month;

class DatoTid {
   public static void main(String[] args){
      
      LocalDate today = LocalDate.now();
      System.out.println(today);
      // 2018-09-14
      
      LocalDate dateOfBirth = LocalDate.of(2012, Month.MAY, 14);
      System.out.println(dateOfBirth);
      // 2012-05-14
      
      LocalDate firstBirthday = dateOfBirth.plusYears(1);
      System.out.println(firstBirthday);

   }
}