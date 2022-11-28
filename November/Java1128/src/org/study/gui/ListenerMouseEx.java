package org.study.gui;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;

class MyMouseListener implements MouseListener{

	@Override
	public void mouseClicked(MouseEvent e) {
		//눌렀다 뗐을 때**********
		JButton btn = (JButton) e.getSource();
		btn.setBackground(Color.GREEN);
	}

	@Override
	public void mousePressed(MouseEvent e) {
		//마우스를 누르고 있을 때
		JButton btn = (JButton) e.getSource();
		btn.setBackground(Color.BLACK);
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		//누르고 있다가 뗐을 때
		JButton btn = (JButton) e.getSource();
		btn.setBackground(Color.ORANGE);
	}

	@Override
	public void mouseEntered(MouseEvent e) { //e->실제 이벤트 적용 타겟
		//마우스가 버튼에 올라올 때 호출
		JButton btn = (JButton) e.getSource();
		//마우스가 올라간 버튼의 주소를 알아낸다
		btn.setBackground(Color.RED);
		//버튼의 배경색을 빨간색으로 변경
	}

	@Override
	public void mouseExited(MouseEvent e) {
		//마우스가 버튼에서 내려갈 때 호출
		JButton btn = (JButton) e.getSource();
		//마우스가 올라간 버튼의 주소를 알아낸다
		btn.setBackground(Color.WHITE);
		//버튼의 배경색을 흰색으로 변경
	}
	
}

public class ListenerMouseEx extends JFrame{
	
	ListenerMouseEx() {
		setTitle("ListnerMouseEx");
		setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//버튼 컴포넌트를 생성하고 마우스리스너를 단다
		JButton btn = new JButton("Mouse test");
//		this.add(new JButton("BTN1"));
		btn.setBackground(Color.PINK);
		
		MyMouseListener listener = new MyMouseListener();
		btn.addMouseListener(listener); //버튼 마우스 리스너를 단다
		
		add(btn);
		setSize(300, 150);
		setVisible(true);
	
	}
	
	public static void main(String[] args) {
		new ListenerMouseEx();
	}

}
