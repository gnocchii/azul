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
	private BufferedImage mainAzulBoard, factoryImage, numberOne;
	public TilePanel()
	{
		try {
			if (!ImageLoaded) {
				System.out.println("loading images");

				ClassLoader c1 = TilePanel.class.getClassLoader();

				String currentPath = new java.io.File(".").getCanonicalPath();
				System.out.println("Current dir:" + currentPath);


				tilesImages = new ArrayList<>();
				for(int i = 0; i < 20; i++)
					tilesImages.add(ImageIO.read(new File("./images/Black_Tile.png")));
				for(int i = 0; i < 20; i++)
					tilesImages.add(ImageIO.read(new File("./images/Blue_Tile.png")));
				for(int i = 0; i < 20; i++)
					tilesImages.add(ImageIO.read(new File("./images/Light_Blue_Tile.png")));
				for(int i = 0; i < 20; i++)
					tilesImages.add(ImageIO.read(new File("./images/Red_Tile.png")));
				for(int i = 0; i < 20; i++)
					tilesImages.add(ImageIO.read(new File("./images/Yellow_Tile.png")));
				mainAzulBoard = ImageIO.read(new File("./images/Azul Board.jpg"));
				factoryImage = ImageIO.read(new File("./images/Azul_Factory.png"));
				numberOne = ImageIO.read(new File("./images/Number_1_Tile.png"));
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

		for(int j = 1; j <= 8; j++)
		{
			if(j == 1)
			{
				for(int i = 1; i <= 4; i++)
				{
					if(i == 1 || i == 2)
					{
						g.drawImage(tilesImages.get(i), 927 + (i*50), 327, 45, 45, null);
					}
					else if(i == 3)
					{
						g.drawImage(tilesImages.get(i), 977, 377, 45, 45, null);
					}
					else
					{
						g.drawImage(tilesImages.get(i), 1027, 377, 45, 45, null);
					}
				}
			}
			else if(j == 2)
			{
				for(int i = 5; i <= 8; i++)
				{
					if(i == 5)
					{
						g.drawImage(tilesImages.get(i), 1155, 377, 45, 45, null);
					}
					else if(i == 6)
					{
						g.drawImage(tilesImages.get(i), 1205, 377, 45, 45, null);
					}
					else if(i == 7)
					{
						g.drawImage(tilesImages.get(i), 1155, 427, 45, 45, null);
					}
					else
					{
						g.drawImage(tilesImages.get(i), 1205, 427, 45, 45, null);
					}
				}
			}
			else if(j == 3)
			{
				for(int i = 9; i <= 12; i++)
				{
					if(i == 9)
					{
						g.drawImage(tilesImages.get(i), 1230, 550, 45, 45, null);
					}
					else if(i == 10)
					{
						g.drawImage(tilesImages.get(i), 1280, 550, 45, 45, null);
					}
					else if(i == 11)
					{
						g.drawImage(tilesImages.get(i), 1230, 600, 45, 45, null);
					}
					else
					{
						g.drawImage(tilesImages.get(i), 1280, 600, 45, 45, null);
					}
				}
			}
			else if(j == 4)
			{
				for(int i = 13; i <= 16; i++)
				{
					if(i == 13)
					{
						g.drawImage(tilesImages.get(i), 1155, 727, 45, 45, null);
					}
					else if(i == 14)
					{
						g.drawImage(tilesImages.get(i), 1205, 727, 45, 45, null);
					}
					else if(i == 15)
					{
						g.drawImage(tilesImages.get(i), 1155, 777, 45, 45, null);
					}
					else
					{
						g.drawImage(tilesImages.get(i), 1205, 777, 45, 45, null);
					}
				}
			}
			else if(j == 5)
			{
				for(int i = 17; i <= 20; i++)
				{
					if(i == 17)
					{
						g.drawImage(tilesImages.get(i), 977, 777, 45, 45, null);
					}
					else if(i == 18)
					{
						g.drawImage(tilesImages.get(i), 1027, 777, 45, 45, null);
					}
					else if(i == 19)
					{
						g.drawImage(tilesImages.get(i), 977, 827, 45, 45, null);
					}
					else
					{
						g.drawImage(tilesImages.get(i), 1027, 827, 45, 45, null);
					}
				}
			}
			else if(j == 6)
			{
				for(int i = 21; i <= 24; i++)
				{
					if(i == 21)
					{
						g.drawImage(tilesImages.get(i), 800, 377, 45, 45, null);
					}
					else if(i == 22)
					{
						g.drawImage(tilesImages.get(i), 850, 377, 45, 45, null);
					}
					else if(i == 23)
					{
						g.drawImage(tilesImages.get(i), 800, 427, 45, 45, null);
					}
					else
					{
						g.drawImage(tilesImages.get(i), 850, 427, 45, 45, null);
					}
				}
			}
			else if(j == 7)
			{
				for(int i = 25; i <= 28; i++)
				{
					if(i == 25)
					{
						g.drawImage(tilesImages.get(i), 727, 550, 45, 45, null);
					}
					else if(i == 26)
					{
						g.drawImage(tilesImages.get(i), 777, 550, 45, 45, null);
					}
					else if(i == 27)
					{
						g.drawImage(tilesImages.get(i), 727, 600, 45, 45, null);
					}
					else
					{
						g.drawImage(tilesImages.get(i), 777, 600, 45, 45, null);
					}
				}
			}
			else if(j == 8)
			{
				for(int i = 29; i <= 32; i++)
				{
					if(i == 29)
					{
						g.drawImage(tilesImages.get(i), 800, 727, 45, 45, null);
					}
					else if(i == 30)
					{
						g.drawImage(tilesImages.get(i), 850, 727, 45, 45, null);
					}
					else if(i == 31)
					{
						g.drawImage(tilesImages.get(i), 800, 777, 45, 45, null);
					}
					else
					{
						g.drawImage(tilesImages.get(i), 850, 777, 45, 45, null);
					}
				}
			}
		}
	}
}
