package org.study.thread;

import java.awt.Toolkit;

class ThreadSub2 extends Thread{
	int num = 0;
	
	@Override
	public void run() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		
		for(int i=0;i<10;i++) {
			System.out.println("ThreadSub2 : num -> " + num++);
			toolkit.beep();
			
			try {
				Thread.sleep(1000); //1초 지연(1초 있다가 다음이 실행됨)
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class ThreadEX02 {
	
	public static void main(String[] args) {
		
		ThreadSub2 t1 = new ThreadSub2();
		t1.start();
		
		for(int i=0;i<5;i++) {
			System.out.println("main스레드 : "+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("main 스레드 종료");
	}

}
