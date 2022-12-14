package org.study.basicPackage;

import java.util.StringTokenizer;

public class StringTokenizerEX01 {
	
	public static void main(String[] args) {
		
		String ur1 = "userID=devinky&userPW=1111&userName=Inky";
		StringTokenizer token = new StringTokenizer(ur1,"&");
		System.out.println("토큰의 갯수 : " + token.countTokens());
		
		//토큰이 있으면 while실행
		while(token.hasMoreTokens()) {
			String ntoken = token.nextToken(); //다음 토큰이 있으면
			System.out.println(ntoken);
		}
		
		System.out.println("==================================");
		
		//StringTokenizer를 이용해서 -구분기호를 콘솔에 출력
		String phone = "010-1234-5678";
		StringTokenizer token2 = new StringTokenizer(phone,"-");
		System.out.println("토큰의 갯수 : " + token2.countTokens());
		
		while(token2.hasMoreTokens()) {
			String ntoken = token2.nextToken();
			System.out.println(ntoken);
		}
	}

}
