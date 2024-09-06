package DAY04;

public class EX07_String {

	public static void main(String[] args) {
		// String 은 참조 자료형
		// 문자열 한글자씩 그 자체를 비교할때는 equals() 사용
		
		// 문자열 사용방법
		// 1. 문자열 리터널("")로 지정
		// 2. 문자열 객체 생성
		
		// 문자열 리터널
		String a = "Hello";
		String b = "java";
		String c = "Hello";
		
		//문자열 객체
		String d = new String("Hello");
		String e = new String("Java");
		String f = new String("Java");
		
		System.out.println("a == c : " + (a == c));				// true
		System.out.println("a == d : " + (a == d));				// false
		System.out.println("문자열 비교 : " + a.equals(d));		//
		
		System.out.println("e == f : " + (e == f));				//
		System.out.println("문자열 비교 : " + e.equals(f));		//

	}

}
