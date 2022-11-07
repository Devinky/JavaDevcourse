package org.study.oop;

public class CarMain {
	
	public static void main(String[] args) {
		
		Car hCar = new Car();
		
		hCar.carName = "HCar";
		hCar.carYear = 2022;
		hCar.carPrice = 3000;
		hCar.carColor = "Lime";
		hCar.carCC = 2000;
		
		hCar.carInfo();
		
		Car mCar = new Car();

		mCar.carName = "MCar";
		mCar.carYear = 2022;
		mCar.carPrice = 3000;
		mCar.carColor = "Cobalt";
		mCar.carCC = 2000;
		
		mCar.carInfo();
		
		System.out.println(hCar.getClass()==mCar.getClass()); //원본클래스가 같냐고 물어보는 것
	}

}
