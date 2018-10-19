import java.util.concurrent.TimeUnit;
public class skabelon {
   public static void main(String[] args) {
   //start tid
   long lStartTime = System.currentTimeMillis();
   //------------------------------------------
   
   
   
   
   //------------------------------------------
   //udskriv tid.
   long lEndTime = System.currentTimeMillis();
   long output = lEndTime - lStartTime;
   System.out.println("Elapsed time in milliseconds: " + output);

   }
}