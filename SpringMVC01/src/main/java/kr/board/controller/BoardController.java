package kr.board.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import kr.board.entity.BoardVO;
import kr.board.mapper.BoardMapper;

@Controller
public class BoardController {

	@Autowired // DI(의존성 주입)
	private BoardMapper mapper;
	
	// handlerMapping
	@RequestMapping(value = "/boardList.do")
	public String boardList(Model model) {
		
		List<BoardVO> list = mapper.getLists();
		model.addAttribute("list", list);
		
		return "boardList"; // /WEB-INF/views/boardList.jsp -> forward
	}
	
	@RequestMapping(value = "/boardForm.do")
	public String boardForm() {
		
		return "boardForm"; // /WEB-INF/views/boardForm.jsp -> forward
	}
	
	@RequestMapping(value = "/boardInsert.do")
	public String boardInsert(BoardVO boardVO) { // title, contents, writer => 파라미터수집(BoardVO)
		mapper.boardInsert(boardVO); // 등록
		return "redirect:/boardList.do"; // redirect
	}
	
	@RequestMapping(value = "/boardContents.do")
	public String boardContents(@RequestParam("idx") int idx, Model model) {
		BoardVO boardVO = mapper.boardContents(idx);
		// 조회수 증가
		mapper.boardCount(idx);
		model.addAttribute("boardVO", boardVO);
		return "/boardContents"; // /WEB-INF/views/boardContents.jsp -> forward
	}
	
	// 상세화면 접근 방식
//	@RequestMapping("/boardDelete.do")
//	public String boardDelete(@RequestParam("idx") int idx) {
//		mapper.boardDelete(idx);
//		return "redirect:/boardList.do"; // redirect 
//	}
	
	// {idx}를 사용하기 위해 @PathVariable를 사용 
	@RequestMapping(value = "/boardDelete.do/{idx}")
	public String boardDelete(@PathVariable("idx") int idx) {
		mapper.boardDelete(idx);
		return "redirect:/boardList.do"; // redirect 
	}
	
	@RequestMapping(value = "/boardUpdateForm.do/{idx}")
	public String boardUpdateForm(@PathVariable("idx") int idx, Model model) {
		BoardVO boardVO = mapper.boardContents(idx);
		model.addAttribute("boardVO", boardVO);
		return "/boardUpdate";
	}
	
	@RequestMapping(value = "/boardUpdate.do")
	public String boardUpdate(BoardVO boardVO) {
		mapper.boardUpdate(boardVO); // 수정성공
		return "redirect:/boardList.do";
	}
}
