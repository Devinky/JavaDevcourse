package org.study.oop;

import java.util.Date;

public class FieldEX {
	//클래스의 인스턴스 맴버
	public int num; //기본자료형
	public String name; //String
	public int[] arr1; //배열
	public Date day; //라이브러리
	public Car car; //클래스
	//클래스 맴버
	public static final String MEMBERNAME = "JAVA";
	
	public static void method() {
		System.out.println(MEMBERNAME);
	}

}
