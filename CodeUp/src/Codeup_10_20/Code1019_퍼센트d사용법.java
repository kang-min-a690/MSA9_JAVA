package Codeup_10_20;

import java.util.Scanner;

public class Code1019_퍼센트d사용법 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//입력문
		String input = sc.nextLine();
		//입력된 문자열을 . 으로 분리
		String[] dates = input.split("\\.");
		
		//연,월,일 을 각각 정수로 변환
		int year = Integer.parseInt(dates[0]);
		int month = Integer.parseInt(dates[1]);
		int day = Integer.parseInt(dates[2]);
		
		//yyyy.MM.dd 형식으로 출력
		// %d 쓸때는 'printf' 사용 필수!
		//.은 구분 %d는 정수
		//02는 두자리로 출력 (두자리보다 작은경우 앞에 0을 붙힘)
		//\n 은 줄바꿈, 출력후 커서를 다음줄로이동
		System.out.printf("%04d.%02d.%02d\n", year, month, day);
		sc.close();
	}

}
