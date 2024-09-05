package CodeReview;

import java.util.Scanner;

public class review_은행 {
	public static void main(String[] args) {
		
		boolean run = true;
		
		int balance = 0;
		
		Scanner sc = new Scanner(System.in);
		
		while(run) {
			System.out.println("----------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("----------------------------");
			System.out.println("선택> ");
			
			//작성위치
	
			int menu = sc.nextInt(); //입력
			//제어문 탈출
			if(menu == 0) break;
			
            //메뉴
        switch (menu) {
            case 1: // 예금
                    System.out.print("예금액 : ");
                    int deposit = sc.nextInt(); // 예금액을 받음
                    balance += deposit; // 예금액 추가
                    System.out.println("현재 잔고 : " + balance);
                    break;
                    
             case 2: // 출금
                    System.out.print("출금액 : ");
                    int withdraw = sc.nextInt(); // 출금액을 받음
                    if (withdraw > balance) {
                        System.out.println("잔고가 부족합니다.");
                    } else {
                        balance -= withdraw; // 잔고에서 출금액 차감
                        System.out.println("현재 잔고 : " + balance);
                    }
                    break;
                    
              case 3: // 잔고 조회
                    System.out.println("현재 잔고 : " + balance);
                    break;   
              case 4: //종료
            	  	System.out.println("은행마감 합니다.");
                    break;
               
              default: break;
       			}
              
              if (menu >= 1 && menu <= 4 ) {
            	
              	} else {
              		System.out.println("(0~4) 번 사이의 번호를 눌러주세요");
              	} 
		
		}
              	System.out.println("프로그램 종료");
              	sc.close();
		
			}
		}

