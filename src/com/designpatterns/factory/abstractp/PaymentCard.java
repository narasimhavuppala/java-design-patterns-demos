package com.designpatterns.factory.abstractp;


public interface PaymentCard
{
	boolean CheckValidity();
	PaymentCard requestNewCard();
}
