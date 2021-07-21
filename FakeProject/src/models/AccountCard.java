package models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class AccountCard implements Serializable {

	@Id
	@Column(name = "card_id")
	private int cardID;
	@Id
	@Column(name = "account_id")
	private int accountID;
	
	
	
	
	
	public AccountCard() {
		super();
		this.cardID = 0;
		this.accountID = 0;
	}

	public AccountCard(int card_id, int account_id) {
		super();
		this.cardID = card_id;
		this.accountID = account_id;
	}

	public int getCardID() {
		return cardID;
	}

	public void setCardID(int cardID) {
		this.cardID = cardID;
	}

	public int getAccountID() {
		return accountID;
	}

	public void setAccountID(int accountID) {
		this.accountID = accountID;
	}
	
	
	
	
	
	
}


