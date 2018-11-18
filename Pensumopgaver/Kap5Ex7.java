import java.util.Scanner;
public class Kap5Ex7{
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        diceSum(scan);
    }

    public static void diceSum(Scanner scan){
        System.out.println("Enter desired sum - 2 - 12");

        int desiredSum = scan.nextInt();
        int sum = -1;

        while(sum != desiredSum){
            int throwOne = (int)(Math.random() * 6) + 1;
            int throwTwo = (int)(Math.random() * 6) + 1;
            sum = throwOne + throwTwo;
            System.out.println(throwOne + " and " + throwTwo + " = " + sum);
        }
    }
}
