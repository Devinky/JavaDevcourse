package org.study.collection;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListEX {
	
	public static void main(String[] args) {
		
//		ArrayList<Integer> arr = new ArrayList<>();
//		
//		arr.add(new Integer(10)); //원래는 이런 형태로 씀
//		arr.add(20); //자동박싱(객체를 생성하지 않아도 자동으로 객체형이 됨)
//		arr.add(30);
//		arr.add(40);
//		arr.add(50);
//		
//		for(Integer i: arr) {
//			System.out.println(i);
//		}
		
		ArrayList<MemberDto2> users = new ArrayList<MemberDto2>();
		
		Scanner input = new Scanner(System.in);
		
		users.add(new MemberDto2("m1111", "1@email", "01011111111", 10));
		users.add(new MemberDto2("m2222", "2@email", "01022222222", 20));
		users.add(new MemberDto2("m3333", "3@email", "01033333333", 30));
		users.add(new MemberDto2("m4444", "4@email", "01044444444", 40));
		users.add(new MemberDto2("m5555", "5@email", "01055555555", 50));
		
		boolean bool1 = false;
		int idx = 0;
		
//		while(!bool1) {
//			while(true) {
//				if(idx>=5) {
//					System.out.println(idx);
//					System.out.println("회원가입 종료");
//					bool1 = true;
//					break;
//				}else {
//					System.out.println("\n회원가입 실행\n");
//					
//					System.out.print("아이디 입력 : ");
//					String userId = input.next();
//					System.out.print("이메일 입력 : ");
//					String email = input.next();
//					System.out.print("전화번호 입력 : ");
//					String phone = input.next();
//					System.out.print("나이 입력 : ");
//					int age = input.nextInt();
//					
//					users.add(new MemberDto2(userId, email, phone, age));
//					
//					System.out.println("\n전체 회원 목록\n");
//					
//					for(MemberDto2 user: users) {
//						System.out.print("아이디 : " + user.getUserId()+" ");
//						System.out.print("이메일 : " + user.getEmail()+" ");
//						System.out.print("전화번호 : " + user.getPhone()+" ");
//						System.out.print("나이 : " + user.getAge());
//					}				
//				}								
//				idx++;
//			}
//		}
		
		boolean bool2 = false;
		
		while(!bool2) {
			
			System.out.println("로그인 실행");
			
			System.out.print("아이디 입력 : ");
			String userId = input.next();
			
			System.out.print("이메일 입력 : ");
			String userEmail = input.next();
			
			for(MemberDto2 user: users) {
				String id = user.getUserId();
				String email = user.getEmail();
				
				System.out.print(id + " " + email + " ");
				
				if(id.equals(userId) && email.equals(userEmail)) {
					System.out.println("로그인 성공");
					bool2 = true;
					break;
				}else {
					System.out.println("로그인 실패");
				}
			}				
			
			//break;
			
			
		}
		
		
		
		
		

	}

}
