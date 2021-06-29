package labelurl;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.InetAddress;

import javax.swing.*;

public class LabelExample extends JFrame implements ActionListener {
	private JTextField textField;
	private JLabel label, urlLabel;
	private JButton button;
	
	
	public LabelExample() {
		textField = new JTextField();
		textField.setBounds(100, 50, 150, 25);
		
		label = new JLabel();
		label.setBounds(50, 100, 250, 20);
		urlLabel = new JLabel("Website URL:");
		urlLabel.setBounds(25, 50, 80, 25);
		button = new JButton("Find IP");
		button.setBounds(50, 150, 95, 30);
		
		button.addActionListener(this);
		
		add(button);
		add(textField);
		add(urlLabel);
		add(label);
		setSize(400,400);
		setLayout(null);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		 
	}

	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		try {
			String websiteAddress = textField.getText();
			String ipAddress = InetAddress.getByName(websiteAddress).getHostAddress();
			label.setText("IP of " + websiteAddress + " is: " + ipAddress);
		} catch(Exception ex) {
			System.err.println(ex.getMessage());
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new LabelExample();
	}

	

}
