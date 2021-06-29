package forms;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;

import employee.Address;
import employee.Employee;

public class Gui {
	private JFrame frame;
	private JLabel idLbl, nameLbl,streetLbl,parishLbl;
	private JTextField idTxt,nameTxt,streetTxt,parishTxt;
	private JButton button;
	private ArrayList<Employee> list;
	
	
	
	
	public Gui() {
		frame = new JFrame("Employee Form");
		initializeComponents();
		bounds();
		addComponentsToWindow();
		setWindowProperties();
		registerListeners();
	}
	
	public void initializeComponents() {
		idLbl = new JLabel("ID NO.");
		nameLbl = new JLabel("Name");
		streetLbl = new JLabel("Street");
		parishLbl = new JLabel("Parish");
		idTxt = new JTextField();
		nameTxt = new JTextField();
		streetTxt = new JTextField();
		parishTxt = new JTextField();
		button = new JButton("Submit");
		list = new ArrayList<>();
	}
	
	
	public void bounds() {
		idLbl.setBounds(30,10, 60,100);
		nameLbl.setBounds(30,60,100,100);
		streetLbl.setBounds(30, 100, 100, 100);
		parishLbl.setBounds(30, 140,100,100);
		idTxt.setBounds(80, 40, 90, 30);
		nameTxt.setBounds(80,95,130,30);
		streetTxt.setBounds(80, 140, 130, 30);
		parishTxt.setBounds(80, 185, 130, 30);
		button.setBounds(100,230,120,30);
	}
	
	public void addComponentsToWindow() {
		frame.add(idLbl);
		frame.add(nameLbl);
		frame.add(streetLbl);
		frame.add(parishLbl);
		frame.add(idTxt);
		frame.add(nameTxt);
		frame.add(streetTxt);
		frame.add(button);
		frame.add(parishTxt);
	}
	
	public void setWindowProperties() {
		frame.setSize(400, 400);
		frame.setLayout(null);
		frame.setVisible(true);
	}
	
	public void registerListeners() {
		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
			
				
				String id = idTxt.getText();
				String name = nameTxt.getText();
				String street = streetTxt.getText();
				String parish = parishTxt.getText();
				Employee emp = new Employee(id,name,new Address(street,parish));
				list.add(emp);
				Employee.writeToFile(list);
				
				
			}
			
		});
	}
	
	

}
