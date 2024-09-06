package DAY03;

public class EX10_oddEven홀수짝수 {

	public static void main(String[] args) {
		// 1~20 까지 정수 중, 홀수의 합계, 짝수의 합계를 각각 구하여 출력.
		// 1+3+5+7+9+11+13.....=???
		// 2+4+6+8+10+12+14.....=???
		
		int a = 1;
		int sum1 = 0;
		int sum2 = 0;
		
		while (a <= 20 ) {
			sum1 = a + sum1;
			a = a + 2;
		}
		a = 2;
		while (a <= 20 ) {
			sum2 = a + sum2;
			a = a + 2;
		}
		
		System.out.println("홀수의 합계 :" + sum1);
		System.out.println("짝수의 합계 :" + sum2);
		
		
		//방법2
		
			//홀수
		// while (a <= 20) {
	    //   if( a % 2 == 1)
		//		sum1 += a;
		
			//짝수
		//	if( a % 2 == 0 )
		//		sum2 += a;
		//	a++;
		


	}

}

