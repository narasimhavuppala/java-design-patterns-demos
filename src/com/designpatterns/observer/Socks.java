package com.designpatterns.observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

public class Socks extends Observable {
	
	int socks;
	
	public int getSocks() {
		return socks;
	}

	public void setSocks(int socks) {
		this.socks = socks;
		setChanged();
	//	notifyObservers();
		notifyObservers("hello World");
	}

	List<Observer> objList = new ArrayList<>();

	
	
}
