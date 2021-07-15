package gridlayout;



import java.awt.GridLayout;

import javax.swing.*;

public class Grid extends JFrame {
	
	private JTextArea displayMessages;
	private JScrollPane scrollPane;
	private JTextField messageTxt;
	private JPanel panel,panel1;
	
	
	public Grid() {
		initializeComponents();
		addComponentsToPanel();
		setWindowProperties();
	}
	
	private void initializeComponents() {
		//displayMessages = new JTextArea();
		scrollPane = new JScrollPane();
		messageTxt = new JTextField();
		panel = new JPanel(new GridLayout(2 ,1 ,5,10));
		
	}
	
	private void addComponentsToPanel() {
		panel.add(scrollPane);
		panel.add(messageTxt);
		this.add(panel);
	}
	
	private void setWindowProperties() {
		this.setSize(500,500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//this.setLayout(new GridLayout(2,1));
		this.setVisible(true);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new Grid();
		
		
	}

}
