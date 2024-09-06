package Codeup_21_40;

import java.util.Scanner;

public class Code1036_아스키코드를10진수로 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//입력
		//char : 하나의 문자를 나타냄 (String은 문자열)
		//chatAt(0): 1번째 문자열을 의미함
		
		char input = sc.nextLine().charAt(0);
		
		
		//입력받은 input은 char로 정의되었고
		//input(문자열)은 이제 int(정수)로 변환될것이다
		//char의 유니코드,아스키 타입의 코드를 변화시킬때 꼭필요한 명령문
		int ASC = (int) input;
		
		
		System.out.println(ASC);
		sc.close();
	}

}
