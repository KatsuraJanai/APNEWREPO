package guilogin;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;

import javax.swing.*;

public class LoginGUI extends JFrame {

	private JLabel loginTitleLbl,usernameLbl,passwordLbl;
	private JTextField usernameTxt,passwordTxt;
	private JButton loginBtn;
	private GridBagConstraints gbc;
	private JPanel panel,panelTitle,panelBtn;
	
	
	
	public LoginGUI() {
	
		initializeComponents();
		setupConstraints();
		setWindowProperties();
	}
	
	
	private void initializeComponents() {
		loginTitleLbl = new JLabel("Employee Login");
		usernameLbl = new JLabel("Username");
		passwordLbl = new JLabel("Password");
		usernameTxt = new JTextField("hi",10);
		passwordTxt = new JTextField(10);
		loginBtn = new JButton("Login");
		panel = new JPanel(new GridBagLayout());
		/*panel.add(usernameLbl);
		panel.add(usernameTxt);
		panel.add(passwordLbl);
		panel.add(passwordTxt);
		
		panelTitle = new JPanel(new BorderLayout());
		panelTitle.add(loginTitleLbl,BorderLayout.CENTER);
		panelBtn = new JPanel(new BorderLayout());
		panelBtn.add(loginBtn,BorderLayout.CENTER);
		
		panel.add(loginBtn);*/
		gbc = new GridBagConstraints();
	}
	
	private void setupConstraints() {
		
		//gbc.weightx = 0.5;
		//gbc.weighty = 0.1;
		//gbc.anchor = GridBagConstraints.LINE_END;
		//gbc.fill = GridBagConstraints.HORIZONTAL;
		
		
		
		//THIS IS WHAT I WANT
		gbc.insets = new Insets(20,20,20,20);
		
		//LblTitle
		gbc.gridx = 0;
		gbc.gridy = 1;
		gbc.gridwidth = 4;
		//gbc.anchor = GridBagConstraints.CENTER;
		panel.add(loginTitleLbl, gbc);
		
		//username
		gbc.gridx = 0;
		gbc.gridy = 2;
		gbc.gridwidth = 2;
		//gbc.anchor = GridBagConstraints.CENTER;
		panel.add(usernameLbl, gbc);
		 
		//username txt
		gbc.gridx = 2;
		gbc.gridy = 2;
		gbc.gridwidth = 2;
		//gbc.anchor = GridBagConstraints.LINE_START;
		gbc.ipady = 5;
		panel.add(usernameTxt, gbc);
		
		//passwordLbl
		gbc.gridx = 0;
		gbc.gridy = 3;
		gbc.gridwidth = 2;
		gbc.ipady = 0;
		//gbc.anchor = GridBagConstraints.CENTER;
		panel.add(passwordLbl, gbc);
		
		//passwordTxt
		gbc.gridx = 2;
		gbc.gridwidth = 2;
		gbc.gridy = 3;
		//gbc.anchor = GridBagConstraints.LINE_START;
		//gbc.ipadx = 100;
		gbc.ipady = 5;
		panel.add(passwordTxt, gbc);
		
		//button
		gbc.gridx = 0;
		gbc.gridy = 4;
		gbc.ipady = 0;
		gbc.gridwidth = 4;
		//gbc.anchor = GridBagConstraints.CENTER;
		//gbc.insets = new Insets(0,80,0,0);
		panel.add(loginBtn, gbc);
	}
	
	private void setWindowProperties() {
		//this.setLayout(new BorderLayout());
		this.setTitle("Employee Form");
		this.add(panel);
		//this.add(panel,BorderLayout.CENTER);
		//this.add(panelBtn,BorderLayout.SOUTH);
		this.setSize(500,400);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
}
