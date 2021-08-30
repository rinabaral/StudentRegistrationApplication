package com.register;

import javax.validation.constraints.Email;

public class Student {
	

	private String id, name, stream, phone;
	@Email
	private String email;
	
		public Student(String i, String name, String email, String stream, String phone) {
		this.id = i;
		this.name = name;
		this.email = email;
		this.stream = stream;
		this.phone = phone;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
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
	public String getStream() {
		return stream;
	}
	public void setStream(String stream) {
		this.stream = stream;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", email=" + email + ", stream=" + stream + ", phone=" + phone
				+ "]";
	}
	

	

	

}
