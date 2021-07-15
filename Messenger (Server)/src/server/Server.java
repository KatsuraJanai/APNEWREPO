package server;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Server {

	private JPanel panTop,panBottom;
	private JFrame frame;
	private JTextField messageTxt;
	private JTextArea textArea;
	private JScrollPane scrollPane;
	
	
	public Server() {
		initializeComponents();
		addComponentsToPanels();
		addPanelsToWindow();
		setWindowProperties();
	}
	
	private void initializeComponents() {
		frame = new JFrame("SERVER GUI");
		messageTxt = new JTextField();
		textArea = new JTextArea();
		scrollPane = new JScrollPane();
		//panTop = new JPanel();
		panBottom = new JPanel(new GridLayout(3,1));
	}
	
	

	private void addComponentsToPanels() {
		//panTop.add(scrollPane);
		//scrollPane.add(textArea);
		panBottom.add(messageTxt);
		//panBottom.setVisible(true);
	}
	
	private void addPanelsToWindow() {
		//frame.add(panTop);
		frame.add(panBottom);
	}
	
	private void setWindowProperties() {
		frame.setSize(300,300);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	
}
