package org.study.basicPackage;

import java.util.Scanner;

public class StringEX03 {
	
	public static void main(String[] args) {
		System.out.println("String");
		
		String str1 ="Java 2022 Project";
		System.out.println(str1.length());
		String str2 = str1.substring(5);
		
		System.out.println(str1);
		System.out.println(str2);
		
		//substring(시작번지, 끝번지) 문자열을 시작번지부터 끝번지 앞까지 추출
		System.out.println(str1.substring(5, 9)); //파이썬 인덱스 슬라이드랑 똑같음
		
		// .do를 제외한 문자열 추출 -> 하나의 메서드 substring()
		String query1 = "/insert.do";
		String query2 = "/select.do";
		String query3 = "/update.do";
		String query4 = "/delete.do";
		
		Scanner input = new Scanner(System.in);
		System.out.print("프로그램을 실행하시겠습니까? ");
		String url = input.next();
		
		while(true) {
			
			
			if(url.equals(".do")) {
				System.out.print("url을 입력하세요 ");
				String query = input.next();
				
				//끝자리 세 자리를 .do로 입력을 받고 .do를 제외하고 문자열의 값이
				// /insert면 회원가입 실행
				// /select면 회원조회 실행
				// /update면 회원수정 실행
				// /delete면 회원탈퇴 실행
				// /exit -> 종료
				// 나머지를 입력하면 URI를 확인해주세요
				
				//String query = query1.substring(0, query1.length()-3);
				
				if(query.equals("/insert")) {
					System.out.println("회원가입 실행");
				}else if(query.equals("/select")) {
					System.out.println("회원조회 실행");
				}else if(query.equals("update")) {
					System.out.println("회원수정 실행");
				}else if(query.equals("delete")) {
					System.out.println("회원탈퇴 실행");
				}else if(query.equals("exit")) {
					System.out.println("종료");
				}
				
			}else if(url.equals("exit")){
				System.out.println("종료");
				break;
			}else {
				System.out.println("입력값 오류");
				break;
			}
			input.close();
		}
				
//		System.out.println(query1.substring(0, query1.length()-3));
//		System.out.println(query2.substring(0, query2.length()-3));
//		System.out.println(query3.substring(0, query3.length()-3));
//		System.out.println(query4.substring(0, query4.length()-3));				
	}

}
