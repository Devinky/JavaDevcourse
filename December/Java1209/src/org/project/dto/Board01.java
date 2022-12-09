package org.project.dto;

public class Board01 {
	
	private int bId;
	private String bTitle;
	private String bContent;
	private String bWriteId;
	
	public Board01(int bId, String bTitle, String bContent, String bWriteId) {
		super();
		this.bId = bId;
		this.bTitle = bTitle;
		this.bContent = bContent;
		this.bWriteId = bWriteId;
	}

	public int getbId() {
		return bId;
	}

	public void setbId(int bId) {
		this.bId = bId;
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

	public String getbWriteId() {
		return bWriteId;
	}

	public void setbWriteId(String bWriteId) {
		this.bWriteId = bWriteId;
	}
	
	

}
