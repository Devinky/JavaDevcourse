package org.study.innerclass;

//외부클래스
public class InnerClassEX {
	//내부클래스
	//인스턴스 클래스
	class InstanceClass2{
		int num1;
		void m1() {
			System.out.println("");
		}
	}
	//static클래스(정적클래스)
	static class StaticClass2{
		static void method1() {
			System.out.println("StaticClass2, static 메서드");
		}
	}
	//지역클래스
	void localMethod() {
		class LocalClass2{
			int num;
			void m2() {
				System.out.println("LocalClass2");
			}
		}
		LocalClass2 loc2 = new LocalClass2();
		loc2.m2();
	}
}
