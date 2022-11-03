package org.study.loopEX;

import java.util.Scanner;

public class whileEX06 {
	
	public static void main(String[] args) {
		System.out.println("while문으로 로그인 프로그램 만들기");
		//while(true)를 이용해서 아이디와 비밀번호가 일치하면 while문을 종료
		//아이디와 비밀번호가 일치하지 않으면 로그인 실패를 콘솔에 출력하고 다시 입력받기
		//로그인을 성공하면 while문을 종료
		//while, if, break, Scanner 이용
		
		Scanner input = new Scanner(System.in);
		
		String dbID = "root";
		String dbPW = "1111";
		
		while(true) {
			System.out.print("아이디를 입력하세요 : ");
			String id = input.nextLine();
			
			System.out.print("비밀번호를 입력하세요 : ");
			String pw = input.nextLine();
			
			if(id.equals(dbID) && pw.equals(dbPW)) {
				System.out.println("로그인 성공!");
				break;			
			}else {
				System.out.println("로그인 실패. 아이디와 비밀번호를 확인해주세요.");
			}
		}
		
		input.close();
		
	}

}
