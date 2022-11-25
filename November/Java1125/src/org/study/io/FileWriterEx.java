package org.study.io;

import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileWriterEx {
	
	public static void main(String[] args) {
		
		System.out.println("FileWriterEx");
		
		//1.콘솔에 입력
		InputStreamReader inReader = new InputStreamReader(System.in);
		//2.file 생성 -> 텍스트
		FileWriter fWriter = null;
		//3.생성될 파일 URL
		String fileurl = "E:\\ioex2\\test5.txt";
		
		try {
			//4.file text4.txt 생성
			fWriter = new FileWriter(fileurl);
			int inData = 0;
			//5.콘솔에 입력한 데이터를 저장 -> ctrl z가 입력될 때까지
			while((inData=inReader.read()) != -1) {
				//6.fWriter에 저장(한 글자씩)
				fWriter.write(inData);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				inReader.close();
				fWriter.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}
