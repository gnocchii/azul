import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.*;
import java.awt.*;
import javax.swing.*;
import javax.imageio.ImageIO;
import java.io.*;


public class Tile {

    enum Color {
        RED,
        YELLOW,
        BLUE,
        BLACK
    };
    public  Color color;
    public BufferedImage img;
    public Point pos;

//    public Tile() {
//        img = new BufferedImage(0, 0, 0);
//        color = color.RED;
//        pos = new Point(0, 0);
//    }
//
//    public Tile(BufferedImage img) {
//        this.img = img;
//        color = color.RED;
//        pos = new Point(0, 0);
//    }

    public Tile(Color color, Point pos) {
        img = new BufferedImage(0, 0, 0);
        try{
            img = new BufferedImage(0, 0, 0);
            if (color == Color.BLUE) {
                img = (ImageIO.read(new File("./images/Light_Blue_Tile.png")));
            }
            if (color == Color.RED) {
                img = (ImageIO.read(new File("./images/Red_Tile.png")));
            }
            if (color == Color.YELLOW) {
                img = (ImageIO.read(new File("./images/Yellow_Tile.png")));
            }
            if (color == Color.BLACK) {
                img = (ImageIO.read(new File("./images/Black_Tile.png")));
            }




        } catch (Exception E) {
            E.printStackTrace();
            return;
        }
    }

    public  Color getColor() {
        return color;
    }



    public int getX() {
        return (int) pos.getX();
    }

    public int getY() {
        return (int)pos.getY();
    }


    public void movePos(int x2, int y2) {
        pos.setLocation(x2, y2);
    }
}
