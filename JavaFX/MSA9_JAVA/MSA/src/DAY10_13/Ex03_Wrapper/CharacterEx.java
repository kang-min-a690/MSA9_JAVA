package DAY10_13.Ex03_Wrapper;

public class CharacterEx {
	
	public static void main(String[] args) {
		// Character
		// char -> Character
		// 문자 타입인 char 기본 타입을 개체화한 클래스
		//주요메소드
		// 대소문자 변환
		//문자/숫자 인지 여부 확인
		
		char a = 'a';
		char A = 'A';
		
		System.out.println( Character.toUpperCase(a)); //대문자로 전환
		System.out.println( Character.toUpperCase(A)); //소문자로 전환
		
		char c1 =  '5';
		char c2 =  'X';
		
		//해당 문자가 숫자인지 확인
		if( Character.isDigit(c1)) {
			System.out.println(c1 + "은 숫자입니다.");
		}
		
		//해당 문자가 영문자인지 확인
		if( Character.isAlphabetic(c2)) {
			System.out.println(c1 + "은 영문자 입니다.");
		}
		
		String str = "Hello the joeun";
		
		char[] arr = str.toCharArray();			//문자열을 한글자씩 char[]배열로 변환
		
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			//대문자인지 확인
			if(Character.isUpperCase(arr[i])) {
				count++;
			}
		}
		
		System.out.println(str + " - 대문자 개수 : " + count);
	}
	

}
