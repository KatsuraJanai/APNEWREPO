package domain;



import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Gui {

	private JFrame frame;
	private JTextField nameTxt,emailTxt,idTxt;
	private JLabel nameLbl, emailLbl,nationalityLbl,idLbl;
	private JButton button;
	private JComboBox<String> dropdownList;
	
	
	
	public Gui() {
		frame = new JFrame("JFrame Container");
		initializeComponents();
		bounds();
		addComponentsToWindow();
		setWindowProperties();
		registerListeners();
	}
	
	
	public void initializeComponents() {
		frame = new JFrame("JFrame Container");
		nameTxt = new JTextField();
		emailTxt = new JTextField();
		idTxt = new JTextField();
		nameLbl = new JLabel("Name:");
		emailLbl = new JLabel("Email:");
		nationalityLbl = new JLabel("Nationality");
		idLbl = new JLabel("ID:");
		button = new JButton("Click Me!");
		String countries[] = {"Japan","China","Jamaica", "Germany"};
		dropdownList = new JComboBox<>(countries);
		dropdownList.setSelectedIndex(0);
		
	}
	public void bounds() {
		//LABELS
		nameLbl.setBounds(10,10,100,100);
		emailLbl.setBounds(10,55,100,100);
		nationalityLbl.setBounds(10,100,100,100);
		idLbl.setBounds(10, 145, 100, 100);
		//FIELDS
		nameTxt.setBounds(110,45,130,30);
		emailTxt.setBounds(110, 90, 130, 30);
		idTxt.setBounds(110, 180, 130, 30);
		button.setBounds(100, 225, 100, 30);	
		dropdownList.setBounds(110, 135, 130, 30);
		
	}
	
	public void addComponentsToWindow() {
		frame.add(nameLbl);
		frame.add(nationalityLbl);
		frame.add(emailTxt);
		frame.add(nameTxt);
		frame.add(emailLbl);
		frame.add(idLbl);
		frame.add(idTxt);
		frame.add(button);
		frame.add(dropdownList);
	}
	
	public void setWindowProperties() {
		frame.setSize(300,300);
		frame.setLayout(null);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	public void registerListeners() {
		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				int id = Integer.parseInt(idTxt.getText());
				String name = nameTxt.getText();
				String national = dropdownList.getSelectedItem().toString();
				String email = emailTxt.getText();
				JOptionPane.showMessageDialog(frame, "ID: " + id + "\nName: " + name + "\nNationality: " + national + "\nEmail: " + email,"Welcome " + name,JOptionPane.INFORMATION_MESSAGE);
			}
			
		});
	}
	
	
	
	
}
