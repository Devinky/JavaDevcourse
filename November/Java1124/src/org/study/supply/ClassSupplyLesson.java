package org.study.supply;

class bread{
	//클래스멤버(필드, 생성자, 메서드)
	
	//필드
	public int price;
	public int time;
	//static멤버(클래스멤버) 저장되는 데이터영역이 다름 -> 공유
	public static int MAXNUM = 100;
	
	//생성자
	public bread(int price) {
		//메서드 오버로딩
		this.price = price;
	}
	
	public bread() {
		//생성자(사실 메서드임 생성자메서드라고 함) : 객체의 종류를 설정가능
		//모든 요소가? void임
	}
	
	//메서드(리턴값이 없으면 void, 있으면 매개변수의 타입을 써주고 return값을 받음)
	public String menu(String menulist) {
		return menulist;
	}
}

public class ClassSupplyLesson {
	
	public static void main(String[] args) {
		//static멤버 
		System.out.println(bread.MAXNUM);
		
		//new 객체의 주소 생성 -> 인스턴스화
		bread b1 = new bread();
		//사용자정의타입 객체참조변수 = 객체생성연산자 생성자();
		b1.price = 3000;
		b1.time = 30;
		String menu = b1.menu("식빵");
		
		System.out.println(b1.price);
		System.out.println(b1.time);
		System.out.println(menu);
		
		bread b2 = new bread(2500);
		b2.time = 40;
		String menu2 = b2.menu("바게트");
		
		System.out.println(b2.price);
		System.out.println(b2.time);
		System.out.println(menu2);
		
	}

}
