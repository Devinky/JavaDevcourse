package org.study.ex;

class ThreadClass extends Thread{
	@Override
	public void run() {
		
		int idx=0;
		for(int i=0;i<10;i++) {
			System.out.println("idx: " +idx++);
			
			try {
				Thread.sleep(1000); //1초 멈춤
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class ClassMain {
	
	public static void main(String[] args) {
		//객체를 생성할 때 불러오는 것이 생성자이다
		//클래스로부터 객체를 만드는 과정=인스턴스화(객체화)
		ClassA a = new ClassA();
		ClassA a2 = new ClassA(10);
		
		A a3 = new A();
		A b1 = new B(); //다형성(부모타입의 객체참조변수로 자식객체를 참조)
		
		b1.a1(); //상속받은 메서드 호출
		b1.a = 100; //부모 클래스의 필드 초기화(public이라 가능)
		
		ThreadClass t1 = new ThreadClass();
		t1.start();
		
	}

}
