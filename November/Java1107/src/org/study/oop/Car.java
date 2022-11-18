package org.study.oop;

public class Car {
	
	//필드
	public String carName;
	public int carYear;
	public int carPrice;
	public String carColor;
	public int carCC;
	
	//기본생성자 : 생략하면 자동으로 생성됨(다른 생성자가 없을 시)
	
	//인스턴스 매서드 new
	
	public void carInfo() {
		System.out.println("이름: " + carName);
		System.out.println("연식: " + carYear);
		System.out.println("가격: " + carPrice);
		System.out.println("색상: " + carColor);
		System.out.println("배기량: " + carCC);
	}

}
