package org.study.loopEX;

public class dowhileEX01 {
	public static void main(String[] args) {
		System.out.println("do~while");
		//0~9까지 출력
		
		//1.초기화
		int i = 0;
		
		do {
			System.out.println(i);
			i++; //증감식
		}while(i<10); //2. 조건식

	}

}
