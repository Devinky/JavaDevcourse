package org.study.innerclass;

public class LocalClass {
	
	public void localMethod() {
		class LocalClassBasic{
			void m1() {
				System.out.println("지역클래스 메서드");
			}
		}
		LocalClassBasic local = new LocalClassBasic();
		local.m1();
	}

}
