package org.study.oop;

public class ConstructEX {
	
	private String userID;
	private String userPW;
	private int age;
	
	public ConstructEX() {
		System.out.println("기본생성자");
	}
	
	public ConstructEX(String userID) {
		System.out.println("생성자2");
		this.userID = userID;
	}
	
	public ConstructEX(String userID, String userPW) {
		System.out.println("생성자3");
		this.userID = userID;
		this.userPW = userPW;
	}

	public ConstructEX(String userID, String userPW, int age) {
		System.out.println("생성자4");
		this.userID = userID;
		this.userPW = userPW;
		this.age = age;
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
	
	public String info() {
		String info = "아이디 : " + userID + ", 비밀번호 : " + userPW + ", 나이 : " + age;
		return info;
	}
	
	public void info2() {
		System.out.println("아이디 : " + userID + ", 비밀번호 : " + userPW + ", 나이 : " + age);
	}
	

}
