package Day01;

//class밖에 코드작성하면 symtex에러 뜸
public class day1_기본코드작성 {
	
	//자료형 변수명 = 값;
	int age = 28;
	int level = 20;
	int energy; // int 자료형은 값을 입력하지 않았을 때,기본값 0으로 초기화
	//**int는 정수형=기본자료형(null을 가질수없음) 참조자료형은 null 가질수있음
	
	
	//메소드 : 접근지정자(static) int)반환타입 메소드명(매개변수...){실행문;}
	public int sum( int x, int y ) {
		System.out.println("x : " + x);
		System.out.println("y : " + y);
		int result = x + y;  //result 결과값
	// *retrun(값)
	// 1.메소드 종료
	// 2.(값)을 메소드를 호출한자리로 반환
		return result;
	
	}
	
	
	
	//main : ctrl + space = 프로그램 시작점
	public static void main(String[] args) {
		//객체 생성 :클래스명+객체명 = new클래스명();
		day1_기본코드작성 객체1 = new day1_기본코드작성();
		
		//기본출력 sysout : ctrl + space
		System.out.println("나이 : " + 객체1.age);
		System.out.println("레벨 : " + 객체1.level);
		System.out.println("에너지 :" + 객체1.energy);
		//(.) 접근연산자로 객체의 변수와 메소드를 접근,호출할수있다.
		//객체.변수 / 객체.메소드()
		
		//메소드 호출(실행) : 메소드명(인수1, 인수2);
		//- 인수(인자; argument) : 메소드로 전달해줄 값
		int answer = 객체1.sum(10, 20);
		System.out.println("answer : " + answer);
		
	} //프로그램 실행 ctrl + F11
	

}
