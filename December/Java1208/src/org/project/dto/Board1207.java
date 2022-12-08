package org.project.dto;

public class Board1207 {
	
	private int bId;
	private String writeId;
	private String bContent;
	
	public Board1207(int bId, String writeId, String bContent) {
		super();
		this.bId = bId;
		this.writeId = writeId;
		this.bContent = bContent;
	}

	public int getbId() {
		return bId;
	}

	public void setbId(int bId) {
		this.bId = bId;
	}

	public String getWriteId() {
		return writeId;
	}

	public void setWriteId(String writeId) {
		this.writeId = writeId;
	}

	public String getbContent() {
		return bContent;
	}

	public void setbContent(String bContent) {
		this.bContent = bContent;
	}
	
}
