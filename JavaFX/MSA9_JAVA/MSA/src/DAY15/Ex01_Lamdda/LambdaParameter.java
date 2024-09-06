package DAY15.Ex01_Lamdda;

/*
 *  매개변수 있는 람다식
 *  - 최대값
 *  - 합계
 */
@FunctionalInterface
interface SmartCalc {
	int calc (int x, int y);
}


public class LambdaParameter {
	
	public static void main(String[] args) {
			//최대값
		SmartCalc sc1 = (x , y) -> { return (x > y) ?  x : y; };
		//{}안에있는건 전부 익명함수
		
		
		//x~y 합계
		SmartCalc sc2 = (x, y) -> {
			int sum = 0;
			for (int i = x; i <= y; i++) {
				sum += i;
				
			}
			return sum;
		};
		
		int result1 = sc1.calc(100, 50);	// 더 큰값
		int result2 = sc2.calc(1, 10);		// 1~10 가지 합계구하기
		
		System.out.println("result1 : " + result1);
		System.out.println("result2 : " + result2);
		
		
		// 익명함수를 메소드의 전달하여 사용할 수도 있다.
		smartCalc(sc1, 10, 20);			// sc1 = sm 으로 정의 (x , y) -> x > y ?  x : y; 으로 sm에 들어감
		smartCalc(sc2, 1, 50);			// 같은 방식임
	}
	
	//? : 메소드(익명함수; 람다식)를 메소드에 전달 할 수 있냐?
	// A : 람다식으로 정의한 익명 함수는 인터페이스 타입으로 전달할수있다.
	public static void smartCalc(SmartCalc sm, int a, int b) {
		int result = sm.calc(a, b);
		System.out.println("result : " + result);
		
	}

}
