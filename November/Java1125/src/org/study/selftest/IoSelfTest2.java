package org.study.selftest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class IoSelfTest2 {
	
	public static void main(String[] args) {
		
		//Map을 활용해서 특정 단어를 입력하면 값을 출력하도록 하기(가능?!)
		
		Map<String,	String> map = new HashMap<String, String>();
		
		map.put("학원에 가면", "수업을 듣는다");
		map.put("집에 가면", "쉰다");
		map.put("나는", "사람이다");
		map.put("오리는", "꽥꽥");
		map.put("고양이는", "애옹");
		map.put("병아리는", "삐약");
		
//		Set<String> key = map.keySet();
		
//		System.out.println(map.get("집에 가면"));
//		System.out.println(map.values());

		InputStreamReader st1 = null;

		try {
			System.out.println("학원에 가면? 집에 가면? 나는? 오리는? 고양이는? 병아리는?");
			st1 = new InputStreamReader(System.in);
			BufferedReader buf = new BufferedReader(st1);
			String insult = buf.readLine();
			
			System.out.println(map.get(insult));
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
	}

}
