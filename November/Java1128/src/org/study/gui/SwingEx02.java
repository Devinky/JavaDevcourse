package org.study.gui;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SwingEx02 extends JFrame{
	
	public SwingEx02() {
		setTitle("Swing Ex02");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //메인프레임 종료시 모두 종료
		//container생성
		Container conPane = getContentPane();
		conPane.setBackground(Color.GREEN);
		conPane.setLayout(new FlowLayout()); //레이아웃 설정->컴포넌트 배치 기준
		conPane.add(new JButton("OK"));
		conPane.add(new JButton("CANCLE"));
		conPane.add(new JButton("GO"));
		conPane.add(new JButton("1"));
		conPane.add(new JButton("2"));
		conPane.add(new JButton("3"));
		
		setSize(300,300); //프레임 크기 300x200 설정
		setVisible(true); //프레임을 화면에 출력
	}
	
	public static void main(String[] args) {
		new SwingEx02(); //자기클래스를 호출
	}

}
