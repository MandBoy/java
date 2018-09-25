import java.util.ArrayList;

public class ArrayListObjects{
   public static void main(String[] args) {
      
      //opret arrayliste "list" af min klasse "Object".
      ArrayList<Object> list = new ArrayList<Object>();
      
      //opret nyt object
      Object object = new Object("Navn", "Input", 5);
      
      //tilføj object til array
      list.add(object);
      
      //set object
      object.newObject("Andreas", "inut", 10);
      
      //tilføj object til list
      list.add(object);
      System.out.println(list.size());
      
      //set object
      object.newObject("Jan", "inpput", 20);
      
      //update 1 til nyt object
      list.set(1, object);
      
      System.out.println(list.size());
   }
}