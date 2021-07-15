package gridbag2;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.*;

public class MyGridBag {
	
	private JFrame frame;
	private JPanel panel;
	private JButton button1,button2,button3,button4,button5,button6,button7,button8,button9;
	private GridBagConstraints gbc;
	
	
	public MyGridBag(){
		initializeComponents();
		setConstraints();
		addPanelToWindow();
		setWindowProperties();
		
	}
	
	private void initializeComponents() {
		frame = new JFrame("FRAME");
		panel = new JPanel(new GridBagLayout());
		button1 = new JButton("Click1");
		button2 = new JButton("Click2");
		button3 = new JButton("Click3");
		button4 = new JButton("Click4");
		button5 = new JButton("Click5");
		button6 = new JButton("Click6");
		button7 = new JButton("Click7");
		button8 = new JButton("Click8");
		button9 = new JButton("Click9");
	}
	
	private void setConstraints() {
		gbc = new GridBagConstraints();
		
		gbc.weightx = 1;
		gbc.weighty = 1;
		gbc.fill = GridBagConstraints.BOTH;
		
		//Btn1
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.gridwidth = 2;
		gbc.gridheight = 1;
		panel.add(button1,gbc);
		
		//Btn2
		gbc.gridx = 2;
		panel.add(button2,gbc);
		
		//Btn3
		gbc.gridx = 0;
		gbc.gridy = 1;
		gbc.gridwidth = 1;
		panel.add(button3, gbc);
		
		//btn4
		gbc.gridx = 1;
		panel.add(button4, gbc);
		
		//btn5
		gbc.gridx = 2;
		panel.add(button5, gbc);
		
		//btn6
		gbc.gridx = 3;
		panel.add(button6, gbc);
		
		//btn7
		gbc.gridx = 0;
		gbc.gridy = 2;
		gbc.gridwidth = 3;
		panel.add(button7, gbc);
		
		
		//btn8
		gbc.gridy = 3;
		panel.add(button8, gbc);
		
		//btn9
		gbc.gridx = 3;
		gbc.gridy = 2;
		gbc.gridwidth = 1;
		gbc.gridheight = 2;
		panel.add(button9, gbc);
		
	}
	
	private void addPanelToWindow() {
		frame.setContentPane(panel);
	}
	
	private void setWindowProperties() {
		frame.setSize(500,540);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	} 

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new MyGridBag();
		
		
		
		
	}

}
