package org.study.package01;
//접근지정자 public
public class ModifyEX01 {
	
	public int num1;
	private int num2;
	protected int num3;
	int num4; //default

	public void m1() {
		System.out.println("m1");
	}
	
	public void m2() {
		System.out.println("m2");
	}
	
	void m3() {
		System.out.println("m3");
	}
	
	protected void m4() {
		System.out.println("m4");
	}
	
	//private
	public void setNum2(int num2) {
		this.num2 = num2;
	}
	public int getNum2() {
		return num2;
	}
	
	

}
