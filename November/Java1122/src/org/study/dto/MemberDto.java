package org.study.dto;

public class MemberDto {
	
	private int no;
	private String userId;
	private String userPw;
	private String email;
	private int age;
	
	public MemberDto(String userId, String userPw, String email, int age) {
		super();
		this.userId = userId;
		this.userPw = userPw;
		this.email = email;
		this.age = age;
	}
	
	public MemberDto(int no, String userId, String userPw, String email, int age) {
		super();
		this.no = no;
		this.userId = userId;
		this.userPw = userPw;
		this.email = email;
		this.age = age;
	}

	public int getNo() {
		return no;
	}
	
	public void setNo(int no) {
		this.no = no;
	}
	
	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserPw() {
		return userPw;
	}

	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
