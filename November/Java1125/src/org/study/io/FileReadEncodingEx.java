package org.study.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

public class FileReadEncodingEx {
	
	public static void main(String[] args) {
		
		System.out.println("Encoding");
		
		FileInputStream fIn = null;
		InputStreamReader inReader = null;
		String fileurl = "E:\\ioex2\\test5.txt";
		
		try {
			fIn = new FileInputStream(fileurl);
//			inReader = new InputStreamReader(fIn, "MS949"); //문자열 인코딩
			inReader = new InputStreamReader(fIn, "UTF-8");
			
			int inData  = 0;
			while((inData=inReader.read())!= -1) {
				System.out.print((char)inData);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fIn.close();
				inReader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
	}
	
}
