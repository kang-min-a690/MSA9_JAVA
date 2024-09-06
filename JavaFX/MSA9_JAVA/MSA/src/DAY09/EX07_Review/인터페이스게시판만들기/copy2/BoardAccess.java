package DAY09.EX07_Review.인터페이스게시판만들기.copy2;

//구현클래스
public class BoardAccess implements BoardInterface{
	
	//게시글 갯수 (5개있다고 가정하는중)
	int count = 5;
	// 게시글 목록
	Board[] boardList = {
			new Board(1, "제목01","작성자01","내용01", "2024/08/20 - 10:00", "2024/08/20 - 10:00"),
			new Board(2, "제목02","작성자02","내용02", "2024/08/20 - 10:00", "2024/08/20 - 10:00"),
			new Board(3, "제목03","작성자03","내용03", "2024/08/20 - 10:00", "2024/08/20 - 10:00"),
			new Board(4, "제목04","작성자04","내용04", "2024/08/20 - 10:00", "2024/08/20 - 10:00"),
			new Board(5, "제목05","작성자05","내용05", "2024/08/20 - 10:00", "2024/08/20 - 10:00"),
	};
	/**
	 * 게시글 등록
	 * 1. 메게변수로 넘겨받은 board 객체에 게시글 번호를 부여한다.
	 * 2. 등록일자와,수정일자를 현제 날짜/시간으로 지정한다.
	 * 3. board 객체를 현제 까지 등록된 배열 요소 다음 index에 저장한다.
	 * 4. 등록된 board 객체를 반환
	 */
	
	@Override
	public Board create(Board board) {
		if( this.count== 5) {
			System.out.println("게시글 목록이 꽉 찼습니다.");
			return null;
		}
		
		int boardNo = ++count;
		String regDate = "2024/08/20 - 10:00";
		String updDate = "2024/08/20 - 10:00";
		board.setNo(boardNo);
		board.setRegDate(regDate);
		board.setUpdDate(updDate);
		
		boardList[boardNo-1] = board;
		
		System.out.println(board);
		System.out.println("게시글이 등록되었습니다.");
		return board;
		
	//다른방법	
//		int boardNo = count++;
//		board.setNo(boardNo);
//		String regDate = "2024/08/19 - 18:00";
//		String updDate = "2024/08/19 - 18:00";
//		board.setRegDate(regDate);
//		board.setUpdDate(updDate);
//		
//		boardList[count-1] = board;
//		System.out.println(board);
//		System.out.println("게시글이 등록 되었습니다");
//		return board;
	}
	/**
	 * 게시글 목록
	 * 1. 게시글이 존재하는지 확인하고 1개의 게시글이 없으면 null
	 * 2. 게시글이존재한다면, 전체게시글 배열인 boardList 를 반환
	 */
	@Override
	public Board[] list() {
		if( this.count == 0 ) {
			System.out.println("조회된 게시글이 없습니다.");
		return null;
		}
		System.out.println("게시글 목록을 조회합니다.");
		return boardList;
	}
	//내가한거
//	if (boardList == null || boardList.length == 0) 
//	  return null;
//	else
	
	/**
	 * 게시글 조회
	 * 1. 넘겨받은 게시글 번호 no가 유효하지 않다면 ,null
	 * 2. 게시글 번호 no가 유효하면 , 번호에 해당하는 boardList [] 요소 반환
	 */
	@Override
	public Board read(int no) {
		// 유효하지 않은 경우 1
		if (no >= 1 || no <= 5 ) {
			System.out.println(no + " 번 게시글을 조회 합니다.");
			return boardList[no-1];
		}
		// 유효하지 않은 조건 2
//		retune null;
		
		// 유효하지 않은 조건 3
//		retune null;
		
		//  글번호 1~5번에 해당 되는지
		System.out.println("1~5번의 게시글만 존재 합니다.");
	    return null;
	}
	//내가한거
//	if (no < 0 || no >= boardList.length) {
//    return null;
//}
//// 2. 게시글 번호 no가 유효하면, 번호에 해당하는 boardList 요소 반환
	
	
	/**
	 * 게시글 수정
	 * 1. 수정할 게시글 no가 유효하지않으면 0반환
	 * 2. 수정할 게시글 번호 no가 유효하면 ,
	 * - 번호에해당하는 boardList [] 요소를 변경
	 * - 수정일자(update)를 현재 날짜/시간으로 변경
	 * - 수정된 게시글 수 1을 반환 
	 */
	@Override
	public int update(Board board) {
		int no = board.getNo(); //수정할 게시글 번호
		if( no > 5 || no < 0) {
			System.out.println("1~5번 게사글만 존재합니다.");
			return 0;	//수정된 게시글 0개 (수정x)
		}
		// 기존 게시글 정보 조회
		Board oldBoard = boardList[no-1];
		
		String updateTitle = board.getTitle();
		String updateWriter = board.getWriter();
		String updateCountent = board.getContent();
		
		//수정할 자ㅓㅇ보만 변경
		oldBoard.setTitle(updateTitle);
		oldBoard.setWriter(updateWriter);
		oldBoard.setContent(updateCountent);
		
		
		boardList[no-1] = oldBoard;
		oldBoard.setUpdDate("2024/08/20 - 12:00");
		//위 둘은 하나의 인스턴스 안에서 활동할는 영역이기때문에 순서가 바뀌어도상관없다,
		//단 문장 안에 새로운 인스턴스나, 변수가 들어가게된다면 말이달라짐.
		return 1;
	}
	//내가한거
//	if(boardList.length)
//		
//		return 0;
//	
//	int updateNo = count++;
//	board.setNo(updateNo);
//	String updDate = "수정된 게시글 수" + updateNo;
//	String update === 
//	board.setUpdDate(updDate);
//	
	
	
	/**
	 * 게시글 삭제
	 * 1. 삭제할 게시글 번호 no가 유효하지 않으면 0반환
	 * 2. 게시글이 하나도 존재하지않으면 , 0반환
	 * 3. 삭제할 게시글 번호가 no가 유효하면,
	 * - 번호에 해당하는 boardList[] 요소를  null로 변경
	 * - 해당 index  다음의 요소들을 앞으로 한칸씩 당겨준다
	 * - 게시글 개수 count 를 1감소 시킨다.
	 */
	@Override
	public int delete(int no) {
		if( no > 5 || no < 0) {
			System.out.println("1~5번 게사글만 존재합니다.");
			return 0; 
		}
		if( count == 0 ) {
			System.out.println("삭제할 게시글이 없습니다");
			return 0; 
		}
		boardList[no-1] = null;		//null : 데이터 없음을 의미
		
		//no : index+1 : 다음 index 
		for (int i = no; i < boardList.length; i++) {
			//바로 앞의 위치 = 현재 접근한 위치
			boardList[i-1] = boardList[i];
		}
		
		// 가장 마지막위치의 객체는 null로 비운다
		boardList[count - 1] = null;
		
		//삭제후, 게시글 개수 count -1감소
		count --;
		
		//글번호 재세팅 : 글번호를 1~......
		for (int i = 0; i < boardList.length; i++) {
			if( boardList[i] != null ) {
				boardList[i].setNo( i+1 );
			}
		}
		return 1;		//삭제한 개시글 개수
	}

}
