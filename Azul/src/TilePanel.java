import java.awt.Component;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
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
import java.awt.AlphaComposite;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.Border;
public class TilePanel extends JPanel
{
    private ArrayList<BufferedImage> tilesImages;
	private static boolean ImageLoaded = false;
	private BufferedImage mainAzulBoard, factoryImage;
    public TilePanel()
    {
    	try {
			if (!ImageLoaded) {
				System.out.println("loading images");

				ClassLoader c1 = TilePanel.class.getClassLoader();

				String currentPath = new java.io.File(".").getCanonicalPath();
				System.out.println("Current dir:" + currentPath);


				tilesImages = new ArrayList<>();
				tilesImages.add(ImageIO.read(new File("./images/Black_Tile.png")));
				tilesImages.add(ImageIO.read(new File("./images/Blue_Tile.png")));
				tilesImages.add(ImageIO.read(new File("./images/Light_Blue_Tile.png")));
				tilesImages.add(ImageIO.read(new File("./images/Number_1_Tile.png")));
				tilesImages.add(ImageIO.read(new File("./images/Red_Tile.png")));
				tilesImages.add(ImageIO.read(new File("./images/Yellow_Tile.png")));
				mainAzulBoard = ImageIO.read(new File("./images/Azul Board.jpg"));
				factoryImage = ImageIO.read(new File("./images/Azul_Factory.png"));
				ImageLoaded = true;

			}
		}
    	catch(Exception E)
    	{
			E.printStackTrace();

    		return;
    	}
    }
	
	public void paint (Graphics g) 
	{
		g.setFont(new Font("Times New Roman", Font.BOLD, 50));
		g.setColor(new Color(0, 68, 129));
		g.drawImage(mainAzulBoard,60, 350, 500, 500, null);
		g.drawString("PLAYER " /*player thats currently playing(n)*/, 125 , 900);
		
		g.drawImage(mainAzulBoard, 150, 20, 250, 250, null);
		g.setFont(new Font("Times New Roman", Font.BOLD, 30));
		g.drawString("PLAYER " /*player 1+n*/, 175, 305);
		
		g.drawImage(mainAzulBoard, 650, 20, 250, 250, null);
		g.setFont(new Font("Times New Roman", Font.BOLD, 30));
		g.drawString("PLAYER " /*player 1+n*/, 675, 305);
		
		g.drawImage(mainAzulBoard, 1150, 20, 250, 250, null);
		g.setFont(new Font("Times New Roman", Font.BOLD, 30));
		g.drawString("PLAYER " /*player 1+n*/, 1175, 305);
		
		g.drawImage(factoryImage, 950, 300, 150, 150, null);
		g.drawImage(factoryImage, 950, 750, 150, 150, null);
		g.drawImage(factoryImage, 775, 350, 150, 150, null);
		g.drawImage(factoryImage, 700, 525, 150, 150, null);
		g.drawImage(factoryImage, 775, 700, 150, 150, null);
		g.drawImage(factoryImage, 1125, 350, 150, 150, null);
		g.drawImage(factoryImage, 1125, 700, 150, 150, null);
		g.drawImage(factoryImage, 1200, 525, 150, 150, null);
	}
}
