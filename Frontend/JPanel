import java.awt.*;
import java.awt.image.*;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.io.*;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;

public class Panel extends JPanel implements MouseListener{
	
	private BufferedImage azul, blueTile;
	
	public Panel() {
		try {
			azul = ImageIO.read(new File("azul.jpg"));
			blueTile = ImageIO.read(new File("azul blue tile.jfif"));
		}
		catch (Exception E) {
			System.out.println("Exception Error");
			return;
		}
	}
	
	public void paint (Graphics g) {
		
		g.drawImage(azul,(getWidth()/2-660/2),0,660,660,null);
		g.setColor(Color.white);
		g.fillRect(getWidth()/2-50, getHeight()/2, 100, 50);
		g.setColor(Color.black);
		g.drawString("PLAY",getWidth()/2, getHeight()/2+50);
		
		g.setColor(Color.white);
		g.fillRect(getWidth()/2-50, getHeight()/2+100, 100, 50);
		g.setColor(Color.black);
		g.drawString("Rules",getWidth()/2, getHeight()/2+150);
	
	}
	
	public void gameBoard (Graphics g) {
		
	}
	
	public void mousePressed(MouseEvent e) {}
	public void mouseReleased(MouseEvent e) {}
	public void mouseEntered(MouseEvent e) {}
	public void mouseExited(MouseEvent e) {}
	
	public void mouseClicked(MouseEvent e) {
		System.out.println("mouse");
		int x = e.getX();
		int y = e.getY();
		
		if (e.getButton() == e.BUTTON1) {
			System.out.println("loc is "+x+","+ y);
				if (x>=getWidth()/2 && x<=getWidth()/2+100 && y>=getHeight()/2 && y<=getHeight()/2+50);
					System.out.println("game");
		}
		repaint();
		
	}
}
