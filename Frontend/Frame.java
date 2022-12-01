import java.awt.*;
import javax.swing.*;

public class Frame extends JFrame {
	private static final int WIDTH = 1800;
	private static final int HEIGHT = 1000;
	

	public Frame (String framename){
		super(framename);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(new Panel());
		setSize(WIDTH,HEIGHT);
		setVisible(true);
	}
	
}


