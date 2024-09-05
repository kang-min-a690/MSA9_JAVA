package Day02;

public class EX04_int진수 {
	
	public static void main(String[] args) {
		
		// int : 정수형 , 자료형
		// 정수 리터럴
		// 10진수		:0,1,2,3,4,5,6,7,8,9
		// 8진수			:0?
		// 16진수		:0x? 0,1,2,3,4,5,6,7,8,9,A,B,C,D,E,F
		
		int var1 = 10;     //10진수
		System.out.println("var1 :" + var1);
		
		int var2 = 010;    //8진수
		System.out.println("var2 :" + var2);
		
		int var3 = 0x10;    //16진수
		System.out.println("var3 :" + var3);
		
		int var4 = 0b1100;    //2진수는 앞에 0b 
		System.out.println("var4 :" + var4);
		
		
//		%d               10진수

//		%lld             64비트 정수
//
//		%c               한 문자 형태
//
//		%f               float 형태의 실수
//
//		%lf              double 형태의 실수
//
//		%s              문자열
//
//		%o             8진법
//
//		%x             16진법
//
//		%u            부호없는 10진수
//
//		%p            pointer 값을 16진수로
//
//		%i             정수
	}

}
