package org.study.oop;

public class ConstructEX {
	
	private int num1;
	private int num2;
	private String op;
	
	public ConstructEX() {
		this(200, 300);
	} //매개변수가 없으면 기본생성자, 다른 생성자를 생성했으면 기본생성자가 생성이 안됨
	
	public ConstructEX(int num1, int num2) {
		System.out.println("생성자2");
		this.num1 = num1;
		this.num2 = num2;
	}
	
	public ConstructEX(int num1, int num2, String op) {
		System.out.println("생성자3");
		this.num1 = num1;
		this.num2 = num2;
		this.op = op;
	}
	
	public int getNum1() {
		return num1;
	}
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	public int getNum2() {
		return num2;
	}
	public void setNum2(int num2) {
		this.num2 = num2;
	}
	public String getOp() {
		return op;
	}
	public void setOp(String op) {
		this.op = op;
	}
	

}
