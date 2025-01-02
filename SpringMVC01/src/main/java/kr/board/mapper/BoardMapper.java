package kr.board.mapper;

import java.util.List;

import kr.board.entity.BoardVO;

//@Mapper - mybatis API
public interface BoardMapper {

	// 전체 리스트
	public List<BoardVO> getLists();
}
