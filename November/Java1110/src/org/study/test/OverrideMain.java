package org.study.test;

import java.util.Scanner;

public class OverrideMain {
	
	public static void main(String[] args) {
		
//		ActionQueryInsert insert = new ActionQueryInsert();
//		insert.excuteQuery();
//		
//		ActionQueryUpdate update = new ActionQueryUpdate();
//		update.excuteQuery();
//		
//		ActionQueryDelete delete = new ActionQueryDelete();
//		delete.excuteQuery();
//		
//		ActionQuerySelect select = new ActionQuerySelect();
//		select.excuteQuery();
		
//		OverrideBasic action = new ActionQueryInsert();
//		action.excuteQuery();
//		
//		action = new ActionQueryDelete();
//		action.excuteQuery();
//		
//		action = new ActionQueryUpdate();
//		action.excuteQuery();
//		
//		action = new ActionQuerySelect();
//		action.excuteQuery();
		
		OverrideBasic action = null;
		String query = "";
		
		System.out.println("쿼리문을 입력하세요");
		
		Scanner input = new Scanner(System.in);
		query = input.next();
		
		if(query.equals("insert")){
			action = new ActionQueryInsert();
			action.excuteQuery();
		}else if(query.equals("delete")) {
			action = new ActionQueryDelete();
			action.excuteQuery();
		}else if(query.equals("update")) {
			action = new ActionQueryUpdate();
			action.excuteQuery();
		}else if(query.equals("select")) {
			action = new ActionQuerySelect();
			action.excuteQuery();
		}else {
			System.out.println("입력 오류");
		}
		input.close();
	}

}
