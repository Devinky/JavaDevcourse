package org.study.jdbc;

import java.util.ArrayList;
import java.util.List;


class User{
	
	private String userId;
	private String userPw;
	private int age;
	
	public User(String userId, String userPw, int age) {
		super();
		this.userId = userId;
		this.userPw = userPw;
		this.age = age;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserPw() {
		return userPw;
	}

	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
}


public class Test1202 {
	
	public static void main(String[] args) {

		List<User> users = new ArrayList<User>();
		
		users.add(new User("m1", "1234", 21)); //-> 생성자로 집어넣는다
		users.add(new User("m2", "2234", 22));
		users.add(new User("m3", "3234", 23));
		users.add(new User("m4", "4234", 24));
		users.add(new User("m5", "5234", 25));
		
		for(User us: users) {
			System.out.println("아이디 : " + us.getUserId() + " / 비밀번호 : " + us.getUserPw() + " / 나이 : "+us.getAge());
		}
		
		
		//컬렉션 복습
	
//		List<Integer> lists1 = new ArrayList<Integer>();
//		ArrayList<Integer> lists2 = new ArrayList<Integer>();
//		
//		lists1.add(new Integer(10));
//		lists1.add(new Integer(20));
//		lists1.add(new Integer(30));
//		lists1.add(new Integer(40));
//		lists1.add(new Integer(50));
//		
//		System.out.println(lists1.get(0));
//		System.out.println(lists1.get(1));
//		System.out.println(lists1.get(2));
//		System.out.println(lists1.get(3));
//		System.out.println(lists1.get(4));
//		
//		//for문->횟수가 절해져있는 반복에 사용함
//		for(int i=0;i<lists1.size();i++) {
//			System.out.print(lists1.get(i) + " ");
//		}
//		System.out.println("");
//		
//		//foreach문
//		for(Integer list: lists1) {
//			System.out.print(list + " ");
//		}
		
	}

}
