package com.gui_listener_demo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class GUIListenerDemo {
	
	
	private JFrame frame;
	private JButton button;
	
	
	public GUIListenerDemo() 
	{
		frame = new JFrame("GUI Demo - One");
		button = new JButton("Click me");
		frame.setSize(800,800);
		button.setBounds(200,200,100,50);
		frame.add(button);
		frame.setLayout(null);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JOptionPane.showMessageDialog(frame, "You Clicked the button", "Action Demo", JOptionPane.INFORMATION_MESSAGE);
			}
			
		});
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new GUIListenerDemo();
	}

}
