package com.designpatterns.singleton;

public class ConfigurationDetails implements Cloneable {

	private static volatile ConfigurationDetails instance;

	private ConfigurationDetails() {
	}

	public static ConfigurationDetails getConfigurationDetails() throws InterruptedException {
		if (instance != null) {
			return instance;
		}
		synchronized (ConfigurationDetails.class) {
			if(instance !=null) {
				return instance;
			}
			Thread.sleep(10);
			// if (instance == null) {
			instance = new ConfigurationDetails();
			// }

		}

		return instance;
	}
	@Override
	public Object clone()  throws CloneNotSupportedException{
		throw new CloneNotSupportedException("CLone not supported");
	}

}
