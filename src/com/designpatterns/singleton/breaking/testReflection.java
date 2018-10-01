package com.designpatterns.singleton.breaking;


public class testReflection {

	public static void main(String[] args) {

		ConfigurationDetails cd=ConfigurationDetails.instance;
		System.out.println(cd.hashCode());
	}

}
