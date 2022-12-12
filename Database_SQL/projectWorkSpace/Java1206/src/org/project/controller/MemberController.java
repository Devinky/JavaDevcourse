package org.project.controller;

import java.util.Scanner;

import org.project.commend.MemberCommend;
import org.project.commend.MemberDeleteDo;
import org.project.commend.MemberInsertDo;
import org.project.commend.MemberSelectAge;
import org.project.commend.MemberSelectDo;
import org.project.commend.MemberUpdateDo;

public class MemberController {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		MemberCommend commend = null;
		
		while(true) {
			System.out.print("\n회원가입(insert)\n회원정보 수정(update)\n회원목록 조회(select)\n회원탈퇴(delete)\n"
					+ "조건에 맞는 회원 검색(selectAge)\n: ");
			String query = input.next();
			
			if(query.equals("insert")) {
				commend = new MemberInsertDo();
				commend.excuteQueryCommend();
			}else if(query.equals("update")) {
				commend = new MemberUpdateDo();
				commend.excuteQueryCommend();
			}else if(query.equals("select")) {
				commend = new MemberSelectDo();
				commend.excuteQueryCommend();
			}else if(query.equals("delete")) {
				commend = new MemberDeleteDo();
				commend.excuteQueryCommend();
			}else if(query.equals("selectAge")){
				commend = new MemberSelectAge();
				commend.excuteQueryCommend();
			}
			else if(query.equals("exit")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}else {
				System.out.println("명령문 입력 오류. 다시 입력하세요.");
			}
		}
	}
}
