package com.designpatterns.observer;

public class TestObservable {

	public static void main(String[] args) {

		Socks socks=new Socks();
		
		socks.addObserver(new User1());
		socks.addObserver(new User2());
		socks.setSocks(15);
	}

}
