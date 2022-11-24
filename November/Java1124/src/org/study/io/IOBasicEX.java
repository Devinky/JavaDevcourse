package org.study.io;

import java.io.IOException;
import java.io.InputStream;

public class IOBasicEX {
	
	public static void main(String[] args) {
		
		System.out.println("IO");
		
		InputStream inputStream = System.in;
		
		try {
			int inData = inputStream.read(); //byte -> int
			System.out.println("출력문자 : " + (inData));
			System.out.println("출력문자 : " + (char)inData); //int->char 형변환
			
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				inputStream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}
