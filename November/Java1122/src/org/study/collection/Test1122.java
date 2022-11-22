package org.study.collection;

class G1<T>{
	T t1;
	T m1(T t2) {
		return t2;
	}
}

public class Test1122 {
	
	public static void main(String[] args) {
		G1<String> g1 = new G1<String>();
		g1.t1 = "스트링타입";
		String m1 = g1.m1("이건 메서드인가");
		
		System.out.println(m1);
		
		G1<Integer> g2 = new G1<Integer>();
		g2.t1 = 10; //기본타입 -> 객체형타입 : 자동 박싱
		Integer m2 = g2.m1(20);
		int m3 = g2.m1(new Integer(40)).intValue(); //언박싱
		int m4 = g2.m1(50); //객체형타입 -> 기본형타입 : 자동 언박싱
		
		
		System.out.println(m2);
		
		MemberDto user1 = new MemberDto("m1111","1111","s11",11);
		MemberDto user2 = new MemberDto("m2222","2111","s21",21);
		MemberDto user3 = new MemberDto("m3333","3111","s31",31);
		MemberDto user4 = new MemberDto("m4444","4111","s41",41);
		MemberDto user5 = new MemberDto("m5555","5111","s51",51);
		
		//객체 user1
		System.out.println("user1");
		System.out.println("아이디 : " + user1.getUserId());
		System.out.println("비밀번호 : " + user1.getUserPw());
		System.out.println("이름 : " + user1.getUserName());
		System.out.println("나이 : " + user1.getAge());

		//객체 user2
		System.out.println("\nuser2");
		System.out.println("아이디 : " + user2.getUserId());
		System.out.println("비밀번호 : " + user2.getUserPw());
		System.out.println("이름 : " + user2.getUserName());
		System.out.println("나이 : " + user2.getAge());

		//객체 user3
		System.out.println("\nuser3");
		System.out.println("아이디 : " + user3.getUserId());
		System.out.println("비밀번호 : " + user3.getUserPw());
		System.out.println("이름 : " + user3.getUserName());
		System.out.println("나이 : " + user3.getAge());

		//객체 user4
		System.out.println("\nuser4");
		System.out.println("아이디 : " + user4.getUserId());
		System.out.println("비밀번호 : " + user4.getUserPw());
		System.out.println("이름 : " + user4.getUserName());
		System.out.println("나이 : " + user4.getAge());
		
		//객체 user5
		System.out.println("\nuser5");
		System.out.println("아이디 : " + user5.getUserId());
		System.out.println("비밀번호 : " + user5.getUserPw());
		System.out.println("이름 : " + user5.getUserName());
		System.out.println("나이 : " + user5.getAge());
		

	}

}
