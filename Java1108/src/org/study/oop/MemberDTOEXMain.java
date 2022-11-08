package org.study.oop;

import java.util.Scanner;

public class MemberDTOEXMain {
	
	public static void main(String[] args) {
		
		//Scanner를 이용해서 회원가입 하고 회원가입 정보를 콘솔에 출력하기
		//while(true), 조건문(if), exit를 입력하면 while문을 종료하기
		
		MemberDTOEX memb1 = new MemberDTOEX();
		
		Scanner input = new Scanner(System.in);
		
		while(true) {
			System.out.println("회원가입 하시겠습니까?");
			String ans = input.next();
			if(ans.equals("no")) {
				System.out.println("가입창을 닫습니다.");
				break;
			}else if(ans.equals("yes")){
				System.out.println("\n회원 정보 입력");
				
				System.out.print("아이디 : ");
				memb1.setUserID(input.next());
				//String id = memb1.getUserID();
				
				System.out.print("비밀번호 : ");
				memb1.setUserPW(input.next());
				//String pw = memb1.getUserPW();
				
				System.out.print("나이 : ");
				memb1.setAge(input.nextInt());
				//int age = memb1.getAge();
				
				System.out.println("\n가입 완료!\n가입정보 확인\n");
				
				System.out.println("아이디 : " + memb1.getUserID()); //간단하게 하는 방법
				System.out.println("비밀번호 : " + memb1.getUserPW());
				System.out.println("나이 : " + memb1.getAge());
				break;
			}else {
				System.out.println("입력 오류. yes or no로 입력해주세요.\n");
			}
			
		}
		
		input.close();
		
		
	}

}
