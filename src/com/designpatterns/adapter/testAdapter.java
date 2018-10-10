package com.designpatterns.adapter;

public class testAdapter {

	public static void main(String[] args) {

		AndroidCharger charger = new AndroidCharger();
		
		IPhoneAdapter adapter = new IPhoneAdapter(charger);
		
		charger.charge();
		//adapter.chargeAndroid();
		adapter.chargeUp();
		
	}

}
