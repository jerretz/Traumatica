package main;

public abstract class Entity {

    protected int xPos;
    protected int yPos;

    public Entity(int x, int y) {

        this.xPos = x;
        this.yPos = y;

    }

    abstract void steuerung(String s);

    public void setPosY(int y) {
        this.yPos = y;
    }
     public int getPosY() {
        return this.yPos;
     }

    public void setPosX(int x) {
        this.xPos = x;
    }
    public int getPosX() {
        return this.xPos;
    }

}
