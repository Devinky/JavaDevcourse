package org.study.oop;

public class RegisterDTOMain {
	
	public static void main(String[] args) {
		
		RegisterDTO dto = new RegisterDTO();
		
		dto.setUser_no(31);
		int user_no = dto.getUser_no();
		System.out.println(user_no);
		
		dto.setUserName("InKyeong");
		String userName = dto.getUserName();
		System.out.println(userName);
		
		dto.setUserPhone("010-1234-5678");
		String userPhone = dto.getUserPhone();
		System.out.println(userPhone);

		dto.setAddress("서울시 노원구");
		String address = dto.getAddress();
		System.out.println(address);
		
		dto.setInDate("2022.11.08");
		String inDate = dto.getIndate();
		System.out.println(inDate);
		
		dto.setGrade("졸업생");
		String grade = dto.getGrade();
		System.out.println(grade);
		
		dto.setCity("서울특별시");
		String city = dto.getCity();
		System.out.println(city);
		
		
	}
	
	
}
