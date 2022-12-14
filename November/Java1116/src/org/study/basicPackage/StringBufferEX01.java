package org.study.basicPackage;

public class StringBufferEX01 {
	
	public static void main(String[] args) {
		
		//수정 가능
		StringBuffer sb1 = new StringBuffer("JAVA");
		
		//기본 문자열 바로 뒤에 문자열 추가
		sb1.append(" Project 2022");
		System.out.println(sb1);
		
		//문자열 삭제
		sb1.delete(0, 4);
		System.out.println(sb1);
		
		//지정하는 곳에 문자 추가하기
		sb1.insert(0, "2023");
		System.out.println(sb1);
		
		//역순으로 반환
		sb1.reverse();
		System.out.println(sb1);
		sb1.reverse();
		
		//시작과 끝을 지정하고 문자열 수정
		sb1.replace(0, 4, "Orecle");
		System.out.println(sb1);
		
		//시작 지점을 저하고 문자열 출력, 원본손상X
		System.out.println(sb1.substring(4));
		System.out.println(sb1.substring(4,sb1.length()-4));
		
		System.out.println(sb1);
	}

}
