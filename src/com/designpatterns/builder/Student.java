package com.designpatterns.builder;

import java.time.LocalDate;

public class Student {
	/***
	 * This demo assumes that Student has to provide details while admitting to ABC
	 * university. name and email are mandatory. Rest of the fields are optional.
	 * Student has to get 70 score to get admission. From the optional fields one
	 * has to pick up the others.
	 */
	private int studentId;
	private String name;
	private String email;
	private LocalDate dob;
	private String passportNo;
	private String aadharNo;
	private String panNo;

	public Student(String studentName, String email) {
		this.name = studentName;
		this.email = email;

	}

	/*public Student(String studentName, String studentEmail, LocalDate dob) {
		this(studentName, studentEmail);
		this.dob = dob;
	}*/

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public String getPassportNo() {
		return passportNo;
	}

	public void setPassportNo(String passportNo) {
		this.passportNo = passportNo;
	}

	public String getAadharNo() {
		return aadharNo;
	}

	public void setAadharNo(String aadharNo) {
		this.aadharNo = aadharNo;
	}

	public String getPanNo() {
		return panNo;
	}

	public void setPanNo(String panNo) {
		this.panNo = panNo;
	}

	private Student(StudentBuilder builder) {
		this.name = builder.name;
		this.email = builder.email;
		this.aadharNo = builder.aadharNo;
		this.dob = builder.dob;
		this.panNo = builder.panNo;
		this.passportNo = builder.passportNo;
		this.studentId = studentId;
	}
	

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", name=" + name + ", email=" + email + ", dob=" + dob
				+ ", passportNo=" + passportNo + ", aadharNo=" + aadharNo + ", panNo=" + panNo + "]";
	}


	static class StudentBuilder {

		private int studentId;
		private String name;
		private String email;
		private LocalDate dob;
		private String passportNo;
		private String aadharNo;
		private String panNo;

		public StudentBuilder(String name, String email) {
			this.name = name;
			this.email = email;
		}

		public StudentBuilder setStudentId(int studentId) {
			this.studentId = studentId;
			return this;
		}

		public StudentBuilder setDob(LocalDate dob) {
			this.dob = dob;
			return this;
		}

		public StudentBuilder setPassportNo(String passportNo) {
			this.passportNo = passportNo;
			return this;
		}
		public StudentBuilder setAadharNo(String aadharNo) {
			this.aadharNo = aadharNo;
			return this;
		}
		public StudentBuilder setPanNo(String panNo) {
			this.panNo = panNo;
			return this;
		}
		public Student build() {
			return new Student(this);
		}
	}

	// Come up with Streotypic constructors

}
