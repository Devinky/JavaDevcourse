package org.study.DBMemberDto;

//회원가입 멤버
public class MemberDTO {
	
	private String userID;
	private String userPW;
	private int userAge;
	private String userName;
	private String userAddr;
	
	public MemberDTO(String userID, String userPW, int userAge,
					String userName, String userAddr) {
		this.userID = userID;
		this.userPW = userPW;
		this.userAge = userAge;
		this.userName = userName;
		this.userAddr = userAddr;
		
		getMemberDTO(); //저장하자마자 호출
	}
	
	public void getMemberDTO() {
		System.out.print("아이디 : " + userID + ", ");
		System.out.print("비밀번호 : " + userPW + ", ");
		System.out.print("나이 : " + userAge + ", ");
		System.out.print("이름 : " + userName + ", ");
		System.out.println("주소 : " + userAddr + "\n");
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
	public int getUserAge() {
		return userAge;
	}
	public void setUserAge(int userAge) {
		this.userAge = userAge;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserAddr() {
		return userAddr;
	}
	public void setUserAddr(String userAddr) {
		this.userAddr = userAddr;
	}
	

}
