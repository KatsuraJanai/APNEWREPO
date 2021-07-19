package models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CardType {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "card_type_id")
	private int cardTypeID;
	@Column(name = "card_type_name")
	private String cardTypeName;
	
	
	public CardType() {
		super();
		this.cardTypeID = 0;
		this.cardTypeName = "";
	}


	public CardType(int cardTypeID, String cardTypeName) {
		super();
		this.cardTypeID = cardTypeID;
		this.cardTypeName = cardTypeName;
	}


	public int getCardTypeID() {
		return cardTypeID;
	}


	public void setCardTypeID(int cardTypeID) {
		this.cardTypeID = cardTypeID;
	}


	public String getCardTypeName() {
		return cardTypeName;
	}


	public void setCardTypeName(String cardTypeName) {
		this.cardTypeName = cardTypeName;
	}
	
	
	
	
	
	
}
