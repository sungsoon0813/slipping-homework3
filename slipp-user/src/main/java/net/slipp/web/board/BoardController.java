package net.slipp.web.board;

import net.slipp.domain.board.Board;
import net.slipp.service.board.BoardService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/board")
public class BoardController {
	
	private static Logger log = LoggerFactory.getLogger(BoardController.class);
	
	@Autowired
	private BoardService userService;

	@RequestMapping("/list")
	public String boardList(Model model) throws Exception {
		model.addAttribute("boards", userService.getBoardList());
		model.addAttribute("tags", userService.getTagList());
//		model.addAttribute("user", attributeValue)
		return "board/list";
	}

	@RequestMapping(value="/list", method=RequestMethod.POST)
	public String addBoard(Board board, Model model) throws Exception {
		userService.addBoard(board);
		model.addAttribute("boards", userService.getBoardList());
		model.addAttribute("tags", userService.getTagList());
		return "board/list";
	}
	
	@RequestMapping("/form")
	public String joinForm(Model model) throws Exception {
		model.addAttribute("board", new Board());
		return "board/form";
	}
	
	
	
}
