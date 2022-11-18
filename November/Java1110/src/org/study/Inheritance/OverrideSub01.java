package org.study.Inheritance;

public class OverrideSub01 extends Overrideparents{
	
	@Override
	public void excuteQuery(int num1) {
		System.out.println("OverrideSub01 " + num1);
	}

}
