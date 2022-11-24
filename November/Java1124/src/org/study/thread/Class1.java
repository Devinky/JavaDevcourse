package org.study.thread;

class thread extends Thread{
	
	String str = "java database";
	@Override
	public void run() {
		for(int i=0;i<str.length();i++) {
			System.out.println(str.charAt(i));
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
}

public class Class1 {
	
	public Class1() {
		System.out.println("기본생성자");
	}
	
	public static void main(String[] args) {
		new Class1();
		
	}
	
}
