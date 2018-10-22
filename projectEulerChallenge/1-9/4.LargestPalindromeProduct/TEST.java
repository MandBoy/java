public class TEST {
   public static void main(String[] args) {

   String str = "testString";

//[t, e, s, t, S, t, r, i, n, g]
   Character[] charObjectArray = 
       str.chars().mapToObj(c -> (char)c).toArray(Character[]::new);
      
      
      System.out.println(charObjectArray[1].toString());

      }
     
}