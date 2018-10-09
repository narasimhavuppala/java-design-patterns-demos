package com.designpatterns.factory.abstractp;

public class FactoryImplementation implements CardFactory {
	public PaymentCard createCard(String cardtype) throws Exception {
		switch (cardtype) {
		case "debit":
			return new DebitCard();
		case "credit":
			return new CreditCard();
		default:
			throw new Exception("Card type not found");
		}
	}
}
