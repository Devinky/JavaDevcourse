package org.study.oop;

public class PrivateFieldEXMain {
	
	public static void main(String[] args) {
		
		PrivateFieldEX ins1 = new PrivateFieldEX();
		
		//얘네는 지역변수라 필드와 이름은 같아도 다른 녀석들임
		ins1.setUserId("Inky");
		String userID = ins1.getUserID();
		System.out.println(userID);
		
		//생성한 userPW, userAge, addr를 콘솔에 출력하시오
		ins1.setUserPW("h12345");
		String userPW = ins1.getUserPW();
		System.out.println(userPW);
		
		ins1.setUserAge(29);
		int userAge = ins1.getUserAge();
		System.out.println(userAge);
		
		ins1.setAddr("서울시 도봉구 도봉동");
		String addr = ins1.getAddr();
		System.out.println(addr);
		
	}

}
