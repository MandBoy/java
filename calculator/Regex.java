//Inspiration herfra https://docs.oracle.com/javase/tutorial/essential/regex/test_harness.html
import java.util.regex.Pattern;
import java.util.regex.Matcher;

class Regex 
{
   private final String regexOnlyNumbers = "^[0-9]*$";
 
   public boolean onlyNumbers(String checkString) 
   {  
      Pattern pattern = Pattern.compile(regexOnlyNumbers);
      Matcher matcher = pattern.matcher(checkString); 
      //match   
      if(matcher.find()) {
         return true;
      }
      //no match
      return false;        
   }  
}