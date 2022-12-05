import java.awt.Component;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.sql.Array;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.AbstractAction;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.SpringLayout;

public class MainMenu extends JPanel implements MouseListener
{
	private BufferedImage mainmenu, startbutton, title;
	private static boolean ImageLoaded = false;
	
	public MainMenu()
    	{
    		try
    		{
			if (!ImageLoaded) 
			{
				System.out.println("loading images");

				ClassLoader c1 = TilePanel.class.getClassLoader();

				String currentPath = new java.io.File(".").getCanonicalPath();
				System.out.println("Current dir:" + currentPath);
				mainmenu = ImageIO.read(new File("./images/Main Page.jpg"));
				startbutton = ImageIO.read(new File("./images/Start Button.png"));
    			title = ImageIO.read(new File("./images/Azul Title.png"));
				ImageLoaded = true;
			}
    		}	
    		catch(Exception E)
    		{
    			System.out.println("no");
			E.printStackTrace();
    			return;
    		}
    		addMouseListener(this);
    		repaint();
	}
	
	public void paint(Graphics g)
	{
		g.drawImage(mainmenu, 0, 0, 1500, 1000, null);
		g.drawImage(startbutton, 475, 600, 550, 250, null);
		g.drawImage(title, 350, 50, 800, 650, null);
	}

	public void mouseClicked(MouseEvent e) 
	{
		int x = e.getX();
		int y = e.getY();
		if(x >= 0 && x <= getWidth() && y >= 0 && y <= getHeight())
		{
			try
			{
				Frame f = new Frame("GUYS WE'RE ACTUALLY FUCKED SJKFLA");
			}
			catch(IOException e1)
			{
				e1.printStackTrace();
			}
		}
	}
	
	public void mousePressed(MouseEvent e) {}

	public void mouseReleased(MouseEvent e) {}

	public void mouseEntered(MouseEvent e) {}

	public void mouseExited(MouseEvent e) {}
}
