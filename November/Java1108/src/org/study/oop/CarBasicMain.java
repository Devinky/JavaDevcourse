package org.study.oop;

public class CarBasicMain {
	
	public static void main(String[] args) {
		//필드를 초기화하고 콘솔에 출력
		//getter, setter를 이용해서 실행
		
		//기본생성자
		CarBasic c1 = new CarBasic();
		c1.setCarName("MyCar");
		c1.setCarYear(2022);
		c1.setCarPrice(3000);
		
		System.out.println("CarName : " + c1.getCarName());
		System.out.println("CarYear : " + c1.getCarYear());
		System.out.println("CarPrice : " + c1.getCarPrice());
		System.out.println();
		
		//생성자2
		CarBasic c2 = new CarBasic("YourCar");
		c2.setCarYear(2023);
		c2.setCarPrice(2000);
		
		System.out.println("CarName : " + c2.getCarName());
		System.out.println("CarYear : " + c2.getCarYear());
		System.out.println("CarPrice : " + c2.getCarPrice());
		System.out.println();
		
		//생성자3
		CarBasic c3 = new CarBasic("TheirCar", 2024);
		c3.setCarPrice(3500);
		
		System.out.println("CarName : " + c3.getCarName());
		System.out.println("CarYear : " + c3.getCarYear());
		System.out.println("CarPrice : " + c3.getCarPrice());
		System.out.println();
		
		//생성자4
		CarBasic c4 = new CarBasic("MotherCar", 2025, 2700);
		
		System.out.println("CarName : " + c4.getCarName());
		System.out.println("CarYear : " + c4.getCarYear());
		System.out.println("CarPrice : " + c4.getCarPrice());
		
	}

}
