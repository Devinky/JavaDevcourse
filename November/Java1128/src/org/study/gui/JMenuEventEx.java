package org.study.gui;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class JMenuEventEx extends JFrame implements ActionListener{

	JMenuBar jMenuB;
	JMenu jMenu;
	JMenuItem jMe_01, jMe_02;
	Button btn;
	
	public JMenuEventEx() {
		super("JmenuEventEx");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.getContentPane().setLayout(new FlowLayout(FlowLayout.LEFT));
		
		jMenuB = new JMenuBar(); //MenuBar생성
		jMenu = new JMenu("Menu"); //JMenu생성
		jMe_01 = new JMenuItem("메뉴1"); //아이템생성
		jMe_02 = new JMenuItem("메뉴2"); //아이템생성
		btn = new Button("Button");
		
		this.add(jMenuB); //프레임에 bar추가
		jMenuB.add(jMenu); //bar에 메뉴 추가
		jMenu.add(jMe_01); //메뉴에 아이템 추가
		jMenu.add(jMe_02); //메뉴에 아이템 추가
		
		this.setSize(500, 400); //프레임크기
		this.setVisible(true);
		
		jMe_01.addActionListener(this); //이벤트 연결 jMe_01을 클릭하면 actionPerformed 실행
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		JDialog dial = new JDialog(this,"Dialog"); //다이얼로그 컴포넌트
		dial.setLayout(new FlowLayout(FlowLayout.CENTER, 100, 120));
		btn.setSize(100, 100); //다이얼로그 버튼
		dial.add(btn); //버튼 추가
		dial.setSize(300, 200);
		dial.setVisible(true);
		
		//안드로이드 App 이벤트 적용 예시
//		btn.addActionListener(this); //btn클릭시 -> ActionListener 오버라이드 actionPerformed 메서드 구현 방법
//		
//		ActionListener a1 = new ActionListener() {
//
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				System.out.println("오버라이딩");
//				dial.setVisible(false);
//			}
//		};
		
		//btn클릭 -> ActionListener의 actionPerfomed메서드를 구현
		//안드로이드 이벤트 구현 방법 중 하나
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				dial.setVisible(false); //다이얼로그 버튼 클릭하면 다이얼 안 보임
			}
		});
	}
	
	public static void main(String[] args) {
		
		new JMenuEventEx();
		
	}

}
