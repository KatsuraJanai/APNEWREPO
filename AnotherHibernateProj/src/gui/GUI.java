package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import Model.Employee;

public class GUI {

	private JFrame frame;
	private JTextField nameTxt,phoneTxt,addressTxt,idTxt;
	private JLabel nameLbl,phoneLbl,addressLbl,idLbl;
	private JButton button;
	
	
	public GUI() {
		initializeComponents();
		bounds();
		addComponentsToWindow();
		setWindowProperties();
		registerListeners();
	}
	
	
	public void initializeComponents() {
		frame = new JFrame("Employee Form");
		nameLbl = new JLabel("Name:");
		idLbl = new JLabel("ID:");
		phoneLbl = new JLabel("Phone:");
		addressLbl = new JLabel("Address:");
		nameTxt = new JTextField();
		idTxt = new JTextField();
		addressTxt = new JTextField();
		phoneTxt = new JTextField();
		button = new JButton("Click me");
	}
	
	public void bounds() {
		//LABELS
		idLbl.setBounds(40, 60, 50, 50);
		nameLbl.setBounds(40, 105, 50, 50);
		addressLbl.setBounds(40, 150, 60, 50);
		phoneLbl.setBounds(40, 195, 50, 50);
		
		//TEXTFIELDS
		idTxt.setBounds(100, 70, 100, 30);
		nameTxt.setBounds(100, 115, 100, 30);
		addressTxt.setBounds(100, 160, 100, 30);
		phoneTxt.setBounds(100, 205, 100, 30);
		
		//BUTTON
		button.setBounds(110, 250, 90, 30);
	}
	
	public void addComponentsToWindow() {
		frame.add(nameLbl);
		frame.add(nameTxt);
		frame.add(idLbl);
		frame.add(idTxt);
		frame.add(addressLbl);
		frame.add(addressTxt);
		frame.add(phoneLbl);
		frame.add(phoneTxt);
		frame.add(button);
	}
	
	public void setWindowProperties() {
		frame.setSize(400,400);
		frame.setLayout(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	public void registerListeners() {
		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Employee employee = new Employee();
				employee.setName(nameTxt.getText());
				employee.setEmpId(idTxt.getText());
				employee.setPhone(phoneTxt.getText());
				employee.setAddress(addressTxt.getText());

				employee.addEmployee();
							
			}
			
		});
	}
	
	
}
