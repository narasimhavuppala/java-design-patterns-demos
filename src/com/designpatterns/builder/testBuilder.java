package com.designpatterns.builder;

import com.designpatterns.builder.Student.StudentBuilder;

public class testBuilder {

	public static void main(String[] args) {
		Student s = new StudentBuilder("", "").build();
	}

}
