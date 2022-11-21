package org.study.collection;

public class MemberDto {

	private String userId;
	private String userPw;
	private String userName;
	private int age;

	// 생성자 4개
	MemberDto(String userId, String userPw, String userName, int age) {
		super();
		this.userId = userId;
		this.userPw = userPw;
		this.userName = userName;
		this.age = age;
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

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

//	@Override
//	public String toString() {
//		String user = "아이디: " + userId + "비밀번호 : " + userPw + "이름 : " + userName + "나이 : " + age;
//		return user();
//	}

}
