import java.awt.*;
import java.io.IOException;

import javax.swing.*;

public class StartFrame extends JFrame
{
	private static final int WIDTH = 1500;
	private static final int HEIGHT = 1000;
	
	public StartFrame (String framename) throws IOException
	{
		super(framename);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(new MainMenu());
		setSize(WIDTH,HEIGHT);
		setVisible(true);
	}
}
