package org.study.loopEX;

import java.util.Scanner;

public class whileEX07 {
	
	public static void main(String[] args) {
		System.out.println("while문으로 계산기 프로그램 만들기");
		//while(true)를 이용해서 아이디와 비밀번호가 일치하면 while문을 종료
		//exit를 입력하면 while문을 종료
		//연산자, exit를 제외한 문자열이 입력되면 입력 오류를 출력
		//Scanner를 이용하여 정수 두개와 연산자 입력받기
		//연산자에 따라 연산을 실행
		//if~else if, Scanner, 변수 2개(정수형), String(연산자) 1개, while문 사용
		
		Scanner input = new Scanner(System.in);
		
		while(true) {
			
			System.out.println("계산기를 실행하시겠습니까?");
			String ans = input.next();
			if(ans.equals("exit")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}else if(ans.equals("run")) {
				System.out.print("연산할 첫번째 수를 입력하세요 : ");
				int first = input.nextInt();
				
				System.out.print("어떤 연산을 할까요?(+-*/) : ");
				String op = input.next();				
				
				System.out.print("연산할 두번째 수를 입력하세요 : ");
				int second = input.nextInt();
				
				if(op.equals("+")) {
					System.out.println(first + " + " + second + " = " + (first+second));				
				}else if(op.equals("-")) {
					System.out.println(first + " - " + second + " = " + (first-second));				
				}else if(op.equals("*")) {
					System.out.println(first + " x " + second + " = " + (first*second));				
				}else if(op.equals("/")){
					System.out.println(first + " ÷ " + second + " = " + (first/(double)second));				
				}else {
					System.out.println("입력 오류. 다시 입력해주세요.");
				}
			}
		}
		input.close();
	}

}
