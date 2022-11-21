package org.study.collection;//패키지이름(패키지 : 유사한 클래스의 모음)

import java.util.Date;

//접근지정자 class 클래스명{} -클래스 선언
public class ClassTypeMain {
	
	public static void main(String[] args) {
		//타입	객체참조변수	객체 생성(생성자 호출)
		ClassType type = new ClassType();
		
		//기본타입(premitive?)
		type.num1 = 100;
		//객체타입
		type.name = new String("Inky"); //<-스트링도 객체타입이라 원래 이렇게 써야하는데 생략 가능
		type.day = new Date();
		type.obj = new Object();
		//private 멤버 -> setter, getter 사용
		type.setId("devinky");
		type.getId();
	}

}
