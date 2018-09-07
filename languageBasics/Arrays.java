class Arrays {
   public static void main(String[] args) {
      
      //declare array.
      int[] anArray;
      
      //allocate memory for 5 ints
      anArray = new int[5];
      
      anArray[0] = 100;
      anArray[1] = 200;
      anArray[2] = 300;
      anArray[3] = 400;
      anArray[4] = 500;
      
      System.out.println("Element at index 0: "
                           + anArray[0]);
        System.out.println("Element at index 1: "
                           + anArray[1]);
        System.out.println("Element at index 2: "
                           + anArray[2]);
        System.out.println("Element at index 3: "
                           + anArray[3]);
        System.out.println("Element at index 4: "
                           + anArray[4]);     
                    
      System.out.println("Array længde; " + anArray.length);
      
      
   }

}