//Inspiration herfra https://docs.oracle.com/javase/tutorial/essential/regex/test_harness.html
import java.util.regex.Pattern;
import java.util.regex.Matcher;

class Regex 
{
   private final String regexOnlyNumbers = "^[0-9]*$";
   boolean patternFound = false;

   
   public boolean regexOnlyNumbers(String checkString) 
   {  
      Pattern pattern = Pattern.compile(regexOnlyNumbers);
      Matcher matcher = pattern.matcher(checkString); 
      //match   
      if(matcher.find()) {
         patternFound = true;
         return patternFound;
      }
      //no match
      return patternFound;
         
   }
   
   //check om hvis der kører flere om patternfound bliver ved med at være true?
}