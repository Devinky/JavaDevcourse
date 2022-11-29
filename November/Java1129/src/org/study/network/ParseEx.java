package org.study.network;

import java.net.MalformedURLException;
import java.net.URL;

public class ParseEx {
	public static void main(String[] args) {
		URL opinion = null;
		URL join = null;
		
		try {
//			join = new URL("http://192.168.23.211:8092/springMVC1206/join"); //절대경로로 URL객체 생성
			//기본 서버의 path경로
			join = new URL("http://192.168.23.211:8092/springMVC1206/"); 
			opinion = new URL(join, "join"); //상대 경로로 URL객체 생성
		} catch(MalformedURLException e) {
			System.out.println("잘못된 URL입니다");
			e.printStackTrace();
		}
		
		System.out.println("protocol = " + opinion.getProtocol()); //프로토콜
		System.out.println("host = " + opinion.getHost());
		System.out.println("port = " + opinion.getPort());
		System.out.println("basicPath: " + join);
		System.out.println("path = " + join.getPath());
		System.out.println("filename = " + opinion.getFile());
//		System.out.println("protocol = " + join.getProtocol()); //프로토콜
//		System.out.println("host = " + join.getHost());
//		System.out.println("port = " + join.getPort());
//		System.out.println("path = " + join.getPath());
//		System.out.println("filename = " + join.getFile());
		                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                
	}
}
