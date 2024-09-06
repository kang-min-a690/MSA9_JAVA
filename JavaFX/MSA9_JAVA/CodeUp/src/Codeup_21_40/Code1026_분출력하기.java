package Codeup_21_40;

import java.util.Scanner;

public class Code1026_분출력하기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//입력
		String input = sc.nextLine();
		
		//입력된 문자열을 : 로 분리
		//순서는 0,1,2
		String[] time = input.split(":");
		
		
		//분 추출 (1번)
		String minute = time[1];
		
		// 00 분인 경우 0만 출력
		if(minute.equals("00")) {
			System.out.println(0);
		}else {
			System.out.println(minute);
		}


		sc.close();
		
		
	}

}
