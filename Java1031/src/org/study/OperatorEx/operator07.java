package org.study.OperatorEx;

public class operator07 {
	
	public static void main(String[] args) {
		
		System.out.println("조건연산자");
		
		System.out.println("&&");
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(false && true);
		System.out.println(false && false);
		
		System.out.println("||");
		System.out.println(true || true);
		System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);
		
		System.out.println("^");
		System.out.println(true ^ true);
		System.out.println(true ^ false);
		System.out.println(false ^ true);
		System.out.println(false ^ false);
		
		
		String userID = "m1234";
		String userPW = "1111";
		
		System.out.println("==========로그인==========");
		System.out.println(userID.equals("m1234"));
		System.out.println(userPW.equals("1111"));
		
		System.out.println("========로그인 boolean========");
		boolean boo1 = userID.equals("m1234");
		boolean boo2 = userPW.equals("1111");
		
		System.out.println(boo1 && boo2);	
		
		System.out.println(boo1 || boo2);
		System.out.println(!boo1 || boo2);
		System.out.println(boo1 || !boo2);
		System.out.println(!boo1 || !boo2);
		
		}

	}

