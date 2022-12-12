package org.project.dto;

public class Member01 {
	
	private String userId;
	private String userPw;
	private String email;
	
	public Member01(String userId, String userPw, String email) {
		super();
		this.userId = userId;
		this.userPw = userPw;
		this.email = email;
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
	
	

}
