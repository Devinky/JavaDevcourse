package org.study.gui;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class AbsolutePaneEx extends JFrame{
	
	public AbsolutePaneEx() {
		this.setTitle("AbsolutePaneEx"); //this생략가능
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		
		JButton btn1 = new JButton("BTN1");
		JButton btn2 = new JButton("BTN2");
		JButton btn3 = new JButton("BTN3");
		JButton btn4 = new JButton("BTN4");
		JButton btn5 = new JButton("BTN5");
		
		btn1.setSize(150, 50);
		btn1.setLocation(0, 0);
		btn1.setBackground(Color.WHITE);
		
		btn2.setSize(150, 50);
		btn2.setLocation(450, 0);
		btn2.setBackground(Color.GRAY);
		
		btn3.setSize(150, 50);
		btn3.setLocation(0, 511);
		btn3.setBackground(Color.ORANGE);
		
		btn4.setSize(150, 50);
		btn4.setLocation(450, 511);
		btn4.setBackground(Color.GREEN);
		
//		btn5.setSize(150, 50);
//		btn5.setLocation(0, 512);
//		btn5.setBackground(Color.ORANGE);
		
		
		panel.add(btn1);
		panel.add(btn2);
		panel.add(btn3);
		panel.add(btn4);
//		panel.add(btn5);
		
		//Object, JFrame클래스의 요소들 사용 가능
		this.add(panel);
		this.setSize(600, 600);
		this.setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new AbsolutePaneEx();
	}

}
