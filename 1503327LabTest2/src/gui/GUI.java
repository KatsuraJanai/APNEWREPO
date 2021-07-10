//Name: Taahir Parkes
//ID: 1503327

package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import model.Student;

public class GUI {

	private JFrame frame;
	private JTextField firstNameTxt,lastNameTxt,idTxt;
	private JLabel firstNameLbl,lastNameLbl,idLbl;
	private JButton saveButton, retrieveButton, clearButton;
	
	
	public GUI() {
		initializeComponents();
		bounds();
		addComponentsToWindow();
		setWindowProperties();
		registerListeners();
	}
	
	
	public void initializeComponents() {
		frame = new JFrame("Easy Lab Test 2");
		firstNameLbl = new JLabel("First Name:");
		idLbl = new JLabel("ID:");
		lastNameLbl = new JLabel("Last Name:");
		firstNameTxt = new JTextField();
		idTxt = new JTextField();
		lastNameTxt = new JTextField();
		saveButton = new JButton("Save");
		retrieveButton = new JButton("Retrieve");
		clearButton = new JButton("Clear");
	}
	
	public void bounds() {
		//LABELS
		idLbl.setBounds(40, 60, 50, 50);
		firstNameLbl.setBounds(40, 105, 80, 50);
		lastNameLbl.setBounds(40, 150, 80, 50);
		
		
		//TEXTFIELDS
		idTxt.setBounds(120, 70, 120, 30);
		firstNameTxt.setBounds(120, 115, 120, 30);
		lastNameTxt.setBounds(120, 160, 120, 30);
		
		
		//BUTTONS
		saveButton.setBounds(10, 250, 90, 30);
		retrieveButton.setBounds(110, 250, 90, 30);
		clearButton.setBounds(210, 250, 90, 30);
	}
	
	public void addComponentsToWindow() {
		frame.add(firstNameLbl);
		frame.add(firstNameTxt);
		frame.add(idLbl);
		frame.add(idTxt);
		frame.add(lastNameLbl);
		frame.add(lastNameTxt);
		
		
		frame.add(saveButton);
		frame.add(retrieveButton);
		frame.add(clearButton);
	}
	
	public void setWindowProperties() {
		frame.setSize(400,400);
		frame.setLayout(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	public void registerListeners() {
		saveButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Student student = new Student();
				student.setFirstName(firstNameTxt.getText());
				student.setId(idTxt.getText());
				student.setLastName(lastNameTxt.getText());

				student.addStudent();
							
			}
			
		});
		clearButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				idTxt.setText("");
				firstNameTxt.setText("");
				lastNameTxt.setText("");
			}
			
		});
		retrieveButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Student student = new Student();
				student = Student.retrieve(idTxt.getText());
				firstNameTxt.setText(student.getFirstName());
				lastNameTxt.setText(student.getLastName());
			}
			
		});
	}
	
	
}
