package org.study.operatorEX;

public class operator12 {
	
	public static void main(String[] args) {
		
		System.out.println("단항연산자");
		
		int i = 10;
		
		// i++, 선처리 후증가
		System.out.println(i++); //10
		System.out.println(i); //11
		i++; //12
		System.out.println(i); //12
		System.out.println(i);
		
		// ++i, 선증가 후처리
		System.out.println(++i); //13
		System.out.println(i); //13
		++i; //14
		System.out.println(i); //14
		
		System.out.println();
		
		int k = 10;
		
		// i--, 선처리 후감소
		System.out.println(k); //10
		System.out.println(k--); //10
		System.out.println(k); //9
		k--; //8
		System.out.println(k); //8
		System.out.println();
		
		// --i, 선감소 후처리
		System.out.println(k); //8
		System.out.println(--k); //7
		System.out.println(k); //7
		--k; //6
		System.out.println(k); //6
		}

	}

