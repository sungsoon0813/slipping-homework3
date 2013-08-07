package net.slipp.domain.board;

public class Board {
	
	// 글의 Unique id ( Auto_increase )
	private int id;
	
	// 작성자
	private String name;
	
	// 글의 제목
	private String subject;
	
	// 글의 내용 
	private String content;
	
	// 글 작성 시간
	private long date;
	
	// Tag
	private String tag;
	
	// 원글의 unique id
	private int originNo;
	
	// 리플 번호 ( 0이면 원글 )
	private int replyNo;

	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public long getDate() {
		return date;
	}

	public void setDate(long date) {
		this.date = date;
	}

	public String getTag() {
		return tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}

	public int getOriginNo() {
		return originNo;
	}

	public void setOriginNo(int originNo) {
		this.originNo = originNo;
	}

	public int getReplyNo() {
		return replyNo;
	}

	public void setReplyNo(int replyNo) {
		this.replyNo = replyNo;
	}

}
