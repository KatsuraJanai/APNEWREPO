import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.*;

public class CheckBox {

	public CheckBox() {
		JFrame frame = new JFrame("CheckBox Example");
		final JLabel label = new JLabel();
		label.setHorizontalAlignment(JLabel.CENTER);
		label.setSize(400,100);
		JCheckBox cppCheckBox = new JCheckBox("C++");
		cppCheckBox.setBounds(150, 100, 100, 50);
		
		JCheckBox javaCheckBox = new JCheckBox("Java");
		javaCheckBox.setBounds(150, 150, 100, 50);
		
		frame.add(javaCheckBox);
		frame.add(cppCheckBox);
		frame.add(label);
		
		javaCheckBox.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				// TODO Auto-generated method stub
				label.setText("Java Checkbox: " + (e.getStateChange()==1?"checked":"unchecked"));
			}
			
		});
		
		cppCheckBox.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				// TODO Auto-generated method stub
				label.setText("C++ Checkbox " + (e.getStateChange()==1?"checked":"unchecked"));
				
			}
			
		});
		
		frame.setSize(400,400);
		frame.setLayout(null);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new CheckBox();
	}

}
