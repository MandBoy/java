import java.util.ArrayList;

public class Arraylist {
   public static void main(String[] args) {
      //create array.
      ArrayList al = new ArrayList();
      System.out.println("Initialsize of array: " + al.size());
      al.add("C");
      al.add("A");
      al.add("E");
      al.add("B");
      al.add("D");
      al.add("F");

      
      //INDSÆT PÅ PLADS ET. Felt 1 bevares og bliver til 2.
      al.add(1, "A2");
      System.out.println("Size of al after additions: " + al.size());
      
      //display array list
      System.out.println("Contents of al: " +   al);
      
      //remove elements from arraylist
      al.remove("F");
      al.remove(2);
      System.out.println("Size of al after deletions: " + al.size());
      System.out.println("Contents of al: " + al);
      
      //update / set array item.
      
      al.set(4, "HEJ");
      System.out.println("Contents of al: " + al);
                
   }
}