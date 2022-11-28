package org.study.gui;

import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class GridLayoutEx extends JFrame{
	
	public GridLayoutEx() {
		setTitle("GridLayout Title");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//4x2격자의 GridLayout 배치관리자 생성
		GridLayout grid = new GridLayout(4, 2);
		
		grid.setVgap(5); //격자 사이의 간격 설정
		setLayout(grid);
		
		add(new JLabel(" 이름"));
		add(new JTextField(""));
		add(new JLabel(" 학번"));
		add(new JTextField(""));
		add(new JLabel(" 학과"));
		add(new JTextField(""));
		add(new JLabel(" 과목"));
		add(new JTextField(""));
		setSize(300,200);
		setVisible(true);
	}

	public static void main(String[] args) {
		
		new GridLayoutEx();
		
	}
}
