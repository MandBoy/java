//Inspiration herfra https://docs.oracle.com/javase/tutorial/essential/regex/test_harness.html
import java.util.regex.Pattern;
import java.util.regex.Matcher;

class Regex 
{  
   //Only Numbers 0-9 - kun heltal :(  
   private final String regexOnlyNumbers = "^[0-9]*$";
   //Only Letters a-zA-Z
   private final String regexOnlyLetters = "^[a-zA-Z]*$";

   //Only + - / *
   private final String regexOnlyMathSigns = "^[+-/]"; //mangler *
   
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
   
   public boolean onlyLetters(String checkString) 
   {  
      Pattern pattern = Pattern.compile(regexOnlyLetters);
      Matcher matcher = pattern.matcher(checkString); 
      //match   
      if(matcher.find()) {
         return true;
      }
      //no match
      return false;        
   }
   
   public boolean onlyMathSigns(String checkString) 
   {  
      Pattern pattern = Pattern.compile(regexOnlyMathSigns);
      Matcher matcher = pattern.matcher(checkString); 
      //match   
      if(matcher.find()) {
         return true;
      }
      //no match
      return false;        
   }
}