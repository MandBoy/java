public class NumberMain
{
   public static void main(String[] args)
   {
      //objekter med konstruktør fra NumberEx
      NumberExample tal1 = new NumberExample(6.2,4.2);
      NumberExample tal2 = new NumberExample(4.5,2.5);
      
      //metodekald på toString fra NumberEx
      System.out.println(tal1.toString());
      //metodekald på equals fra NumberEx     
      System.out.println(tal1.equals(tal2));
      //metodekald på contain fra NumberEx
      System.out.println(tal1.contain(3.6));
   }
}