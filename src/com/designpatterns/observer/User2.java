package com.designpatterns.observer;

import java.util.Observable;
import java.util.Observer;

public class User2 implements Observer {

	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		System.out.println("updated are sent to user 2");
		
	}

	
	

	
}
