package com.designpatterns.adapter;

public class AndroidAdapter extends IPhoneCharger {
	
	AndroidCharger charger;
	
	public AndroidAdapter(AndroidCharger charger) {
		this.charger=charger;
		
	}
	public void chargeAndroid(){
		this.charger.charge();
	}

}
