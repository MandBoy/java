public class Main 
{
   public static void main(String[] args) 
   {
      //Regex regex = new Regex();
      /*
      boolean x = regex.onlyLetters("1AA");
      System.out.println(x);
      boolean y = regex.onlyLetters("fFasdasdasdASDASD");
      System.out.println(y); */
      
      String[] inputs;
      GetInput getInput = new GetInput();
      inputs = getInput.getInput();
      
      Calculator calculate = new Calculator();
      calculate.calculate(inputs);
      
      
      

   }
}