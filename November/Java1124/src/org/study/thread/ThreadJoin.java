package org.study.thread;

class thread1 extends Thread{

	int num = 1;

	@Override
	public void run() {
		for(int i=0;i<10;i++){
			System.out.println("Thread-> " + num++);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class ThreadJoin {
	
	public static void main(String[] args) {
		
		System.out.println("Main Thread Start");
		
		thread1 t1 = new thread1();
		t1.start();
		
		try {
			t1.join(); //스레드가 다 끝날 때까지 다음 메서드를 대기하게 한다
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Main Thread Finish");
		
	}

}
