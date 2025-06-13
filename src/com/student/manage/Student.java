package com.student.manage;

public class Student {
	private int StudentId;
	private String StudentName;
	private String StudenPhone;
	private String StudentCity;
	public Student(int studentId, String studentName, String studenPhone, String studentCity) {
		super();
		StudentId = studentId;
		StudentName = studentName;
		StudenPhone = studenPhone;
		StudentCity = studentCity;
	}
	public Student(String studentName, String studenPhone, String studentCity) {
		super();
		StudentName = studentName;
		StudenPhone = studenPhone;
		StudentCity = studentCity;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(Object id, String name, String phone, String city) {
		// TODO Auto-generated constructor stub
	}
	public int getStudentId() {
		return StudentId;
	}
	public void setStudentId(int studentId) {
		StudentId = studentId;
	}
	public String getStudentName() {
		return StudentName;
	}
	public void setStudentName(String studentName) {
		StudentName = studentName;
	}
	public String getStudenPhone() {
		return StudenPhone;
	}
	public void setStudenPhone(String studenPhone) {
		StudenPhone = studenPhone;
	}
	public String getStudentCity() {
		return StudentCity;
	}
	public void setStudentCity(String studentCity) {
		StudentCity = studentCity;
	}
	@Override
	public String toString() {
		return "Student [StudentId=" + StudentId + ", StudentName=" + StudentName + ", StudenPhone=" + StudenPhone
				+ ", StudentCity=" + StudentCity + "]";
	}
	
	
	
	
	
	

}
