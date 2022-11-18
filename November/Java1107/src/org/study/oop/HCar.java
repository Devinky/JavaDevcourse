package org.study.oop;

public class HCar {
	public static void main(String[] args) {
		
		Car h1 = new Car();
		h1.carName = "HCar";
		h1.carYear = 2023;
		h1.carPrice = 3000;
		h1.carColor = "Red";
		h1.carCC = 3000;

		h1.carInfo();
		
		CarBumfer bumfer1 = new CarBumfer();
		bumfer1.carBumferName = "HCar Bumfer";
		bumfer1.carBumferPrice = 200;
		
		CarHandle hHandle = new CarHandle();
		hHandle.CarHandleName = "HCAr Hacdle";
		hHandle.CarHandlePrice = 2000;
		
		CarChain hChain = new CarChain();
		hChain.CarChainName = "HCar Chain";
		hChain.CarChainPrice = 100;
	}

}
