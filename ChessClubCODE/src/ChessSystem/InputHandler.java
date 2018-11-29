package ChessSystem;

import java.util.Scanner;

public class InputHandler{

    public static class Reads {
        public static Scanner scanner = new Scanner(System.in);
        public Reads(){

        }
        public static String readString(){
            String str = scanner.next();
            return str;
        }
        public static int readInt() {
            while(!scanner.hasNextInt()) {
                scanner.next();
            }
            return scanner.nextInt();
        }
        public static double readDouble() {
            while(!scanner.hasNextInt()) {
                scanner.next();
            }
            return scanner.nextDouble();
        }

    }
}