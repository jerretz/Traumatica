package main;

import main.Control;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class GUI extends JFrame implements KeyListener {

    private JPanel statusPanel;
    private JLabel status;
    private ImagePanel imagePanel;
    private Control control;

    public GUI(){
       this.setLayout(new BorderLayout());

        //imagePanel = new ImagePanel(image);
        //this.add(imagePanel, BorderLayout.NORTH);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Labyrinth");
        //setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getClassLoader().getResource("./images/baran.jpg")));
        this.setLocation(40,120);
        this.setSize(200,200);
        //this.pack();
        this.setVisible(true);
        //this.control = c;
       // imagePanel.addKeyListener(this);
        //imagePanel.requestFocus();
    }




public class ImagePanel extends Panel {
    private Image image;

    public ImagePanel(Image image) {
        setImage(image);
    }

    public void setImage(Image image) {
        this.image = image;
        repaint();
    }

    public Dimension getPreferredSize() {
        return new Dimension(image.getWidth(this), image.getHeight(this));
    }

    public void paint(Graphics g) {
        super.paint(g);
        if(image != null) {
            g.drawImage(image, 0, 0, this);
        }
    }
    public void update(Graphics g) {
        paint(g);
    }
}


//KeyListener

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_RIGHT) control.movePlayer("right");
        if (e.getKeyCode() == KeyEvent.VK_LEFT) control.movePlayer("left");
        if (e.getKeyCode() == KeyEvent.VK_UP) control.movePlayer("up");
        if (e.getKeyCode() == KeyEvent.VK_DOWN) control.movePlayer("down");
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void keyTyped(KeyEvent e) {
        // TODO Auto-generated method stub

    }
}
