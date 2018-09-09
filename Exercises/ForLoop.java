import java.util.Scanner;
class ForLoop {
      public static void main(String[] args) {
      
      
         //Exercise 1 
         //Code:         
       /*
         int sum = 0;
      
         for(int i = 1; i < 101; i++) {
            sum = sum + i;
            
         }
         System.out.println(sum);
       */  
       
       
         //Exercise 2 
         //Take user impurt and print out table. userinput * 10
         //husk import java.util.Scanner;
         //Code:
       /*Scanner reader = new Scanner(System.in);
         System.out.println("Enter a number: ");
         int n = reader.nextInt();
         reader.close();
         System.out.println("You entered: " + n);
         
         for (int i = 0; i <= n; i++){
            int sum = i * 10;
            System.out.println(i + " times 10 = " + sum);
         }
       */
         
         //Exercise 3
         //Use for loop to print odd numbers
         //Code:
         
         for (int i = 0; i < 50; i++){
            if(i%2 != 0){
               System.out.println(i);
            }
         }
         
         
       }
         
    
}