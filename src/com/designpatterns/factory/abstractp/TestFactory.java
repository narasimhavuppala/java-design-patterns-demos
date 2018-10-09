package com.designpatterns.factory.abstractp;

public class TestFactory {

	public static void main(String[] args) throws Exception {

		CardFactory cf = new FactoryImplementation();
		PaymentCard pc = cf.createCard("credit");
		System.out.println(pc.requestNewCard());
	}

}
