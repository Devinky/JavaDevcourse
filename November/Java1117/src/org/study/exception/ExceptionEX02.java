package org.study.exception;

public class ExceptionEX02 {
	public static void main(String[] args) {
		System.out.println("Exception");
		
		//ArrayIndexOutOfBoundsException
		//배열의 인덱스 초과시
		int[] arrint = new int[5];
		
		try {
			for(int i=0;i<6;i++) {
				arrint[i]=i;
			}
			System.out.println("Success!!");
		}catch(ArrayIndexOutOfBoundsException e){
			e.printStackTrace();
			System.out.println(e.getMessage());
		}finally {
			//Connection close
			System.out.println("기본실행문");
		}
		
		System.out.println("프로그램 정상 실행");
		
	}

}
