package org.study.collection;

import java.util.ArrayList;
import java.util.Scanner;

public class MemberDto2Controller {
	
	public static void main(String[] args) {
		
		ArrayList<MemberDto2> users = new ArrayList<>();
		Scanner input = new Scanner(System.in);
		
		boolean bool1 = false;
		int idx = 0;
		
		while(!bool1) {
			if(idx>=5) {
				System.out.println("\n" + idx + "명의 회원을 받고 가입을 종료합니다.");
				System.out.println("회원가입 종료\n");
				bool1 = true;
				break;
			}else {
				System.out.println("\nuserNo." + (idx+1));
				System.out.println("회원가입 실행\n");
				
				System.out.print("아이디 입력 : ");
				String userId = input.next();
				
				System.out.print("이메일 입력 : ");
				String email = input.next();
				
				System.out.print("전화번호 입력 : ");
				String phone = input.next();
				
				System.out.print("나이 입력 : ");
				int age = input.nextInt();
				
				users.add(new MemberDto2(userId, email, phone, age));
				
				System.out.println("\n전체 회원 목록");
				
				for(MemberDto2 user: users) {
					System.out.print("아이디 : " + user.getUserId() + " ");
					System.out.print("이메일 : " + user.getEmail() + " ");
					System.out.print("전화번호 : " + user.getPhone() + " ");
					System.out.println("나이 : " + user.getAge() + " ");
				}
			}
			idx++;
		}
		
		boolean bool2 = false;
		
		while(!bool2) {
			System.out.println("로그인 실행");
			System.out.print("아이디 입력 : ");
			String userId2 = input.next();
			
			System.out.print("이메일 입력 : ");
			String email2 = input.next();
			
			for(MemberDto2 user: users) {
				String id = user.getUserId();
				String email = user.getEmail();
				
				if(id.equals(userId2)&&email.equals(email2)) {
					System.out.println("id : " + id + " " + "email : " + email);
					System.out.println("로그인 성공");
					bool2 = true;
					break;
				}else if(!id.equals(userId2)&&email.equals(email2)) {
					System.out.println("로그인 실패! 다시 로그인 해주세요");
				}
			}
			break;
		}
		input.close();
	}

}
