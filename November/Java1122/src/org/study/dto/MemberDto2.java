package org.study.dto;

public class MemberDto2 {
	
	private String userId;
	private String email;
	private String phone;
	private int age;

	public MemberDto2(String userId, String email, String phone, int age) {
		super();
		this.userId = userId;
		this.email = email;
		this.phone = phone;
		this.age = age;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	

}
