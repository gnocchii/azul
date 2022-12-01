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
    private BufferedImage mainAzulBoard;

    public TilePanel() throws IOException
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
    	}
    	catch(Exception E)
    	{
    		System.out.println("no");
    		return;
    	}
    }
	
	public void paint (Graphics g) 
	{
		Font currentFont = g.getFont();
		Font font = currentFont.deriveFont(currentFont.getSize() * 5.4F);
		g.setFont(font);
		g.drawImage(mainAzulBoard,60, 275, 550, 550, null);
		g.drawString("PLAYER " /*player thats currently playing*/, 150 , 900);
	}
}
