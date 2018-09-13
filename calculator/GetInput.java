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
      do 
      {
         System.out.println("Var1: Indtast 1. nummer: ");
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
         System.out.println("Var2: Indtast +/-/*//");
         var2 = console.readLine();
         if(regex.onlyMathSigns(var2))
         {
            inputs[1] = var2;
//            System.out.println("Nummer: " + inputs[1] + " er ok");
         }
         else
         {
            System.out.println("Var2: Indtast +/-/*//");
         }
      }
      while (inputs[1] == null);
      
      do
      {
         System.out.println("Var3: Indtast 2. nummer: ");
         var3 = console.readLine();
         if(regex.onlyNumbers(var3))
         {
            inputs[2] = var3;
//            System.out.println("Nummer: " + inputs[1] + " er ok");
         }
         else
         {
            System.out.println("Var3: Indtast venligst et nummer 0-9");
         }
      }
      while (inputs[2] == null);
      return inputs;
   }
}