package serial;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import date.MyDate;


public class SerializationDriver {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		
		
		Employee emp1 = new Employee("pablo","badman avenue", "12345-123-13", "123-1234", new MyDate(22,8,1996));
		
		try 
		{
			FileOutputStream fos = new FileOutputStream(new File("obj.dat"));
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(emp1);
		} catch(FileNotFoundException fe) {
			System.err.println(fe.getMessage());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
