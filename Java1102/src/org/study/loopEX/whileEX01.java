package org.study.loopEX;

public class whileEX01 {
	
	public static void main(String[] args) {
		
		System.out.println("while문");
		
		int i = 0; //초기화
		
		//조건식
		while(i<10) { //조건식이 true면 실행
//			System.out.println(i);
			if(i>=9) {
				System.out.print(i);
			}else {
				System.out.print(i + ",");
			}
			i++;
		}
		
	}

}
