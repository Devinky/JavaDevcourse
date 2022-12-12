package org.project.dto;

import java.util.Date;

public class BoardDto {
	
	private int no; //시퀀스(자동으로 1씩 증가)
	private String bTitle;
	private String bContent;
	private String nickName; //별칭
	private Date bTime; //날짜
	private String bWriterId; //글쓴이 -> 외래키(FK)
	
	public BoardDto(int no, String bTitle, String bContent, String nickName, Date bTime, String bWriterId) {
		super();
		this.no = no;
		this.bTitle = bTitle;
		this.bContent = bContent;
		this.nickName = nickName;
		this.bTime = bTime;
		this.bWriterId = bWriterId;
	}
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getbTitle() {
		return bTitle;
	}
	public void setbTitle(String bTitle) {
		this.bTitle = bTitle;
	}
	public String getbContent() {
		return bContent;
	}
	public void setbContent(String bContent) {
		this.bContent = bContent;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public Date getBTime() {
		return bTime;
	}
	public void setBTime(Date date) {
		this.bTime = date;
	}
	public String getbWriterId() {
		return bWriterId;
	}
	public void setbWriteId(String bWriterId) {
		this.bWriterId = bWriterId;
	}
	
}
