package DAY03;

import java.util.Scanner;

public class EX11_DoWhile {
	//main : 프로그램의 시작
	public static void main(String[] args) {
		// 메뉴판
		// 변수 선언 : 메뉴 번호, 메뉴 이름
		int a = 0; 
		int menuNo = 0;         //메뉴번호 변수 선언
		String menuName ="";    //메뉴이름 변수 선언
		Scanner sc = new Scanner(System.in); // 입력 객체 생성
		
		// do ~ while문
		// 무조건 1회 실행 후, 조건을 검사하여 반복하는 문장
		do {
			System.out.println("::::::::::::메뉴판::::::::::::::");
			System.out.println("1. 참치마요 ");
			System.out.println("2. 짜장면 ");
			System.out.println("3. 돈가스 ");
			System.out.println("4. 초밥 ");
			System.out.println("5. 마라탕 ");
			System.out.println("0. 종료");
			System.out.print("메뉴 번호 : ");
			// 메뉴 번호 입력
			menuNo = sc.nextInt();
			//break : 제어문을 탈출하는 키워드
			// 가장 가까운 제어문만 탈출한다.
			if(menuNo == 0) break;
			
			//메뉴선택
			switch (menuNo) {
			case 1: menuName = "참치마요"; break;
			case 2: menuName = "짜장면"; break;
			case 3: menuName = "돈가스"; break;
			case 4: menuName = "초밥"; break;
			case 5: menuName = "마라탕"; break;
			default: break;
			}
			//유효성 검사
			//메뉴판 번호가 0~5번만 유효
			if ( menuNo >= 0 && menuNo <= 5 ) {
			//주문 갯수 증가
			a++;
			
			System.out.println(menuName + "(을/를) 주문하였습니다.");
			//0번 입력시 메뉴판을 종료하게 해보자
			}else {
				System.out.println("(0~5)번 사이의 번호를 입력해주세요.");
			}
			
		} while( menuNo != 0);
		// 종료를 눌렀을때 주문한 메뉴 개수를 출력하세요 
		
		System.out.println("메뉴판을 종료 하였습니다.");
		System.out.println(a + "개 를 주문하였습니다.");
		sc.close();
		
		
	}
	}

	
