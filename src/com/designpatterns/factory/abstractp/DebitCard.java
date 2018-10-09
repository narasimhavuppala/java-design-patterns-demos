package com.designpatterns.factory.abstractp;
public class DebitCard implements PaymentCard
{

	@Override
	public boolean CheckValidity() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public PaymentCard requestNewCard() {
		// TODO Auto-generated method stub
		return new DebitCard();
	}

}
