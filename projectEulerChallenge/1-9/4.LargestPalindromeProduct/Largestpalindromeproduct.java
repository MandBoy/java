import java.util.concurrent.TimeUnit;
public class Largestpalindromeproduct {
   public static void main(String[] args) {
   //start tid
   long lStartTime = System.currentTimeMillis();
   //------------------------------------------
   //tal fra 100 til 999
   //opret plads til array med 6 chars.
   Character[] charArray = new Character[6];
   
   //opret char array hvor højeste skal lægges.
   int number = 0;
   int highestNumber = 0;
   //int count = 0;
   
   for(int i = 100; i < 999 ; i++){
      for(int j = 100; j < 999; j++){
         int sum = i * j;
            //der skal være 6 digits i mit tal.
            if(sum > 99999){
               String str = String.valueOf(sum);
               charArray = str.chars().mapToObj(c -> (char)c).toArray(Character[]::new);
               //check om det er en palindrome.
               if(charArray[0] == charArray[5] && charArray[1] == charArray[4] && charArray[2] == charArray[3]){
                 String str2 = "";
                    for(int k = 0; k < charArray.length; k++){
                     str2 += charArray[k].toString();
                    }
                    number = Integer.parseInt(str2);           
                  if(number > highestNumber){
                     highestNumber = number;
                  }
                  
               }    
            }
      }
   }
   System.out.println(highestNumber);


   //------------------------------------------
   //udskriv tid.
   long lEndTime = System.currentTimeMillis();
   long output = lEndTime - lStartTime;
   System.out.println("Elapsed time in milliseconds: " + output);

   }
         
}