package com.designpatterns.singleton;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestSingleton {

	public static void main(String[] args) throws InterruptedException {

		Runnable r = () -> {
			try {
				System.out.println(ConfigurationDetails.getConfigurationDetails());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		};
		
		ExecutorService threadPool=Executors.newFixedThreadPool(30);

		for (int i = 0; i < 30; i++) {
			Thread.sleep(5);
			threadPool.submit(r);
		}
	}

}
