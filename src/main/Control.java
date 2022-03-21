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

        spieler.steuerung("left");
        //......

    }

    @Override
    public void run() {

    }

    public void start() {
        Thread program = new Thread(this);
        program.start();
    }
}
