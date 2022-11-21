package org.study.collection;

public class GenericEX01Main<E> {
	
	public static void main(String[] args) {
		GenericEX01<Integer> g1 = new GenericEX01<Integer>();
		
		g1.t1 = new Integer(10); //->박싱
		//객체타입만 사용 가능하니까 new로 객체 생성 해야함
		
		g1.t1 = 10; //이렇게 써도 됨 이게 뭐다? 자동박싱(객체형이 기본형으로 변환)
		
//		int num1 = g1.m1(10).intValue(); -> 언박싱
		int num1 = g1.m1(10); //->자동언박싱
		
		GenericEX01<String> g2 = new GenericEX01<String>();
		g2.t1 = "String Type이 됨";
		String str1 = g2.m1("문자열 변환");
		
	}

}
