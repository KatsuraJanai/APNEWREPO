package client;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import math.Calculation;

public class Client {

	private ObjectInputStream objIs;
	private ObjectOutputStream objOs;
	private Socket socket;
	private JFrame frame;
	private JLabel  firstNumberLbl, secondNumberLbl,resultLbl;
	protected JTextField firstNumTxt,secondNumTxt;
	private JRadioButton plusRadioBtn, minusRadioBtn,multiplyRadioBtn,divideRadioBtn;
	private JButton calculateButton;
	private ButtonGroup btnGroup;
	
	
	
	public Client() {
		initializeComponents();
		bounds();
		addComponentsToWindow();
		setWindowProperties();
		registerListeners();
		//this.connectToServer();
		//this.configureStreams();
	}
	
	
	private void connectToServer() {
		try {
			socket = new Socket("127.0.0.1",8888);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	private void configureStreams() {
		try {
			objOs = new ObjectOutputStream(socket.getOutputStream());		
			objIs = new ObjectInputStream(socket.getInputStream());
			System.out.println("CONNECTED TO SERVER");
		} catch(IOException ex) {
			ex.printStackTrace();
		}
		 
	}
	
	private void receiveResponse() {
		try {
			String result;
			result = (String) objIs.readObject();
			//JOptionPane.showMessageDialog(null, result + "is the result", "CLIENT",JOptionPane.INFORMATION_MESSAGE);
			System.out.println( "CLIENT " + result);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch(ClassNotFoundException ex) {
			ex.printStackTrace();
		}
	}
	
	
	public void initializeComponents() {
		frame = new JFrame("Calculator");
		firstNumberLbl = new JLabel("Number 1");
		secondNumberLbl = new JLabel("Number 2");
		resultLbl = new JLabel("Result");
		firstNumTxt = new JTextField();
		secondNumTxt = new JTextField();
		plusRadioBtn = new JRadioButton("Plus");
		minusRadioBtn = new JRadioButton("Minus");
		multiplyRadioBtn = new JRadioButton("Multiply");
		divideRadioBtn = new JRadioButton("Divide");
		calculateButton = new JButton("Calculate");
		btnGroup = new ButtonGroup();
	}
	
	
	public void bounds() {
		//Labels
		firstNumberLbl.setBounds(1, 1, 60, 30);
		secondNumberLbl.setBounds(1, 36, 60, 30);
		resultLbl.setBounds(1, 96, 60, 30);
		
		//TextFields
		firstNumTxt.setBounds(130, 1, 150, 30);
		secondNumTxt.setBounds(130, 36, 150, 30);
		
		//Radio Buttons
		plusRadioBtn.setBounds(1, 66, 70, 40);
		minusRadioBtn.setBounds(70, 66, 70, 40);
		multiplyRadioBtn.setBounds(140, 66, 70,40);
		divideRadioBtn.setBounds(210, 66, 70, 40);
		
		//Button
		calculateButton.setBounds(1, 126, 280, 30);
		
	}
	
	public void addComponentsToWindow() {
		frame.add(firstNumTxt);
		frame.add(firstNumberLbl);
		frame.add(secondNumberLbl);
		frame.add(secondNumTxt);
		frame.add(plusRadioBtn);
		frame.add(minusRadioBtn);
		frame.add(multiplyRadioBtn);
		frame.add(divideRadioBtn);
		frame.add(resultLbl);
		frame.add(calculateButton);
		//add buttons to buttongroup
		//radiobuttons apart of the buttongroup gets turned off when one radiobutton is checked otherwise all can be checked at once
		btnGroup.add(plusRadioBtn);
		btnGroup.add(minusRadioBtn);
		btnGroup.add(multiplyRadioBtn);
		btnGroup.add(divideRadioBtn);
	}
	
	public void setWindowProperties() {
		frame.setSize(300, 200);
		frame.setLayout(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(true);
		frame.setVisible(true);
	}
	
	private void registerListeners() {
		calculateButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				connectToServer();
				configureStreams();
				Calculation calculation = new Calculation();
				calculation.setNumber1(Integer.parseInt(firstNumTxt.getText()));
				calculation.setNumber2(Integer.parseInt(secondNumTxt.getText()));
				try {
					if(plusRadioBtn.isSelected()) {
						calculation.setOperation("+");
						System.out.println("CLIENT " + calculation.getNumber1() +" "+ calculation.getOperation() +" "+ calculation.getNumber2()   );
						objOs.writeObject(calculation);
					}
				//try was originally here
					
					receiveResponse();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}finally {
					closeConnections();
				}
				
			}
			
		});
	}
	
	
	private void closeConnections() {
		try {
			objIs.close();
			objOs.close();
			socket.close();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
	
}
