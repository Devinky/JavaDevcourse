package org.study.oop;

public class PrivateFieldEX {
	
	//이 부분은 필드
	private String userID;
	private String userPW;
	private int userAge;
	private String addr;
	
	//setter, getter (private에 집어넣고 뽑는 역할)
	//private에 접근하게 해주는 메소드 이런 방식으로 사용한다
	//접근 불가능한 private 필드를 초기화하는 기능
	//setter -> private 필드를 외부에서 초기화하는 메소드
	public void setUserId(String userID) {
		//this.필드 = 매개변수(외부입력)
		this.userID = userID;
	}
	
	//getter(setter로 초기화한 값을 호출) : private 필드를 외부에 호출하는 메소드
	public String getUserID() {
		return this.userID;
	}
	
	//예제 : userPW, userAge를 setter, getter 메소드 생성하기
	public void setUserPW(String userPW) {
		this.userPW = userPW;
	}
	
	public String getUserPW() {
		return this.userPW;
	}
	
	public void setUserAge(int userAge) {
		this.userAge = userAge;
	}
	
	public int getUserAge() {
		return this.userAge;
	}
	
	public void setAddr(String addr) {
		this.addr = addr;
	}
	
	public String getAddr() {
		return this.addr;
	}

}
