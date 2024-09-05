package DAY10_13.Ex03_Wrapper;

import DAY04.Class.Pikachu;

public class CompareValue {
	/**
	 * 
	 */
	public static void main(String[] args) {
		Integer intobj1 = 10;
		Integer intobj2 = 10;
		
		System.out.println("언박싱하여 비교, int의 값을 비교");
		System.out.println("결과 : " + (intobj1.intValue()== intobj2.intValue()));
		
		//Q. intobj 1 객체와 intobj2 객체의 인스턴스가 같은가?
		//A. byte 범위 안에는 같은 레퍼런스(인스턴스)로 생성된다
		// byte(8bits) -(-128~127)범위 에서는 같은 인스턴스가 된다.
		System.out.println("레퍼런스(주소) 비교");
		System.out.println("결과 : " + (intobj1 == intobj2));
		
		System.out.println("equals는 메서드 객체를비교");
		System.out.println("equals() 로 비교");
		System.out.println("결과 : " + (intobj1.equals(intobj2)));
		
		System.out.println("-------------------------------------------------");
		
		
		Integer intobj3 = 200;
		Integer intobj4 = 200;
		
		System.out.println("결과 : " + (intobj3.intValue()== intobj4.intValue()));
		
		
		//이 경우 200은 -128과 127 범위 밖에 있으므로,
		//두 객체는 다른 레퍼런스(주소)를 참조. 따라서 false
		System.out.println("결과 : " + (intobj3 == intobj4) );
		
		
		System.out.println("결과 : " + (intobj3.equals(intobj4)) );

		
		// ==,!= 기호로 Wrapper클래스 객체를 비교하면,
		//아래의 범위에서는 배부의 값을 ==,!=로 비교할수있다.
		//boolean		:ture,False
		//정수타입 		:-128~127
		//Character		:\u0000 ~\u007f
		
		//클래스타입은 첫글자는 대분자 기본형은 소문자로 작성
		
		Boolean a = true;		//new Boolean(true)
		Boolean b = true;
		
		System.out.println( a == b );
		
		Pikachu p1 = new Pikachu();
		Pikachu p2 = new Pikachu();
		
		System.out.println(p1 == p2);
	}

}
