package kr.board.entity;

import lombok.Data;

@Data // lombok API
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
	
}
