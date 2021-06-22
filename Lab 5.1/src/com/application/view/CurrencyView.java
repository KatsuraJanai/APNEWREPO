package com.application.view;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

import com.application.controller.CurrencyController;

import javax.swing.*;

public class CurrencyView extends JFrame implements ActionListener {
	
	
	private JLabel lblResult,lblValue;
	private JTextField txtValue;
	private JRadioButton rdbToJMD, rdbToUSD;
	private JButton btnConvert, btnClear;
	private JPanel panTop, panMiddle, panBottom;
	private CurrencyController controller;
	
	
	public CurrencyView(CurrencyController control) {
		this.controller = control;
		this.setLayout(new GridLayout(3,1));
		initializeComponents();
		addComponentsToPanels();
		addPanelsToWindow();
		setWindowProperties();
		registerListeners();
		
		
	}
	
	private void initializeComponents() {
		lblResult = new JLabel("Result:");
		lblValue = new JLabel("Value:");
		rdbToJMD = new JRadioButton("To JMD");
		rdbToUSD = new JRadioButton("To USD");
		btnConvert = new JButton("Convert");
		btnClear = new JButton("Clear");
		panTop = new JPanel(new GridLayout(1,3));
		panMiddle = new JPanel(new GridLayout(1,2));
		panBottom = new JPanel(new GridLayout(1,2));
		txtValue = new JTextField();
		ButtonGroup btnGroup = new ButtonGroup();
		btnGroup.add(btnConvert);
		btnGroup.add(btnClear);
		
		
	}
	
	
	private void addComponentsToPanels() {
		panTop.add(lblValue);
		panTop.add(txtValue);
		panTop.add(lblResult);
		panMiddle.add(rdbToJMD);
		panMiddle.add(rdbToUSD);
		panBottom.add(btnConvert);
		panBottom.add(btnClear);
	}
	
	private void addPanelsToWindow() {
		this.add(panTop);
		this.add(panMiddle);
		this.add(panBottom);
	}
	
	private void setWindowProperties() {
		this.setSize(1024,680);
		this.setVisible(true);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
	}
	
	//IFFY
	private void registerListeners() {
		btnClear.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				txtValue.setText("");
				lblResult.setText("");
				
				
			}});
		btnConvert.addActionListener( new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				if((rdbToUSD.isSelected() == true) && (rdbToJMD.isSelected() == false)) {
					controller.convert("USD", txtValue.getText());
				}else if((rdbToJMD.isSelected() == true) && (rdbToUSD.isSelected() == false)) {
					controller.convert("JMD", txtValue.getText());
				}else {
					JOptionPane.showMessageDialog(null, "You must only select 1 option","Warning window",JOptionPane.WARNING_MESSAGE);
				}
				
			}});
		
	}
	
	//IFFY
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == btnClear) {
			lblResult.setText("");
			txtValue.setText("");
		}
		if(e.getSource() == btnConvert) {
			if(rdbToUSD.isSelected() == true) {
				controller.convert("USD", txtValue.getText());
			}
			if(rdbToJMD.isSelected() == true) {
				controller.convert("JMD", txtValue.getText());
			}
		}
	}
	
	public void updateResult(String value) {
		lblResult.setText(value);
	}
	
	

}
