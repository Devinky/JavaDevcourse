package org.study.gui;

import java.awt.Color;

import javax.swing.JFrame;

public class SwingEx01 extends JFrame{
	
	public SwingEx01() {
		setTitle("SwingEx Title");
		setSize(300,300);
		setBackground(Color.green);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		
		new SwingEx01();
		
	}

}
