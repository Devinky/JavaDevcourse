package org.study.innerclass;

public class InnerClassBasic {
	
	class InstanceClass{
		int i = 10;
		//static int i2 = 20; //static클래스에서만 선언
		final static int NUM = 100;
	}
	
	static class StaticInner{
		int i = 10;
		static int i2 = 20;
	}
	
	public void localMethod() {
		class LocalClass{
			int i = 10;
			//static int i2=20; //static클래스에서만 선언
			final static int NUM = 100;
			void local1() {
				System.out.println("local 메서드");
			}
		}
		//LocalClass호출
		LocalClass l1 = new LocalClass();
		l1.local1();
	}
	
	
	public static void main(String[] args) {
		System.out.println(InstanceClass.NUM);
		System.out.println(StaticInner.i2);
	}
	
	

}
