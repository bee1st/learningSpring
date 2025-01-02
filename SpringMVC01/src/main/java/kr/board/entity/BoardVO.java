package kr.board.entity;

//@Date - Lombok API
public class BoardVO {

	// 번호
	private int idx = 0;
	
	// 제목
	private String title = "";
	
	// 내용
	private String contents = "";
	
	// 작성자
	private String writer = "";
	
	// 작성일
	private String writeDate = "";
	
	// 조회수
	private int count = 0;

	public int getIdx() {
		return idx;
	}

	public void setIdx(int idx) {
		this.idx = idx;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContents() {
		return contents;
	}

	public void setContents(String contents) {
		this.contents = contents;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getWriteDate() {
		return writeDate;
	}

	public void setWriteDate(String writeDate) {
		this.writeDate = writeDate;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
	
	// setter, getter
	
	
}
