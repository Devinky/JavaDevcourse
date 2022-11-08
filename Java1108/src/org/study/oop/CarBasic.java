package org.study.oop;

public class CarBasic {
	
	private String carName;
	private int carYear;
	private int carPrice;
	private static final String CARPROJECT = "Car2022";
	
	public CarBasic() {
		System.out.println(CARPROJECT);
	}
	
	public CarBasic(String carName) {
		System.out.println(CARPROJECT);
		this.carName = carName;
	}

	public CarBasic(String carName, int carYear) {
		System.out.println(CARPROJECT);
		this.carName = carName;
		this.carYear = carYear;
	}
	public CarBasic(String carName, int carYear, int carPrice) {
		System.out.println(CARPROJECT);
		this.carName = carName;
		this.carYear = carYear;
		this.carPrice = carPrice;
	}

	public String getCarName() {
		return carName;
	}
	public void setCarName(String carName) {
		this.carName = carName;
	}
	public int getCarYear() {
		return carYear;
	}
	public void setCarYear(int carYear) {
		this.carYear = carYear;
	}
	public int getCarPrice() {
		return carPrice;
	}
	public void setCarPrice(int carPrice) {
		this.carPrice = carPrice;
	}

}
