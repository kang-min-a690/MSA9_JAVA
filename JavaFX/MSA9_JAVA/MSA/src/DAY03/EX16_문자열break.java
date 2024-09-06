package DAY03;

import java.util.Scanner;

public class EX16_문자열break {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		//무한루프
		//반복문은 반드시 종료조건 추가해주어야한다.
		while(true) {
			System.out.println("입력 : ");
			String input = sc.nextLine(); //문자열 입력
			
			
			//문자열.equals("비교문자열")*** ==은 안됨
			if( input.equals("STOP")) {
				break;
			}
			System.out.println(">>" + input);
		}
		System.out.println("프로그램을 종료합니다.");
		
		
		sc.close();
	}

}
