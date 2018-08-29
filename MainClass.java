package game;

import java.awt.Dimension;

import javax.swing.JFrame;

public class MainClass {
    
	public static void main(String[] args)
	{
		JFrame frame = new JFrame("Snake");
		frame.setContentPane(new gamepanel());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setPreferredSize(new Dimension(gamepanel.WIDTH,gamepanel.HEIGHT));
		frame.pack();
		
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		
		
		
		
		
	}
	
	
}
