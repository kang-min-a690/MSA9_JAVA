package application.Service;
//4. DAO에서 받은 데이터 데이터베이스 반환 한걸 글자로 읽어줌
//5. 다시 메인으로 눈으로 보여줌

import java.util.List;

import application.DAO.BoardDAO;
import application.DTO.Board;


/*
 * 게시판 기능 - 비지니스 로직 클래스
 */
public class BoardServiceImpl implements BoardService {

	private BoardDAO boardDAO = new BoardDAO();
	
	@Override
	public List<Board> list() {
		// DAO 객체로 게시글 목록 요청 List<Board>
		List<Board> boardList = boardDAO.list();
		// 게시글 목록 데이터 반환
		return boardList;
	}

	@Override
	public Board select(int no) {
		// 1. 게시글 번호 no 를 DB 로 넘겨주고 게시글 정보 요청
		Board board = boardDAO.select(no);
		// 게시글 정보 반환
		return board;
	}

	@Override
	public int insert(Board board) {
		// 게시글 정보를 전달하여 DB 에 데이터 등록 요청
		int result = boardDAO.insert(board);
		// 적용된 데이터 개수를 반환
		// - result(결과)		: 0 --> 데이터 등록 실패
		//					  1 --> 데이터 등록 성공
		if( result > 0 ) System.out.println("데이터 등록 성공!");
		else System.err.println("데이터 등록 실패!");
		return result;
	}

	@Override
	public int update(Board board) {
		int result = boardDAO.update(board);
		// 적용된 데이터 개수를 반환
		// - result(결과)		: 0 --> 데이터 수정 실패
		//					  1 --> 데이터 수정 성공
		if( result > 0 ) System.out.println("데이터 수정 성공!");
		else System.err.println("데이터 수정 실패!");
		return result;
	}

	@Override
	public int delete(int no) {
		int result = boardDAO.delete(no);
		// 적용된 데이터 개수를 반환
		// - result(결과)		: 0 --> 데이터 삭제 실패
		//					  1 --> 데이터 삭제 성공
		if( result > 0 ) System.out.println("데이터 삭제 성공!");
		else System.err.println("데이터 삭제 실패!");
		return result;
	}

}
