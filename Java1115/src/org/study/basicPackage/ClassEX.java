package org.study.basicPackage;

public class ClassEX {
	
	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.drivet.OracleDriver");
			System.out.println("Oracle연동 OK");
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("Orecla연동 fail");;
		}
	}

}
