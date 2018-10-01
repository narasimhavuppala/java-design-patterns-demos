package com.designpatterns.singleton;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

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
