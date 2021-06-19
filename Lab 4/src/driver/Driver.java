package driver;

import java.io.IOException;
import java.util.ArrayList;

import domain.User;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//CREATE MY OWN DATE CLASS
		User user = new User("Pabl", "Sanchez", 24, null);
		User user1 = new User("Pablito", "Sanch", 12, null);
		ArrayList<User> list = new ArrayList<>();
		
		list.add(user);
		list.add(user1);
		//System.out.println(user);
		try {
			User.WriteToFile(list);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		ArrayList<User> list2 = new ArrayList<>();
		list2 = User.ReadFromFile();
		
		for(User person : list2) {
			System.out.println(person);
		}
	}

}
