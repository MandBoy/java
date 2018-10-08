import java.util.concurrent.TimeUnit;
public class skabelon {
   public static void main(String[] args) {
   //udregn tid
   long lStartTime = System.currentTimeMillis();
  
  //program her 
   
   //udskriv tid.
   long lEndTime = System.currentTimeMillis();
   long output = lEndTime - lStartTime;
   System.out.println("Elapsed time in milliseconds: " + output);

   }
}