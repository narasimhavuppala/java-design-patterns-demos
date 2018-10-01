package com.designpatterns.singleton.breaking;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import com.designpatterns.singleton.ConfigurationDetails;

public class Reflection {

	public static void main(String[] args)
			throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, InterruptedException {

		Constructor[] constructors = ConfigurationDetails.class.getDeclaredConstructors();
		for (Constructor c : constructors) {
			c.setAccessible(true);
			ConfigurationDetails cd1 = (ConfigurationDetails) c.newInstance();
			ConfigurationDetails cd2=ConfigurationDetails.getConfigurationDetails();
			System.out.println(cd1);
			System.out.println(cd2);
		}
	}

}
