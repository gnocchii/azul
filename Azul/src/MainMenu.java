import java.awt.Component;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.awt.*;
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
	
	public MainMenu()
    {
    	try
    	{
    		mainmenu = ImageIO.read(MainMenu.class.getResource("/images/Main Page.jpg"));
    		startbutton = ImageIO.read(MainMenu.class.getResource("/images/Start Button.png"));
    		title = ImageIO.read(MainMenu.class.getResource("/images/Azul Title.png"));
    	}
    	catch(Exception E)
    	{
    		System.out.println("no");
    		return;
    	}
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
		if(x >= 475 && x <= 1025 && y >= 600 && y <= 850)
		{
			add(new TilePanel());
			setVisible(true);
		}
	}
	
	public void mousePressed(MouseEvent e) {}

	public void mouseReleased(MouseEvent e) {}

	public void mouseEntered(MouseEvent e) {}

	public void mouseExited(MouseEvent e) {}
}
