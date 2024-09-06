package Day02;

public class EX14_비트연산자 {
	public static void main(String[] args) {
		//AND (&)
		//두 비트가 모두 "1"일 때만 결과 비트가 1이됨
		int result = 20 & 16;
		
		// Integer.toBinaryString()  :십진수를 이진수 문자열로 변환하는 매소드
		System.out.println(Integer.toBinaryString(20) );
		System.out.println(Integer.toBinaryString(16));
		System.out.println("---------------");
		System.out.println(Integer.toBinaryString(result));
		System.out.println();
		
		
		//OR(|)
		//두 비트중 하나라도 1이면 결과비트가 1이됨
		int result2 = 20 | 16;
		System.out.println(Integer.toBinaryString(20));  //10100
		System.out.println(Integer.toBinaryString(16));  //10000
		System.out.println("----------------");
		System.out.println(Integer.toBinaryString(result2));
		System.out.println();
		
		
		//XOR(^)
		//두 비트가 서로 다를 떄만 결과빝,가 1이 됨
		//서로 값이 다르면 1(true), 같으면 0 (false)
	
		int result3 = 20 ^ 16;
		System.out.println(Integer.toBinaryString(20)); 
		System.out.println(Integer.toBinaryString(16));
		System.out.println("----------------");
		System.out.println(Integer.toBinaryString(result3));  //00100
		System.out.println();
		
		
		
		//NOT (~)
		//비트 반전 연산자로, 각 비트의 값을 반전시키는 역할
		//즉 0을 1로 1을 0으로
		int b = 2;
		int a = ~b;
		System.out.println(a);
//		이진수로 변환: 2는 이진수로 00000000 00000000 00000000 00000010입니다.
//		비트 단위 반전: ~00000000 00000000 00000000 00000010 = 11111111 11111111 11111111 11111101
//		10진수로 변환: 이진수 11111111 11111111 11111111 11111101는 10진수로 -3입니다
		
		//비트 시프트 왼쪽 (<<)
		//비트 시프트 왼쪽 연산자는 비트를 왼쪽으로 이동시킵니다. 
		//오른쪽에 비어 있는 비트는 0으로 채워집니다
//		00000001 (1 in decimal)
//		<< 2
//		------
//		00000100 (4 in decimal)

		
		
		
		//비트 시프트 오른쪽 (>>)
		//비트 시프트 오른쪽 연산자는 비트를 오른쪽으로 이동시킵니다.
		//왼쪽에 비어 있는 비트는 부호 비트로 채워집니다 (부호가 있는 정수의 경우)
//		00000100 (4 in decimal)
//		>> 2
//		------
//		00000001 (1 in decimal)

		
		
	}
	}


