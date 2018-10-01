package com.designpatterns.observer;

import java.util.Observable;
import java.util.Observer;

public class User1 implements Observer {

	@Override
	public void update(Observable o, Object arg) {
		Socks socks=(Socks) o;
		//System.out.println(socks.getSocks());
		System.out.println(arg);

		System.out.println("updated are sent to User 1");
	}



	

}
