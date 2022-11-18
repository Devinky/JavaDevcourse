package org.study.Inheritance;

public class InheritanceMain {
	
	public static void main(String[] args) {
		
		ParentsClass p1 = new ParentsClass();
		Child01 c1 = new Child01();
		
		c1.childNum1 = 10;
		c1.childNum2 = 20;
		
		c1.childMethod();
		c1.num1 = 100;
		c1.num3 = 300;
		c1.num4 = 400;
	}

}
