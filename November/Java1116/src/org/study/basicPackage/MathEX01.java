package org.study.basicPackage;

import java.util.Random;

public class MathEX01 {
	
	public static void main(String[] args) {
		System.out.println("Math");
		
//		double d = Math.random();
//		System.out.println(d);
		
		//1~100까지의 랜덤한 정수
		for(int i=0;i<10;i++);{
			System.out.println((int)(Math.random()*100)+1);
		}
		System.out.println();
		
		//1~45까지의 랜덤한 정수
		for(int i=0;i<10;i++);{
			System.out.println((int)(Math.random()*45)+1);
		}
		
		System.out.println("=====================");
		System.out.println(Math.min(100,50));
		System.out.println(Math.max(100,50));
		System.out.println(Math.abs(-100));
		System.out.println(Math.ceil(11.2));
		System.out.println(Math.floor(11.2));
		System.out.println(Math.round(11.5));
		System.out.println(Math.round(11.2));
		System.out.println(Math.PI);
		
		Random r = new Random();
		int rad1 = r.nextInt();//정수값 랜덤
		int rad2 = r.nextInt(100); //0<= <100

		System.out.println(rad1);
		System.out.println(rad2);
		
	}

}
