package DAY03;

public class EX12_for문 {

	public static void main(String[] args) {
		// for( 1초기식; 2조건식; 3증감식 ) {3실행문 }
		// 실행순서: 1 -> 반복(2 > 3 > 4)
		
		//1. 1~10까지 정수를 출력하시오.
		for (int i = 1; i <= 10; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		//2. 50~100까지 정수 출력.
		for (int i = 50; i <= 100; i++) {
			System.out.print(i + " ");
			if( (i+1) % 10 == 0 )
				System.out.println();
		}
		System.out.println();
		
		//3. 1~20 까지 정수 중 짝수만 출력하시오	
		for (int i = 1; i <= 20 ; i++) {
			if (i % 2 == 0)
			System.out.print(i + " ");
		}
		System.out.println();
		//for (int i = 2; i <= 20; i+=2)

		
		//4. 1~20까지의 정수 중 홀수만 출력하시오
		for (int i = 1; i <= 20 ; i++) {
			if (i % 2 == 1)
			System.out.print(i + " ");
		}
		System.out.println();
		//for (int i = 1; i <= 20; i+=2)
	}
	
}
