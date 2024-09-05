package Day06.EX01_PassingAgument;

public class CallBYValue {
	//메소드 정의
	// 접근지정자 (static) 반환타입 메소드명 (매개변수) { }
	//int  타입ㄴ의 매개변수 2개를 전달 밭아 합계를 구하여 반환하는 메소드를 정의하시오
	
	public static int sum (int a, int b) {  //a 10 b 20 	//**3번째
		a = 100; 					
		b = 200;
		//메인 a,b랑 매개변수의 a,b랑 상관없다 이름만 같을뿐
		//바뀌어서 sum만 바뀌고 메인은 가만히 있고 출력하고나면 매개변수는 사라짐
		int sum = a + b;
		System.out.println(":::: sum() 메소드 :::::");
		System.out.println("(a, b) : " + a + "," + b);
		return sum;
	}
	
	
	
	public static void main(String[] args) {

		int a = 10;
		int b = 20;
		
		System.out.println("::::::::sum() 메소드 호출:::::::::"); //**1뻔째
		System.out.println("(a, b) : " + a +" , " + b );    //a 10 b 20
		
		//값애 의한 호출 (Call by Vakue)
		//기본 자료형을 인자로 전달하는 방식
		// 호출된 메소드에서 매개변수의 값을 변경해도,본레의 변수의 값은 변하지 않는다.
		int sum =sum(a,b);
		System.out.println("sum : " + sum );
		
		System.out.println(":::: sum() 메소드 호출 후 ::::::::::");  //**2번째
		System.out.println("(a,b) :" +a + " , " + b);

	}

}
