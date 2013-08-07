package net.slipp.service.board;

import java.sql.SQLException;
import java.util.List;

import javax.annotation.Resource;

import net.slipp.dao.board.BoardDao;
import net.slipp.domain.board.Board;
import net.slipp.service.user.UserService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class BoardService {

	private static Logger log = LoggerFactory.getLogger(UserService.class);

	@Resource(name="boardDao")
	private BoardDao boardDao;
	
	public List<Board> getBoardList() {
		return boardDao.getBoardList();
	}
	
	public List<String> getTagList() {
		return boardDao.getTagList();
	}
	
	public List<Board> addBoard(Board board) throws SQLException {
		boardDao.boardInsert(board);
		return boardDao.getBoardList();
	}
	
}
