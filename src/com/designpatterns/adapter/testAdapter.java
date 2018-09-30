package com.designpatterns.adapter;

import java.util.Arrays;

public class testAdapter {

	public static void main(String[] args) {

		AndroidCharger charger = new AndroidCharger();
		AndroidAdapter adapter = new AndroidAdapter(charger);
		
		adapter.chargeAndroid();
		adapter.chargeUp();
		
	}

}
