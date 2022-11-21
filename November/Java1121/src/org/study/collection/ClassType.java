package org.study.collection;//패키지이름(패키지 : 유사한 클래스의 모음)

import java.util.Date;//import -> 패키지 불러오기

//접근지정자 class 클래스명{} - 클래스 선언 -> '사용자 정의 타입'이라고도 부른다
public class ClassType {
	//클래스 멤버들

	//필드 = 프로퍼티, 속성
	public int num1;
	public String name;
	public Object obj;
	public Date day;
	private String id;
	
	//생성자(construct) new로 객체 만들면 불려오는 놈
	public ClassType() {
		//기본생성자
	}
	
	//메서드
	public void setId(String id) {
		this.id = id;
	}
	public String getId() {
		return id;
	}
	
}
