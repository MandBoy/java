import java.io.Console;
class GetInput
{
   Regex regex = new Regex();
   Console console = System.console();
   private String var1;
   private String var2;
   String[] inputs = new String[2];
   
   public String[] getInput() 
   {
      //2 do while loops bør laves til en forløkke.
      do 
      {
         System.out.println("Indtast var1: ");
         var1 = console.readLine();
         if(regex.onlyNumbers(var1))
         {
            inputs[0] = var1;
//            System.out.println("Nummer: " + inputs[0] + " er ok"); 
         }
         else 
         {
            System.out.println("Var1: Indtast venligst et nummer 0-9"); 
         }       
      }
      while (inputs[0] == null);
      
      
      do
      {
         System.out.println("Indtast var2: ");
         var2 = console.readLine();
         if(regex.onlyNumbers(var2))
         {
            inputs[1] = var2;
//            System.out.println("Nummer: " + inputs[1] + " er ok");
         }
         else
         {
            System.out.println("Var2: Indtast venligst et nummer 0-9");
         }
      }
      while (inputs[1] == null);
      return inputs;
   }
}