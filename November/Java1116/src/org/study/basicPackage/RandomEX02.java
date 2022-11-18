package org.study.basicPackage;

import java.util.Random;

public class RandomEX02 {

	public static void main(String[] args) {
		System.out.println("Random 클래스");

		Random rd1 = new Random();

		// 5번 실행(정수값을 랜덤으로)
		for (int i = 0; i < 5; i++) {
			System.out.println(rd1.nextInt());
		}
		System.out.println();

		// 5번 실행 1~45까지의 정수 출력
		for (int i = 0; i < 5; i++)
			System.out.println(rd1.nextInt(46)); // 0~45까지의 정수 출력
		
		//5번 실행 -> 랜덤 소수점 두 자리(printf)
		for(int i=0;i<5;i++)
			System.out.printf("Random -> %.2f\n",rd1.nextDouble());
										//↑이렇게 출력하라←이 값을↑
	}

}
