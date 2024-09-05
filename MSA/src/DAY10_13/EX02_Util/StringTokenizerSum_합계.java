package DAY10_13.EX02_Util;

import java.util.Scanner;
import java.util.StringTokenizer;

// 토큰의 합계 구하기

public class StringTokenizerSum_합계 {
	
	
	// 1+2+3+4+5
	// "+" 기준으로 분리 --> 1 2 3 4 5 (Sting)
	// 문자열 토큰을 (int) 타입으로 변환하여 합꼐구하기
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String input =sc.nextLine();
		
		//입력받은 문자열을 +를 기준으로 토큰으로 분리시킨다
		StringTokenizer st = new StringTokenizer(input, "+");
		int sum= 0;
		
		//토큰반복
		while(st.hasMoreTokens()) {
			String token = st.nextToken();			//다음 토큰을 가져옴 (String)
			int item = Integer.parseInt(token);		//(String) --> (int) 정수로 변환
			sum += item;							// 합계 구하기
			
		}
		
		System.out.println("합계 : " + sum);
		sc.close();
	}

}
