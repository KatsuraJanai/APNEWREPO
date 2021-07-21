package server;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

import org.hibernate.Session;
import org.hibernate.Transaction;

import factory.SessionFactoryBuilder;
import models.Account;
import models.Customer;

public class ClientHandler implements Runnable {

	private Socket handlerSocket;
	private ObjectOutputStream objOs;
	private ObjectInputStream objIs;
	
	
	
	
	public ClientHandler(Socket socket) {
		handlerSocket = socket;
		try {
			objOs = new ObjectOutputStream(handlerSocket.getOutputStream());
			objIs = new ObjectInputStream(handlerSocket.getInputStream());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	private void closeConnections() {
		try {
			objIs.close();
			objOs.close();
			handlerSocket.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}


	@Override
	public void run() {
		// TODO Auto-generated method stub
		//int radius;
		//int area;
		
		try {
			/*radius = objIs.readInt();
			area = radius * radius * 3;
			objOs.writeInt(area);
			objOs.flush();*/
			getAction();
		} catch(IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			closeConnections();
		}
	}
	
	private void  getAction() throws IOException, ClassNotFoundException {
		String action = (String) objIs.readObject();
		//int area = radius * radius * 3;
		//objOs.writeObject(action);
		//objOs.flush();
		if(action.equals("Add Customer")) {
			addCustomer();
		} else if(action.equals("Customer Login")){
			customerLogin();
		}
	}
	
	
	private void addCustomer() {
		Session session = SessionFactoryBuilder.getSessionFactory().getCurrentSession();
		Transaction transaction = session.beginTransaction();
		
		try {
			Customer customer = (Customer) objIs.readObject();
			Account account = new Account();
			account.setPackageID(null);
			account.setPaymentDueDate(null);
			account.setPaymentDueDate(null);
			account.setPreviousBalance(0);
			account.setTotalAmountDue(0);
			account.setCustomerID(customer.getCustomerID());
			
			
			session.save(customer);
			session.save(account);
			transaction.commit();
			objOs.writeObject("Customer added to database");
		} catch(ClassNotFoundException e) {
			if(transaction != null) {
				transaction.rollback();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			if(transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
	}
	
	private void customerLogin() {
		Session session = SessionFactoryBuilder.getSessionFactory().getCurrentSession();
		Transaction transaction = session.beginTransaction();
		
		try {
			Customer customer = (Customer) objIs.readObject();
		
			session.save(customer);
			session.save(account);
			transaction.commit();
			objOs.writeObject("Customer added to database");
		} catch(ClassNotFoundException e) {
			if(transaction != null) {
				transaction.rollback();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			if(transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}

	}
	
	
}
