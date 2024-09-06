package CodeReview;

import java.util.Scanner;

public class 화폐2While문으로 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("구매비 : ");
		int input = sc.nextInt();
		int money = 50000;
		boolean sw = true;
		
		while(money >= 1) {
			//화폐매수계산
			int count = input / money;
			System.out.println(money + " : " + count);
			
			//잔액계산
			input = input % money;		//input = input * (50000*count);
			
			//화폐단위 변환
			if( sw ) {
				money = money / 5;
			}
			else {
				money = money / 2;
			}
			
			sw = !sw;		//아니다 불린
		}
		sc.close();
	}

}
