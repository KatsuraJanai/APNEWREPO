package radiobutton;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class RadioButton extends JFrame {
	
	private JRadioButton maleRadioButton,femaleRadioButton;
	private ButtonGroup btnGroup;
	private JButton btn;
	
	public RadioButton() {
		initializeComponents();
		bound();
		setWindowProperties();
		registerListeners();
	}
	
	public void initializeComponents() {
		maleRadioButton = new JRadioButton("Male");
		femaleRadioButton = new JRadioButton("Female");
		btnGroup = new ButtonGroup();
		btn = new JButton("Click Me");
	}
	
	public void bound() {
		maleRadioButton.setBounds(150,70,100,50);
		femaleRadioButton.setBounds(150, 100, 100, 50);
		btn.setBounds(125, 170, 120, 50);
		btnGroup.add(maleRadioButton);
		btnGroup.add(femaleRadioButton);
		add(femaleRadioButton);
		add(maleRadioButton);
		add(btn);
	}
	
	public void setWindowProperties() {
		this.setTitle("JFrame by Inheritance");
		setSize(400, 400);
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public void registerListeners() {
		btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(femaleRadioButton.isSelected()) {
					JOptionPane.showMessageDialog(null, "FEMALE GET CLICKED");
				}
				
				if(maleRadioButton.isSelected()) {
					JOptionPane.showMessageDialog(null, "MALE GET CLICKED", "MALE WINDOW", JOptionPane.INFORMATION_MESSAGE);
				}
			}
			
		});
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new RadioButton();
	}

}
