package com.gui_demo;
import javax.swing.*;

public class GUIDemo {

	private JFrame frame;
	private JButton button;
	
	public GUIDemo() 
	{
		frame = new JFrame("GUI Demo - One");
		button = new JButton("Click me");
		frame.setSize(400,400);
		frame.setLayout(null);
		button.setBounds(130,100,100,40);//(horizontal position from left, vertical from top,length of button,width of button)
		frame.add(button);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new GUIDemo();
		
	}

}
