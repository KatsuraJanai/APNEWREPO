package combobox;

import javax.swing.JComboBox;
import javax.swing.JFrame;

public class ComboBox {
	private JFrame frame;
	
	
	public ComboBox() {
		frame = new JFrame("Combo Box window");
		frame.setSize(800,1000);
		//ARRAY
		String countries[] = {"India", "Austria", "England"};
		JComboBox<String> combo = new JComboBox<>(countries);
		combo.setSelectedIndex(0);
		combo.setBounds(100,50,150,20);
		frame.add(combo);
		frame.setLayout(null);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		new ComboBox();
	}

}


