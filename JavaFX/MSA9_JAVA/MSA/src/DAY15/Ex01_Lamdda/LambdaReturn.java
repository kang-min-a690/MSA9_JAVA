package DAY15.Ex01_Lamdda;

/**
 *  익명함수 (람다식) 을 반환할수 있다
 */

@FunctionalInterface		//애너테이션은  PrintString가 함수형 인터페이스 임을 나타냄
interface PrintString {
	void showString(String msg);		//showString이라는 단하나의 추상메서드를 정의
}										//이 메서드는 문자열 메시지를 인자로 받아서 어떤 동작을 수행함

/*
 * 람다식 장점
 * 1. 함수를 쉽게 축약해서 정의 할수 있다
 * 2. 함수로 함수를 통해 전달 또는 반환할 수 있다.
 * 
 */

//LambdaReturn 클래스
public class LambdaReturn {
	
	public static void main(String[] args) {
		//returnLambda 메서드를 호출 ->PrintString 인터페이스의 인스턴스 ps1, ps2, ps3를 생성
		PrintString ps1 = returnLambda(1);		
		PrintString ps2 = returnLambda(2);
		PrintString ps3 = returnLambda(3);
		
		//PrintString 인스턴스의 showString 메서드를 호출하여 문자열을 출력
		ps1.showString("안녕하세요1");
		ps2.showString("안녕하세요2");
		ps3.showString("안녕하세요3");
		
	}
	
	//람다식(익명함수) 를 반환하는 메소드
	private static PrintString returnLambda (int code) {
		//returnLambda 메서드는 정수 code를 인자로 받아, 해당 code에 맞는 람다식을 반환
		switch(code) {
		
				//code가 1이면, "메세지 : " + msg 형식으로 출력
			case 1 : 
				//매게변수가 한개면 () 괄호를 생략할수 있다
					return msg -> System.out.println("메세지 : " + msg);
					
				//code가 2이면, "메세지 : "와 메시지를 두 줄로 나누어 출력
			case 2: 
				// 두줄 이상쓸때는 중괄호를 써주어야 한다.
					return msg -> {
						System.out.println("메세지 : ");
						System.out.println(msg);
				};
				
				//code가 3이면, 메시지만 출력
			case 3 :
					return (msg) -> System.out.println(msg);
				//default에서는 아무런 메시지도 출력하지 않는다
			default:
					return (msg) -> System.out.println();
				
		}
	}

}//LambdaReturn 클래스 끝
