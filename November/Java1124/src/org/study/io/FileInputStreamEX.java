package org.study.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamEX {
	
	public static void main(String[] args) {
		
		FileInputStream inFile = null;
		
		try {
			inFile = new FileInputStream("C:\\Windows\\system.ini");
			
			int inData;
				//입력된 inFile의 끝(-1)까지  입력 -> 한글자씩
			while((inData = inFile.read())!=-1) {
				System.out.print((char)inData);
			}
		} catch (FileNotFoundException e) {
			System.out.println("파일 예외");
			e.printStackTrace();
		} catch(IOException e){
			System.out.println("입출력 예외");
			e.printStackTrace();
		} finally {
			try {
				inFile.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}

		
		
		
		
		
//		FileInputStream inFile = null;
//		
//		try {
//			
//			inFile = new FileInputStream(‪"C:\\Windows\\system.ini");
//			
//			int inData;
//				//입력된 inFile의 끝(-1)까지  입력 -> 한글자씩
//			while((inData = inFile.read())!=-1) {
//				System.out.print((char)inData);
//			}
//		}catch(FileNotFoundException e) {
//			System.out.println("파일 예외");
//			e.printStackTrace();
//		}catch(IOException e) {
//			System.out.println("입출력 예외");
//			e.printStackTrace();
//		}finally {
//			try {
//				inFile.close();
//			}catch(IOException e) {
//				e.printStackTrace();
//			}
//		}
			
		
	}

}
