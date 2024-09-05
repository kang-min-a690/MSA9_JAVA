package DAY10_13.EX02_Util;

import java.util.StringTokenizer;

/**
 * 
 */

public class StringTokenizerEx_토큰이란 {
	
	public static void main(String[] args) {
		// String (문자열) Token izer(~화 하다)			: 문자열을 코큰화 하는 클래스
		//: 구분 문자를 기준으로 문자열을 분리하여 다루는 클래스
		// 구분 문자			:캡 / , . 등등
		//토큰 				: 구분 문자로 분리된 문자열
		
		
		String java ="클래스,생성자,상속,오버로딩,오버라이딩,추상클래스,인터페이스";
		StringTokenizer st = new StringTokenizer(java, ",");
		
		//구분선을 작성해줘야한다.
//		String java ="클래스,생성자/상속.오버로딩-오버라이딩,추상클래스,인터페이스";
//		StringTokenizer st = new StringTokenizer(java, "/.,-");
		
		// countTokens(): 분리한 코튼 개수
		System.out.println("토큰 의 개수 :  " + st.countTokens());
		
		
		//토큰 반복하기
		while( st.hasMoreTokens()) {	//true			// 다음 토큰이 있으면 반복   (hasMoreTokens)은 다음 토큰이 남아 있는지 여부를 반환하는메소드
			String token = st.nextToken();			// 다음 토큰 가셔와서 token에 대입
			System.out.print(token + " ");		// 토큰을 한칸씩 띄워서 출려
		}
		
		System.out.println();
	}
}
