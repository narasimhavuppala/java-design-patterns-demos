package com.designpatterns.factory.abstractp;


public interface CardFactory {
	PaymentCard createCard(String cardType) throws Exception;
}
