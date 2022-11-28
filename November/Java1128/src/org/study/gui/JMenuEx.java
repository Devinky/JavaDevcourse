package org.study.gui;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class JMenuEx extends JFrame {
	
	public JMenuEx() {
		super("JMenu EX"); //JFrame의 오버로딩된 생성자 중 하나
		JMenuBar bar = new JMenuBar(); //메뉴바 생성
		setJMenuBar(bar); //적용
		
		//파일 메뉴 만들기
		JMenu filemenu = new JMenu("파일(F)");
		filemenu.setMnemonic('F');
		
		JMenuItem newfile = new JMenuItem("새 파일(N)");
		newfile.setMnemonic('N'); //단축키를 alt + N으로 설정
		filemenu.add(newfile); //JMenuItem인 newfile을 JMenu의 filemenu에 저장
		
		JMenuItem open = new JMenuItem("열기(O)");
		open.setMnemonic('O');
		filemenu.add(open);
		
		JMenuItem save = new JMenuItem("저장(S)");
		save.setMnemonic('S');
		filemenu.add(save);
		
		JMenuItem close = new JMenuItem("닫기(C)");
		close.setMnemonic('C');
		filemenu.add(close);
		bar.add(filemenu); //JMenuBar에 JMenu 부착
		
		//도움말 메뉴 만들기
		JMenu helpmenu = new JMenu("도움말(D)");
		helpmenu.setMnemonic('D'); //단축키를 alt + D로 설정
		
		JMenuItem help = new JMenuItem("Help(H)");
		helpmenu.setMnemonic('H');
		helpmenu.add(help);
		bar.add(helpmenu);
		
		setSize(400, 200); //프레임사이즈 설정
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		
		JMenuEx menu = new JMenuEx();
		menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}
