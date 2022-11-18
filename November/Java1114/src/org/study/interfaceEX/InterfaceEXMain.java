package org.study.interfaceEX;

interface In1{
	public static final int MAXNUM = 500;
	
	public abstract void in1Method1();
	
	default void defaultMethod(){
		System.out.println("디폴트메서드");
	}
}	

interface In2 extends In1{
	public abstract void excuteCommend();
}

class In12 implements In2{ 

	@Override
	public void in1Method1() {
		System.out.println("In1Method 오버라이딩");
	}

	@Override
	public void excuteCommend() {
		System.out.println("In2Method 오버라이딩");
	}
	
	@Override
	public void defaultMethod() {
		In2.super.defaultMethod();
	}//디폴트메서드는 선택
}

public class InterfaceEXMain {
	
	public static void main(String[] args) {
		In12 in12 = new In12();
		In1 in1 = new In12();
		In2 in2 = new In12();
		
	}
}
