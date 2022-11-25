package org.study.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class IoEx {
	
	public static void main(String[] args) {
		
		String fileurl = "E:\\ioex2\\test3.txt";
		//1.file객체 생성 -> 2.파일경로 추가
		File file = new File(fileurl);
		
		FileReader fReader = null;
		
		//3.파일 가져오기(Reader->텍스트)
		try {
			fReader = new FileReader(file);
			//4.파일텍스트를 읽는다
			int inData = 0;
			while((inData = fReader.read()) != -1){
				//5.콘솔에 출력
				System.out.print((char)inData);
			}
			
		} catch (FileNotFoundException e) {
			//파일 유무 예외처리
			e.printStackTrace();
		} catch (IOException e) {
			//입출력 예외처리
			e.printStackTrace();
		}finally {
			try {
				fReader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
	}

}
