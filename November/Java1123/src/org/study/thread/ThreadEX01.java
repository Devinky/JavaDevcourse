package org.study.thread;

//thread를 만드는 첫번째 방법(상속)
class ThreadSub extends Thread{
	@Override
	public void run() {
		System.out.println("Thread run() 메서드");
	}
}

public class ThreadEX01 {
	
	public static void main(String[] args) {
		System.out.println("스레드 생성 -> Thread Class 이용");
		ThreadSub t1 = new ThreadSub();
		t1.start(); //스레드 시작
		
	}

}
