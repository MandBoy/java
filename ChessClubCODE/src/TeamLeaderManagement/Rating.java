package TeamLeaderManagement;

import ChessSystem.InputHandler.*;

//Noter omkring klassen -
//Forslag til forbedringer.
//1. Bør der bruges klassen Date til tournamentDate?

public class Rating {
    Reads input;
    private static int listID;
    private int memberNumber;
    private double playerRating;
    private String tournamentName;
    private String tournamentDate;

    //public Rating(){}
    public Rating(){
        input = new Reads();

        System.out.println("Skriv List id(Skal fixes - bør autogeneres.)");
        this.listID = input.readInt();

        System.out.println("Skriv member nummer (Skal fixes - bør autogeneres.)");
        this.memberNumber = input.readInt();

        System.out.println("Rating");
        this.playerRating = input.readDouble();

        System.out.println("Tour name");
        this.tournamentName = input.readString();

        System.out.println("Tour date");
        this.tournamentDate = input.readString();

        System.out.println("Rating oprettes..");


    }

    public String toString(){return listID + ";" + memberNumber + ";" + playerRating + ";" + tournamentName + ";" + tournamentDate;}

}
