package internal;

import javax.swing.*;

public class InternalFrame {
	private JFrame frame;
	private JLabel label;
	private JInternalFrame internalFrame;
	private JPanel panel;
	private JButton button;
	
	public InternalFrame() {
		frame = new JFrame("WINDOW");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		internalFrame = new JInternalFrame("Internal Frame", true, true, true,true);
		
		
		button = new JButton("Click Me");
		//button.setBounds(100, 50, 120,30 );
		
		
		label = new JLabel("This is a JInternal Frame");
		//label.setBounds(40, 50, 200, 100);
		panel = new JPanel();
		
		panel.add(label);
		panel.add(button);
		
		//internalFrame.add(label);
		//internalFrame.add(button);
		//internalFrame.setLayout(null);
		
		internalFrame.setVisible(true);
		internalFrame.add(panel);
		
		
		frame.add(internalFrame);
		
		frame.setSize(300,300);
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		new InternalFrame();
		
	}

}
