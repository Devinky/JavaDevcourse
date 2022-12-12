package org.project.controller;

import java.util.Scanner;

import org.project.commend.MemberCommend;
import org.project.commend.MemberDeleteDo;
import org.project.commend.MemberInsertDo;
import org.project.commend.MemberSelectAgeDo;
import org.project.commend.MemberSelectDo;
import org.project.commend.MemberSerchIdDo;

public class MemberController {
	
	public static void main(String[] args) {
		
		MemberCommend commend = null;
		
		while(true) {
			Scanner input =  new Scanner(System.in);
			System.out.print("회원가입(insert)\n회원정보수정(update)\n회원목록조회(select)\n"
					+ "회원탈퇴(delete)\n회원조건검색(selectAge)\n: ");
			String query = input.next();
			if(query.equals("insert")) {
				commend = new MemberInsertDo();
				commend.excuteQueryCommend();
			}else if(query.equals("select")){
				commend = new MemberSelectDo();
				commend.excuteQueryCommend();
			}else if(query.equals("update")) {
				commend = new MemberSelectDo();
				commend.excuteQueryCommend();
			}else if(query.equals("selectAge")) {
				commend = new MemberSelectAgeDo();
				commend.excuteQueryCommend();
			}else if(query.equals("delete")) {
				commend = new MemberDeleteDo();
				commend.excuteQueryCommend();
			}else if(query.equals("searchId")) {
				commend = new MemberSerchIdDo();
				
			}else if(query.equals("exit")) {
				System.out.println("통합 회원 프로그램을 종료합니다.");
				break;
			}else {
				System.out.println("입력 오류. 다시 입력해주세요.");
			}
		}
		
	}
	
}
