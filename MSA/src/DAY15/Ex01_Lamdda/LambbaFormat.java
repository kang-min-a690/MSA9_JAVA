package DAY15.Ex01_Lamdda;

/**
 * 람다식 사용하기
 * 1. 함수형 안터페이스 정의
 * 		* functionalInterface 어노테이션을 지정
 * 		* 추상 메소드 1개만 정의
 * 2. 람다식 익명함수 를 정의 하여 인퍼페이스에 선언
 * 3. 람다 호출
 */
@FunctionalInterface		// 컴파일러에 함수형 인터페이스임을 명시적으로 알려준다.
interface funcInterface1 {
		// @FunctionalInterface 를 지정하면 , 추상 메소드가 없거나 2개 이상이면 에러발생
	void method();
	//void method2();		// 함수형 안터페이스는 주상메소드 1개만 정의해야한다
}

@FunctionalInterface
interface funcInterface2 { void method(String a , String b); }

@FunctionalInterface
interface funcInterface3 {String method(); }

@FunctionalInterface
interface funcInterface4 { String method( String a , String b); }



public class LambbaFormat {
	
	// 매개변수 x , 반환 타입 x 람다식
	// 매개변수 o , 반환 타입 x 람다식
	// 매개변수 x , 반환 타입 o 람다식
	// 매개변수 o , 반환 타입 o 람다식
	public static void main(String[] args) {
		/**
		 * 매개변수 x 반환타입 x 람다식
		 * () -> {System.out.println("람다식");}
		 * () -> System.out.println("람다식");		* 한문장이면 중괄호 생략가능
		 */
		funcInterface1 fi1 = () -> System.out.println("자바 람다식 1");
		fi1.method();
		
/////////////////////////////////////////////////////////////////////////////////////////////////////	
	
		// 매개변수o 반환타입 x 람다식
		// (a , b) -> {System.out.println( a + b );}
		
		funcInterface2 fi2 = (a,b) -> {
			String result = a + b ;
			System.out.println(result);
		};
		fi2.method("자바", "람다식2");
		
		
/////////////////////////////////////////////////////////////////////////////////////////////////////
		
		// 매개변수x 반환타입 o 람다식
		// () -> { result 1 + 2; }
		
		funcInterface3 fi3 = ( ) -> {
			String a = "자바";
			String b = "람다식";
			return a + b;
		};
		String result3 = fi3.method();
		System.out.println(result3);
		
/////////////////////////////////////////////////////////////////////////////////////////////////////
		
		
		// 매개변수o 반환타입 o 람다식
		// ( a + b) -> {return a+ b; }
		// ( a + b) -> return a+ b; 	*에러 리턴이 있을땐 { }  생략 불가
		// ( a + b) -> a + b			* 리턴 문만 있다면 /리턴,{ } 동시에 생략가능
		funcInterface4 fi4 = (a , b) -> { return a + b; };
		// 에러 FunctionalInterface fi5 = (a + b) -> return a+b; 
		funcInterface4 fi6 = (a , b) -> a + b; 
		
		String result4 = fi4.method("자바" , "람다식4");
		String result6 = fi6.method("자바" , "람다식6");
		System.out.println(result4);
		System.out.println(result6);
		
	}

}
