package com.designpatterns.singleton;

public class ConfigurationDetails {

	private static volatile ConfigurationDetails instance;

	private ConfigurationDetails() {
	}

	public static ConfigurationDetails getConfigurationDetails() throws InterruptedException {
		if (instance != null) {
			return instance;
		}
		synchronized (ConfigurationDetails.class) {
			Thread.sleep(10);
			// if (instance == null) {
			instance = new ConfigurationDetails();
			// }

		}

		return instance;
	}

}
