import java.io.Console;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

class GetInput
{
   Console console = System.console();
   private String var1;
   private String var2;
   boolean checkNumber = false;
   
   //regex
   private String onlyNumbers = "^[0-9]*$";
   
   public void getInput() 
   {
      System.out.println("Indtast var1: ");
      var1 = console.readLine();
      checkNumber = regexOnlyNumbers(var1);
      
      //System.out.println("Var1: " + var1);
      //var2 = console.readLine();
      //System.out.println("Var2: " + var2);
   }
   
   public void regexOnlyNumbers(String var) 
   {
      Pattern pattern = Pattern.compile(onlyNumbers);
      
      Matcher matcher = pattern.matcher(var);
      
      boolean found = false;
      while (matcher.find()) {
         found = true;
         return found;
      }
      
      if (!found) {
         System.out.println("No match found");
         return false;
      }
   }
   

}