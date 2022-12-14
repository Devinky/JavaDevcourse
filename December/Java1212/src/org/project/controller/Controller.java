package org.project.controller;

import java.util.Scanner;

import org.project.commend.BoardSelect;
import org.project.commend.BoardWrite;
import org.project.commend.ExecuteCommend;
import org.project.commend.LoginOkDo;
import org.project.commend.MemberDeleteDo;
import org.project.commend.MemberInsertDo;
import org.project.commend.MemberSelectDo;
import org.project.commend.MemberUpdateDo;
import org.project.commend.boardListDo;

public class Controller {
	
	public static void main(String[] args) {
		
		ExecuteCommend commend = null;
		
		while(true) {
			Scanner input =  new Scanner(System.in);
			System.out.print("\n무엇을 실행할까요? ");
			String query = input.next();
			if(query.equals("member_insert")) {
				commend = new MemberInsertDo();
				commend.executeQueryCommend();
			}else if(query.equals("member_select")){
				commend = new MemberSelectDo();
				commend.executeQueryCommend();
			}else if(query.equals("member_update")) {
				commend = new MemberUpdateDo();
				commend.executeQueryCommend();
			}else if(query.equals("member_delete")) {
				commend = new MemberDeleteDo();
				commend.executeQueryCommend();
			}else if(query.equals("login")){
				commend = new LoginOkDo();
				commend.executeQueryCommend();
			}else if(query.equals("board_write")) {
				commend = new BoardWrite();
				commend.executeQueryCommend();
			}else if(query.equals("board_select")) {
				commend = new BoardSelect();
				commend.executeQueryCommend();
			}else if(query.equals("board_list")) {
				commend = new boardListDo();
				commend.executeQueryCommend();
			}
			else if(query.equals("exit")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}else {
				System.out.println("입력 오류. 다시 입력해주세요.");
			}
		}
		
	}

}
