package DAY15.Ex01_Lamdda;

/*
 * 제네릭 함수형 인터페이스
 * : 함수형 인터페이스를 제네릭 기법으로 정의하는것
 */

@FunctionalInterface
interface MyFun<T> {	//MyFun<T>는 제네릭 함수형 인터페이스
	void print( T t);	//입력값 T를 받아서 어떤 동작을 수행하는 메서드(T타입의 객체처리가능)
}

@FunctionalInterface
interface SuperFunc<T, U, V, R> { //제네릭을 사용한 함수형 인터페이스로, 3개의 입력 파라미터와 1개의 반환값을가짐
	
	R apply(T t, U u, V v);		//매개변수 3개, 세 개의 입력값을 받아서 반환값 R을 반환하는 메서드

}

//GenericFuncInterface클래스
public class GenericFuncInterface {
	
	public static void main(String[] args) {
		//함수형 인터페이스를 정의하는 시점이 아니라.
		// 선언하는 시점에서 타입을 확정해서 다양한 타입을 사용할수 있음
		MyFun<String> f1 = (x) -> System.out.println(x.toString());
		f1.print("문자열 타입으로 지정 - String");
		//MyFun<String> f1 = (x) -> System.out.println(x.toString());은 
		//MyFun 인터페이스를 문자열(String) 타입으로 정의한 것
		
		
		
		// 정수 타입으로 지정 integer		
		MyFun<Integer> f2 = (x) -> System.out.println(x);
		f2.print(100);			
		
		
		SuperFunc<Integer, Integer, Double, Double> sf = ( a, b ,c) -> (a + b) /c;
		double result = sf.apply(100, 90, 2.0);
		System.out.println("result : " + result);
		//SuperFunc<Integer, Integer, Double, Double> sf = (a, b, c) -> (a + b) / c;
		//SuperFunc 인터페이스. 이는 세 개의 입력값을 받고, 결과를 반환하는 apply 메서드를 구현
		
		//sf.apply(100, 90, 2.0)
		//apply 메서드를 호출하여, (100 + 90) / 2.0을 계산. 결과는 95.0이며, 이는 Double 타입으로 반환
		
		
		
		
	}

}//GenericFuncInterface 클래스 끝
