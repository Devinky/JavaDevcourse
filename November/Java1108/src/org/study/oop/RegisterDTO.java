package org.study.oop;

public class RegisterDTO {
	
	private int user_no;
	private String userName;
	private String userPhone;
	private String adddress;
	private String inDate;
	private String grade;
	private String city;
	
	//위 필드로 setter, getter 메소드를 생성하시오
	
	public void setUser_no(int user_no) {
		this.user_no = user_no;
	}
	
	public int getUser_no() {
		return this.user_no;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String getUserName() {
		return this.userName;
	}
	
	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}
	
	public String getUserPhone() {
		return this.userPhone;
	}
	
	public void setAddress(String address) {
		this.adddress = address;
	}
	
	public String getAddress() {
		return this.adddress;
	}
	
	public void setInDate(String inDate) {
		this.inDate = inDate;
	}
	
	public String getIndate() {
		return this.inDate;
	}
	
	public void setGrade(String grade) {
		this.grade = grade;
	}
	
	public String getGrade() {
		return this.grade;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public String getCity() {
		return this.city;
	}

}
