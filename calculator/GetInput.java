import java.io.Console;
class GetInput
{
   Regex regex = new Regex();
   Console console = System.console();
   private String var1;
   private String var2;
   String[] inputs = new String[1];
   
   public void getInput() 
   {
      //do 
      //{
      
         System.out.println("Indtast var1: ");
         var1 = console.readLine();
         if(regex.onlyNumbers(var1))
         {
            inputs[0] = var1;
            System.out.println("Nummer: " + inputs[0] + " er ok"); 
         }
         else 
         {
            System.out.println("Nummer bad"); 
         }

         
      //}
      //while (inputs[0] == null);
      

   }
}