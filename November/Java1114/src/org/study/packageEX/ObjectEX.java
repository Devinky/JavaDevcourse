package org.study.packageEX;

class ObSub{
	
	private String name;
	private int age;
	public ObSub() {	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}

public class ObjectEX {
	
	public static void main(String[] args) {
		ObSub o1 = new ObSub();
		ObSub o2 = new ObSub();
		
		System.out.println(o1.getClass()); //기본클래스의 전체
		System.out.println(o1.getClass().getName()); //기본클래스의 이름
		System.out.println(o1.getClass().isArray()); //배열 is 배열인가? 물어보는 것 boolean
		System.out.println(o1.hashCode()); 
		System.out.println(o1.toString()); //객체 o1의 정보 문자열
		System.out.println(o2.toString()); //객체 o2의 정보 문자열
		
		System.out.println(o1.equals(o2)); //객체를 비교 o1과 o2가 같은지 -> 객체의 주소값이 달라서 false가 나옴
		
	}

}
