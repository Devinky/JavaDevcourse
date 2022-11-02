package org.study.loopEX;

public class forEX02 {
	public static void main(String[] args) {
		
		System.out.println("for문");
		System.out.println("구구단 2단부터 9단까지");
		//2단부터 9단까지 for문을 이용해 순서대로 출력
		
		for(int i=2;i<10;i++) {
			System.out.println("\n구구단 " + i + "단");
			for(int j=1;j<10;j++) {
				System.out.println(i + " x " + j + " = " + (i*j));
			}
		}
		
		System.out.println("\n구구단 9단부터 2단까지");
		//9단부터 2단까지 for문을 이용해 순서대로 출력
		
		for(int i=9;i>1;i--) {
			System.out.println("\n구구단" + i + "단");
			for(int j=1;j<9;j++) {
				System.out.println(i + " x " + j + " = " + (i*j));
			}
		}
	}

}
