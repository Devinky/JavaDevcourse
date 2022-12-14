package org.study.innerclass;

public class DAO {
	//싱글톤 패턴
	//생성자 private
	private DAO() {
		System.out.println("DAO");
	}
	
	private static class InnerClass{
		//인스턴스 한번만 생성
		private static final DAO INSTANCE = new DAO();
	}
	
	public static DAO getInstance() {
		return InnerClass.INSTANCE;
	}
	
	public void insert() {}
	public void select() {}
	public void update() {}
	public void delete() {}

}
