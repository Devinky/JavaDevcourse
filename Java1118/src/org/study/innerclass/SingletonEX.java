package org.study.innerclass;

public class SingletonEX {
	public static void main(String[] args) {
		
//		new DAO();
//		new DAO();
		
		//싱글톤 -> 객체를 한번만 생성
		DAO dao = DAO.getInstance();
		
		dao.insert();
		dao.select();
		dao.update();
		dao.delete();
	}
}
