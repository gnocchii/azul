import java.awt.image.BufferedImage;
import java.util.*;
import java.awt.*;
public class Tile {
    public String color;
    public BufferedImage img;
    public Point pos;

    public Tile() {
        img = new BufferedImage(0, 0, 0);
        color = "blank";
        pos = new Point(0, 0);
    }

    public Tile(BufferedImage img) {
        this.img = img;
        color = "blank";
        pos = new Point(0, 0);
    }

    public Tile(BufferedImage img, String color, Point pos) {
        this.img = img;
        this.color = color;
        this.pos = pos;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String c) {
        color = c;
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
