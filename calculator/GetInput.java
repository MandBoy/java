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
<<<<<<< HEAD
   {  
      
      //2 do while loops bÃ¸r laves til en forlÃ¸kke.¨     
=======
   {
>>>>>>> 3875609bab73cd1e4c7709a8c9d1fdfd3f49dd24
      do 
      {
         System.out.println("Var1: Indtast 1. nummer: ");
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
<<<<<<< HEAD
         System.out.println("Indtast operator: +-*/ ");
=======
         System.out.println("Var2: Indtast +/-/*//");
>>>>>>> 3875609bab73cd1e4c7709a8c9d1fdfd3f49dd24
         var2 = console.readLine();
         if(regex.onlyMathSigns(var2))
         {
            inputs[1] = var2;
         }
         else
         {
<<<<<<< HEAD
            System.out.println("Error: Var2: Indtast venligst et nummer 0-9, prøv igen");
         }
      }
      while (inputs[1] == null);
      return inputs;    
    }

      
      do
      {
         System.out.println("Indtast var2: ");
=======
            System.out.println("Var2: Indtast +/-/*//");
         }
      }
      while (inputs[1] == null);
      
      do
      {
         System.out.println("Var3: Indtast 2. nummer: ");
>>>>>>> 3875609bab73cd1e4c7709a8c9d1fdfd3f49dd24
         var3 = console.readLine();
         if(regex.onlyNumbers(var3))
         {
            inputs[2] = var3;
<<<<<<< HEAD
         }
         else
         {
            System.out.println("Error: Var2: Indtast venligst et nummer 0-9, prøv igen");
         }
      }
      while (inputs[2] == null);
      return inputs;    
    }
    
   
=======
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
>>>>>>> 3875609bab73cd1e4c7709a8c9d1fdfd3f49dd24
}