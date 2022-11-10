package org.study.test;

public class OverrideMain {
	
	public static void main(String[] args) {
		
		ActionQueryInsert insert = new ActionQueryInsert();
		insert.excuteQuery();
		
		ActionQueryUpdate update = new ActionQueryUpdate();
		update.excuteQuery();
		
		ActionQueryDelete delete = new ActionQueryDelete();
		delete.excuteQuery();
		
		ActionQuerySelect select = new ActionQuerySelect();
		select.excuteQuery();
		
	}

}
