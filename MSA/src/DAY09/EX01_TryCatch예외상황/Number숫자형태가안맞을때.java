package DAY09.EX01_TryCatch예외상황;

/**
 * 예외 처리
 * NumberFormatException	: 문자열 숫자 ("10") 가 아닌 문자열을 숫자타입으로 변횐시 발생하는 예외상황
 * ex)"10A" --> 숫자로 변환하면 예외
 */

public class Number숫자형태가안맞을때 {
	
	public static void main(String[] args) {
		String strNum = "10";
		int num = 10;
		
		
		//(strNum +20)풀어보면;
		//(string) + (int)
		//(string) + (string) = (sting)
		// +: 문자열 연결 연산자
		System.out.println("10 + 20 ="+(strNum +20));
		System.out.println("10 + 20 ="+(num +20));
									//int + int
		
		String numberString = "10";
		String numberAndString = "A10";
		//Inter.parseInt("문자열숫자")
		// 문자열 숫자를 int 타입의 숫자러 변환하는 메소드
		int num1 = Integer.parseInt(numberString);
		System.out.println("numberString + 5 = " + (numberString + 5));
		//string + int 에서 string + string 이되면서 10,5가 합쳐진 출력
		
		int num2 = 0;
		
		//예외메세지 java.lang.NumberFormatException: For input string: "A10"
		// 문자열 숫자가 아닌 문자열을 숫자로 변화할수 없기 때문에 예외발생
		try {
		num2 = Integer.parseInt(numberAndString);
		}catch (NumberFormatException e) {
			System.err.println("문자열숫자가 아닌 문자열을 숫자타입으로 변환할수 없습니다.");
		}
		
		System.out.println("num1 + 10 = " + (num1+10)); //int + int = 산술연산
		System.out.println("num2 : " + num2); //int 값이 대입안돼서 0;
	}

}
