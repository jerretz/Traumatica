package main;

public class Spieler extends Entity{

    public Spieler(int x, int y){

        super(x,y);

    }


    @Override
    void steuerung(String s) {

        switch(s){

            case "left": xPos--;
            case "right": xPos++;
            case "up": yPos--;
            case "down": yPos++;
        }

    }
}
