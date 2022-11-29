package org.study.gui;

import java.awt.Button;
import java.awt.Dialog;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class JMenu02 extends JFrame implements ActionListener {
	
	JPanel jPanel; //메뉴바가 담길 패널
	JMenuBar jMenuB; //메뉴바
	JMenu jMenu1, jMenu2; //메뉴1,2
	JMenuItem jMenuI1, jMenuI2, jMenuI3, exit, jMenuI4, jMenuI5; //메뉴에 담길 아이템
	
	public JMenu02() {
		super("JMenu02 메뉴바");
		
		JMenuBar jMenuB = new JMenuBar(); //이걸 setMenuBar보다 위에 선언해줘야함
		
		setJMenuBar(jMenuB); //1.메뉴바를 추가
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		jMenu1 = new JMenu("파일"); //메뉴1
		jMenu2 = new JMenu("도움말"); //메뉴2
		
		jMenuI1 = new JMenuItem("새 창(e)"); //메뉴1에 들어갈 아이템
		jMenuI2 = new JMenuItem("메뉴1(e)");
		jMenuI3 = new JMenuItem("메뉴3");
		jMenuI4 = new JMenuItem("메뉴4");
		jMenuI5 = new JMenuItem("메뉴5");
		exit = new JMenuItem("닫기(e)"); //메뉴2에 들어갈 아이템
		
		//2.메뉴에 메뉴 아이템들 추가
		jMenu1.add(jMenuI1);
		jMenu1.add(jMenuI2);
		jMenu1.add(jMenuI3);
		jMenu1.add(jMenuI4);
		jMenu1.add(jMenuI5);
		jMenu2.add(exit);
		
		//3.메뉴바에 메뉴1, 메뉴2 추가
		jMenuB.add(jMenu1);
		jMenuB.add(jMenu2);
		
		setSize(400, 300); //컨테이너 크기 설정
		setVisible(true); //보이게하기
		
		//안드로이드 app에서 이벤트 구현할 때 사용됨
		//이벤트 구현1 -> 익명클래스
		jMenuI4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("익명클래스를 이용한 이벤트 구현");
			}
		});
		
		//이벤트 구현2 -> 람다식
		jMenuI5.addActionListener((ActionEvent e)->{
			System.out.println("람다식을 이용한 이벤트 구현");
		});
		
		//이벤트 구현 -> 동시구현 방법
		jMenuI1.addActionListener(this);
		jMenuI2.addActionListener(this);
		exit.addActionListener(this);
		
	}
	//e -> 이벤트 실제 target
	@Override
	public void actionPerformed(ActionEvent e) {
		//이벤트 target 구별
		
		if(e.getSource()==exit) {
			System.out.println("종료합니다");
			System.exit(0);
		}else if(e.getSource()==jMenuI1) {
			System.out.println("새 창(e) 선택");
			newWindow(); //새 창 띄우기 메서드
		}else if(e.getSource()==jMenuI2) {
			System.out.println("메뉴1(e) 선택");
		}
	}
	
	private void newWindow() {
		//컨테이너 JFrame, JPanel
		//JFrame: 윈도우(전체?)
		//JPanel: 그룹핑된?
		Dialog dialog = new Dialog(this, "새 창 열기");
		JPanel jPanel = new JPanel();
		Button btn = new Button("close");
		
		dialog.setLayout(new FlowLayout(FlowLayout.CENTER, 200,100));
		
		btn.setSize(100, 100);
		
		jPanel.add(btn);
		dialog.add(jPanel);
		
		dialog.setSize(300, 200);
		dialog.setVisible(true);
		
		//btn을 클릭하면 dialog가 보이지 않게 이벤트를 구현(윗 부분 이벤트 구현 예시 참고하기)
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("창 닫기");
				dialog.setVisible(false);
			}
		});
		
	}
	
	public static void main(String[] args) {
		
		new JMenu02();
		
	}

}
