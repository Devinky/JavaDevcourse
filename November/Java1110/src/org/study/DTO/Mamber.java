package org.study.DTO;

public class Mamber {
	
	private String userID;
	private String userPW;
	private int age;
	private String email;
	
	public Mamber(String userID, String userPW, int age, String email) {
		super();
		this.userID = userID;
		this.userPW = userPW;
		this.age = age;
		this.email = email;
	}
	
	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) {
		this.userID = userID;
	}
	public String getUserPW() {
		return userPW;
	}
	public void setUserPW(String userPW) {
		this.userPW = userPW;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}
