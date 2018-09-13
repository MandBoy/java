import java.io.Console;
class GetInput
{
   Regex regex = new Regex();
   Console console = System.console();
   private String var1;
   private String var2;
   private String var3;
   String[] inputs = new String[3];
   
   public String[] getInput() 
   {  
      
      //2 do while loops bÃ¸r laves til en forlÃ¸kke.¨     
      do 
      {
         System.out.println("Indtast var1: ");
         var1 = console.readLine();
         if(regex.onlyNumbers(var1))
         {
            inputs[0] = var1; 
         }
         else 
         {
            System.out.println("Error: Var1: Indtast venligst et nummer 0-9, prøv igen"); 
         }       
      }
      while (inputs[0] == null);
      
      do
      {
         System.out.println("Indtast operator: +-*/ ");
         var2 = console.readLine();
         if(regex.onlyNumbers(var2))
         {
            inputs[1] = var2;
         }
         else
         {
            System.out.println("Error: Var2: Indtast venligst et nummer 0-9, prøv igen");
         }
      }
      while (inputs[1] == null);
      return inputs;    
    }

      
      do
      {
         System.out.println("Indtast var2: ");
         var3 = console.readLine();
         if(regex.onlyNumbers(var3))
         {
            inputs[2] = var3;
         }
         else
         {
            System.out.println("Error: Var2: Indtast venligst et nummer 0-9, prøv igen");
         }
      }
      while (inputs[2] == null);
      return inputs;    
    }
    
   
}