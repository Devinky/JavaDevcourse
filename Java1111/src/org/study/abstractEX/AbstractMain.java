package org.study.abstractEX;

public class AbstractMain {
	
	public static void main(String[] args) {
//		new AbstractEX01();
//		new AbstractEX01Sub02Sub();
		
		AbstractEX01Sub01 s1 = new AbstractEX01Sub01();
		s1.abstractMethod();
		
		AbstractEX01Sub02Sub s2 = new AbstractEX01Sub02Sub();
		
		s2.abstractMethod();
		s2.abstractMethod2();
		
	}

}
