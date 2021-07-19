package models;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Card {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "card_id")
	private int cardID;
	@Column(name = "card_type_id")
	private int cardTypeID;
	@Column(name = "cardholder_name")
	private String cardholderName;
	@Column(name ="card_number")
	private String cardNumber;
	@Column(name = "expiry_date")
	private Date expiryDate;
	
	
	
	public Card() {
		cardID = 0;
        this.cardTypeID = 0;
        this.cardholderName = "";
        this.cardNumber = "";
        this.expiryDate = null;
	}
	
	
	public Card(int cardID, int cardTypeID, String cardholderName, String cardNumber, Date expiryDate) {
		super();
		this.cardID = cardID;
		this.cardTypeID = cardTypeID;
		this.cardholderName = cardholderName;
		this.cardNumber = cardNumber;
		this.expiryDate = expiryDate;
	}
	
	
	


	public Card(int cardTypeID, String cardholderName, String cardNumber, Date expiryDate) {
		super();
		this.cardTypeID = cardTypeID;
		this.cardholderName = cardholderName;
		this.cardNumber = cardNumber;
		this.expiryDate = expiryDate;
	}


	public int getCardID() {
		return cardID;
	}


	public void setCardID(int cardID) {
		this.cardID = cardID;
	}


	public int getCardTypeID() {
		return cardTypeID;
	}


	public void setCardTypeID(int cardTypeID) {
		this.cardTypeID = cardTypeID;
	}


	public String getCardholderName() {
		return cardholderName;
	}


	public void setCardholderName(String cardholderName) {
		this.cardholderName = cardholderName;
	}


	public String getCardNumber() {
		return cardNumber;
	}


	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}


	public Date getExpiryDate() {
		return expiryDate;
	}


	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}
	
	
	
	
}
