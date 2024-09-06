package DAY10_13.EX05_Text;

import java.text.DecimalFormat;

public class DecimalFormat_숫자기호 {
	
	public static void main(String[] args) {
		// DecimalFormat : 숫자 형식 클래스
		// 숫자 데이터를 원하는 형식으로 표현학 해주는 클래스
		// ex 천단위 구분 기호 : 1,000,000
		
		double num = 1.414213;
		// 숫자 형식 패턴 기호
				// 0		: 10 진수를 표기, 빈자리를 0으로 채움
				// #		: 10 진수를 표기, 빈자리를 채우지 않음
				// ,		: 단위 구분
				// .		: 소수점
				// %		: 100을 곱하고 % 표기 (백분율)
				// \u00A4	: \(원화표시)
		
		//반올림은 기본, 뒤에는 안보이지만 0이있음
		DecimalFormat df = new DecimalFormat("0");
		System.out.println( df.format(num));
		
		//0은 줄어들 수 있음
		df = new DecimalFormat("00000.00000");
		System.out.println( df.format(num));
		
		// 반올림, 그냥 정수 1자리로 나옴
		df = new DecimalFormat("#");
		System.out.println( df.format(num));
		
		// 반올림, 소수점 첫째자리 까지
		df = new DecimalFormat("#.#");
		System.out.println( df.format(num));
		
		// 반올림, 소수점 5자리 까지
		df = new DecimalFormat("#.#####");
		System.out.println( df.format(num));
		
		
		// 새로운 메소드 생성
		double num2 = 10000000;
		
		//천단위 구분(,)
		df = new DecimalFormat("#,###");
		System.out.println( df.format(num2));
		
		
		// 소수점(.)
		double num3 = 123;
		df = new DecimalFormat("+#.0");
		System.out.println( df.format(num3));
		
		//백분율(%)
		double num4 = 0.2;
		df = new DecimalFormat("#,#% ");
		System.out.println( df.format(num4) );
		
		df = new DecimalFormat("\u00A4 #,###");
		System.out.println( df.format(num2) );
		
		
		
	}

}
