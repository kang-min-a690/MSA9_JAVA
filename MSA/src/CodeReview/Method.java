package CodeReview;

import java.util.Scanner;

public class Method {
	/**
	 * 
	 * 
	 */
	
	public static int plus(int a, int b) {
		//zhemtnwjd 2024.08.14유지현이 수정함
		//이딴거 만들지마라
		
		int result = a + b;
		return result;
	}
	
	//메소드 정의
	//접근지정자 (static) 반환타입 메소드면 (매개변수) {}
	
	public static int minus(int a, int b) {
		int result = a - b ;
		//if(특정 조건) return 123;
		//reture 이후에 코드는 이미 메소드 종료 되었기때문에 실행안됨
		if(a < 0 || b < 0 )
			return 0;
		if(a < 500 || b < 500 )
			return 0;
		
		
		int result1 = a - b ;
		//return (값);
		// 1. (값)을 메소드를 호출한 자리로 반환
		// 2. (리턴쓰면) 메소드 종료
		// 3. 메모리 해제
		return result1;
		//System.out.println("종료 이후에 출력");
		//종료 되서 출력안됨
		
		
	}
	
	public static void name(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("a : ");
		int a = sc.nextInt();
		System.out.print("b : ");
		int b = sc.nextInt();
		
		//메소드 호출 : 메소드명 (인자1, 인자2)
		// 전달 인자(argument)
		System.out.println( plus(a, b));
		System.out.println( minus(a, b));
		}

}
