//Inspiration herfra https://docs.oracle.com/javase/tutorial/essential/regex/test_harness.html
import java.util.regex.Pattern;
import java.util.regex.Matcher;

class Regex 
{
   private final String regexOnlyNumbers = "^[0-9]*$";
   private boolean patternFound = false;
   
   public void regexOnlyNumbers(String checkString) 
   {
      Pattern pattern = Pattern.compile(regexOnlyNumbers);
      Matcher matcher = pattern.matcher(checkString);    
      if(matcher.find()) {
         System.out.println("Match!");
      }
      else{
         System.out.println("No Match!");
      }
         
      /*        Pattern pattern = 
            Pattern.compile(console.readLine("%nEnter your regex: "));

            Matcher matcher = 
            pattern.matcher(console.readLine("Enter input string to search: "));
            
               boolean found = false;
            while (matcher.find()) {
                console.format("I found the text" +
                    " \"%s\" starting at " +
                    "index %d and ending at index %d.%n",
                    matcher.group(),
                    matcher.start(),
                    matcher.end());
                found = true;
            }
            if(!found){
                console.format("No match found.%n");
            }*/
   }
}