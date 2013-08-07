package net.slipp.dao.board;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import net.slipp.domain.board.Board;

import org.springframework.stereotype.Repository;

@Repository("boardDao")
public class BoardDao {

	// 게시물의 Unique ID
	private static int uniqueId = 0;
	// 게시물들을 저장하는 ArrayList
	private static List<Board> boardStorage = new ArrayList<Board>();
	// 태그를 저장하는 TagStorage
	private static List<String> tagStorage = new ArrayList<String>();

	/**
	 * boardStorage에서 해당 글의 uniqueID와 원글ID가 동일한 것을 글목록으로 return
	 */
	public List<Board> getBoardList() {

		List<Board> board = new ArrayList<Board>();  

		for (int i = 0; i < boardStorage.size(); i++) {

			// 원글인 게시물만 추가
			if (boardStorage.get(i).getId() == boardStorage.get(i).getOriginNo())
				board.add(boardStorage.get(i));

		}

		return board;
	}

	public void boardInsert(Board board) throws SQLException {
		// 게시글 추가
		board.setId(++uniqueId);
		board.setDate(new Date().getTime());
		boardStorage.add(board);

		// 없는 태그 추가
		tagInsert(board.getTag());
	}

	public Board findByBoardId(int id) throws SQLException {
		return boardStorage.get(id);
	}

	public List<String> getTagList() {
		return tagStorage;
	}

	private void tagInsert(String tag) {

		if (tag == null || tag == "")
			return;
		
		// 태그 목록 관리
		String[] tagArr = tagSplit(tag);

		for (String tempTag : tagArr) {
			tempTag = tempTag.trim();
			// 기존 태그 목록에 없으면 추가
			if (!tagStorage.contains(tempTag))
				tagStorage.add(tempTag);
		}

	}
		
	private String[] tagSplit(String tag) {
		return tag.split(",");
	}


}
