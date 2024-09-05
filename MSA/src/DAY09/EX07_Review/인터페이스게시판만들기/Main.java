package DAY09.EX07_Review.인터페이스게시판만들기;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		 BoardInterface boardInterface = new BoardAccess();
		 Scanner sc = new Scanner(System.in);
		int menuNo;
		
		do {
			System.out.println("::::::게시판::::::");
			System.out.println("1. 게시글 목록");
			System.out.println("2. 게시글 등록 ");
			System.out.println("3. 게시글 조회 ");
			System.out.println("4. 게시글 수정 ");
			System.out.println("5. 게시글 삭제 ");
			System.out.println("0. 프로그램 종료 ");
			System.out.println("메뉴번호 :  ");
			
			menuNo =sc.nextInt();
			// *(주의) 엔터를 입력 버퍼에서 재거
			sc.nextLine();
			
			switch (menuNo) {
			 case 1: // 게시글 목록
				 		Board[] boardList = boardInterface.list();
				 		if( boardList != null)
				 			for(Board board : boardList) {
				 			System.out.println(board);
				 		}
				 		break;
				 		
				 		
			 case 2: //게시글 등록
				 		System.out.print("제목 : ");
				 		String title = sc.nextLine();
				 		System.out.print("작성자 : ");
				 		String Writer = sc.nextLine();
				 		System.out.print("내용 : ");
				 		String content = sc.nextLine();
				 		
				 		Board board = new Board(title, Writer, content);
				 		Board createdBoard = boardInterface.create(board);
				 		
				 		if( createdBoard != null ) {
				 			System.out.println(":::::::::생성된 게시글 정보:::::::::");
				 			System.out.println(createdBoard);
				 		}
				 		break;
				 		
				 		
			 case 3: 	//게시글 조회
				 		System.out.print("조회할 글번호 : ");
				 		int no = sc.nextInt();
				 		sc.nextLine();			//엔터제거
				 		Board selectedBoard = boardInterface.read(no);
				 		if( selectedBoard != null ) {
				 			System.out.println("::::::::::조회된 게시글 정보::::::::::");
				 			System.out.println(selectedBoard);
				 		}
				 		break;
				 		
				 		
			 case 4:	//게시글 수정
				 		//입력: 수정할 게시글 번호. 게시글 정보
				 		System.out.print("수정할 글 번호 : ");
				 		int updateNo = sc.nextInt();
				 		sc.nextLine(); 				//엔터제거
				 		
				 		System.out.print("제목 : ");
				 		String updateTitle = sc.nextLine();
				 		System.out.print("작성자 : ");
				 		String updateWriter = sc.nextLine();
				 		System.out.print("내용 : ");
				 		String updateContent = sc.nextLine();
				 		
				 		Board updateBoard = new Board(updateTitle, updateWriter, updateContent);
				 		updateBoard.setNo(updateNo);
				 		
				 		
				 		int result = boardInterface.update(updateBoard);
				 		
				 		if( result > 0) {
				 			System.out.println("게시글 수정 완료");
				 		}
				 		else {
				 			System.out.println("게시글 수정 실패");
				 		}
				 		break;
				 		
			 case 5:	//삭제할 글번호
				 		System.out.print("삭제할 글번호 : ");
				 		int deleteNo = sc.nextInt();
				 		sc.nextLine();			//엔터제거
				 		result = boardInterface.delete(deleteNo);
				 		if ( result > 0) {
				 			System.out.println("게시글 삭제 완료");
				 		}
				 		else {
				 			System.out.println("게시글 삭게 실패");
				 		}
			}

		} while (menuNo !=0);
		System.out.println("프로그램이 종료됩니다.");
		
		sc.close();
	}

}
