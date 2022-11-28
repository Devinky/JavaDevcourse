package org.study.gui;

class InnerClassEx{
	//내부클래스 - 필드 위치에 있는 클래스: 인스턴스 클래스
	class InstanceClass{
		int num1;
	}
	//static클래스
	static class StaticClass{
		static final int MAXNUM = 100;
	}
	void instanceMethod() {
		//지역클래스
		class InstanceClass{
			void inM() {
				System.out.println("인스턴스 클래스");
			}
		}
		InnerClassEx in1 = new InnerClassEx();
//		in1.inM(); //-> 왜 에러나지?
	}
}


public class Test1128 {
	
	public static void main(String[] args) {
		System.out.println("");
		
		int[] iArr = new int[3];
		
		//예외처리 try~catch
		try {
			//예외가 발생할 것이 예상되는 코드
			iArr[4] = 10;
			System.out.println("예외 발생하지 않았음");
		} catch (ArrayIndexOutOfBoundsException e) { //어떤 예외가 발생할 것 같은지
			e.printStackTrace();
			System.out.println("예외 발생");
		}
		
		
	}

}
