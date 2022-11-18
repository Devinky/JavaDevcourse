package org.study.oop;

public class ConstructEX01 {
	
	private String userID;
	private String userPW;
	private int age;
	
	//컴파일러가 자동으로 기본생성자를 생성
	//클래스와 이름이 같다
	//void라 반환값 없음(생략 가능)
	public ConstructEX01() {
		this("m1234");
		System.out.println("기본생성자");
	}
	//메소드 오버로딩
	public ConstructEX01(String userID) {
		this("m1234", "1234");
		System.out.println(userID);
	}

	public ConstructEX01(String userID, String userPW) {
		System.out.println(userID);
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

}
