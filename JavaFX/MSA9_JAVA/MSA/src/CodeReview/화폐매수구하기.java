package CodeReview;

import java.util.Scanner;

/**
 * 더조은 컴퓨터 아카데미에서 김조은 팀장에게 예산을 주고
 * 에어컨을 구매하라고 지시하였다.
 * 이때 에어컨 구매비는 다음과 같이 현금으로 지급한다
 * 구매비			:657825
 * 50000원 		: 몇개~ 등등 1원까지
 * 위와같이 입력하면 큰화폐단위 부터 계산하여 화폐단위별로 매수 출력
 */

//변수선언 (입력금액),(화폐매수),(화폐단위)
//구매비 출력
//**화폐 매수 계산 - (화폐매수) = (입력금액) / (화폐단위)
//잔액계산 - 657825 * (50000 * 13 )
//(잔액) = (입력금액) - (화폐단위 * 화폐매수)
//(잔액) = (입력금액) % (입력금액) % (화폐단위)
//화폐단위 변환 번갈아가면서 /5,/2연산을 반복
//(화폐단위) = (화폐단위) / 5
//(화폐단위) = (화폐단위) / 2
//**을 반복


public class 화폐매수구하기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("구매비 : ");
		int input = sc.nextInt();
		
		//화폐매수계산
		int count = input / 50000;
		//잔액계산
		input = input % 50000;			//input =input - (50000 * count)
		System.out.println("50000 : " + count);
		
		count =input / 10000;
		input = input % 10000;
		System.out.println("10000 : " + count);
		
		count =input / 5000;
		input = input % 5000;
		System.out.println("5000 : " + count);
		
		count =input / 1000;
		input = input % 1000;
		System.out.println("1000 : " + count);
		
		count =input / 500;
		input = input % 500;
		System.out.println("500 : " + count);
		
		count =input / 100;
		input = input % 100;
		System.out.println("100 : " + count);
		
		count =input / 10;
		input = input % 10;
		System.out.println("10 : " + count);
		
		count =input / 5;
		input = input % 5;
		System.out.println("5 : " + count);
		
		count =input / 1;
		input = input % 1;
		System.out.println("1 : " + count);
		

		sc.close();

	}
}