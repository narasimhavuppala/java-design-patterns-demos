package com.designpatterns.builder;

import java.time.LocalDate;

import com.designpatterns.builder.Student.StudentBuilder;

public class testBuilder {

	public static void main(String[] args) {
		Student s = new StudentBuilder("Narasimha", "test@123.com").setAadharNo("123456789012").setPanNo("ABCDE123456")
				.setDob(LocalDate.of(1989, 10, 10)).build();
		System.out.println(s);
	}

}
