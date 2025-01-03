package kr.board.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Update;

import kr.board.entity.BoardVO;

@Mapper // mybatis API
public interface BoardMapper {

	// 전체 리스트
	public List<BoardVO> getLists();
	
	// 등록 화면
	public void boardInsert(BoardVO boardVO);
	
	// 상세 화면
	public BoardVO boardContents(int idx);
	
	// 삭제
	public void boardDelete(int idx);
	
	// 수정
	public void boardUpdate(BoardVO boardVO);
	
	// 조회수 증가
	@Update("update myboard set count = count + 1 where idx=#{idx}")
	public void boardCount(int idx);
}
