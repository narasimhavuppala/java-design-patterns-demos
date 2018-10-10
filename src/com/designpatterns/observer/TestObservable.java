package com.designpatterns.observer;

public class TestObservable {

	public static void main(String[] args) {

		Socks socks=new Socks();
		
		User1 usr1=new User1();
		
		socks.addObserver(usr1);
	//	socks.addObserver(new User2());
	//	socks.deleteObserver(usr1);
		
		socks.setSocks(15);
	}

}
