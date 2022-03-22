package main;

import java.awt.*;

public class Control implements Runnable {


    //private Image img;
    private Gegner gegner;
    private Spieler spieler;
    private int level = 1;
    public Control(){

        GUI gg=new GUI();

    }

   public void movePlayer(String d){
        switch(d){
            case "left":
                if(){
                    spieler.steuerung("left");
                }

                break;
            case "right":
                if(){
                    spieler.steuerung("right");
                }
                break;
            case "up":
                if(){
                    spieler.steuerung("up");
                }
                break;
            case "down":
                if(){
                    spieler.steuerung("down");
                }
                break;
        }



    }

    @Override
    public void run() {

    }

    public void start() {
        Thread program = new Thread(this);
        program.start();
    }
}
