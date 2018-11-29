package ChessSystem;

import TeamLeaderManagement.TeamLeaderMGMT;
import ChessSystem.InputHandler.*;

public class ChessSystem {
    private LoginFH loginFH = new LoginFH();
    //ChairmanMGMT charmanMGMT;
    //CashierMGMT cashierMGMT;
    TeamLeaderMGMT teamLeaderMGMT;
    Reads input;
    private boolean running;
    public ChessSystem(){

        running = true;
        while (running){
            showStartMenu();
            this.input = new Reads();
            switch (input.readInt()){
                case 1:
                    String role = Login();
                        switch (role){
                            case "chairman":
                                System.out.println("welcome to Chairman Management");
                                break;
                            case "cashier":
                                System.out.println("welcome to Cashier Management");
                                break;
                            case "teamleader":
                                System.out.println("welcome to Team Leader Management");
                                teamLeaderMGMT = new TeamLeaderMGMT();
                                break;
                            default:
                                System.out.println("Wrong username / password - try again");
                                break;
                        }
                    break;
                case 2:
                    break;
                case 9:
                    running = false;
                    break;

            }

        }
    }
    private String Login(){
        System.out.println("Enter username");
        String username = input.readString();
        System.out.println("Enter password");
        String password = input.readString();
        //check i databasen.
        String role = loginFH.verifyUserCredentials(username, password);
        return role;
    }
    private void showStartMenu() {
        System.out.println("--- Chess Club System ---");
        System.out.println("1. Login");
        System.out.println("2. Print Strengthlist");
        System.out.println("9. Exit");
    }
}
