import java.awt.Component;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
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

public class TilePanel extends JPanel
{
    private ArrayList<BufferedImage> tilesImages;
    private BufferedImage mainAzulBoard, factoryImage;

    public TilePanel()
    {
    	try
    	{
    		 tilesImages = new ArrayList<>();
    	        tilesImages.add(ImageIO.read(TilePanel.class.getResource("/images/Black_Tile.png")));
    	        tilesImages.add(ImageIO.read(TilePanel.class.getResource("/images/Blue_Tile.png")));
    	        tilesImages.add(ImageIO.read(TilePanel.class.getResource("/images/Light_Blue_Tile.png")));
    	        tilesImages.add(ImageIO.read(TilePanel.class.getResource("/images/Number_1_Tile.png")));
    	        tilesImages.add(ImageIO.read(TilePanel.class.getResource("/images/Red_Tile.png")));
    	        tilesImages.add(ImageIO.read(TilePanel.class.getResource("/images/Yellow_Tile.png")));
    	     mainAzulBoard = ImageIO.read(TilePanel.class.getResource("/images/Azul Board.jpg"));
    	     factoryImage = ImageIO.read(TilePanel.class.getResource("/images/Azul_Factory.png"));
    	}
    	catch(Exception E)
    	{
    		System.out.println("no");
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
