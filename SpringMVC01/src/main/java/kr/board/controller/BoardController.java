package kr.board.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.board.entity.BoardVO;

@Controller
public class BoardController {

	// handlerMapping
	@RequestMapping("/boardList.do")
	public String boardList(Model model) {
		
		BoardVO boardVO = new BoardVO();
		boardVO.setIdx(1);
		boardVO.setTitle("테스트");
		boardVO.setContents("내용");
		boardVO.setWriter("ori");
		boardVO.setWriteDate("2025-01-02");
		boardVO.setCount(0);
		
		
		List<BoardVO> list = new ArrayList<BoardVO>();
		list.add(boardVO);
		list.add(boardVO);
		list.add(boardVO);
		
		model.addAttribute("list", list);
		
		return "boardList"; // /WEB-INF/views/boardList.jsp -> forward
	}
	
}
