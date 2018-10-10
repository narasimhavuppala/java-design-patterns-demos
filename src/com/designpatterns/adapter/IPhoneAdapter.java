package com.designpatterns.adapter;

public class IPhoneAdapter extends IPhoneCharger {
	
	AndroidCharger charger;
	
	public IPhoneAdapter(AndroidCharger charger) {
		this.charger=charger;
		
	}
	public void chargeIPhone(){
		this.charger.charge();
	}

}
