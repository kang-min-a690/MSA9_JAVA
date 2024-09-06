package DAY10_13.EX01_Lang;

public class MathEx_수학 {
	
	public static void main(String[] args) {
		System.out.println(Math.PI);			//원주율 3.141592653589793
		System.out.println(Math.E);				//자연상수 2.718281828459045
		System.out.println(Math.ceil(3.125));	//올림 : 해당 수보다 큰 정수 중 가장작은 수
		System.out.println(Math.floor(3.75));	//내림 : 해당 수보다 작은 정수 중 가장 큰수
		System.out.println(Math.sqrt(9));		//제곱근
		System.out.println(Math.pow(3, 2));		//3의 2제곱
		System.out.println(Math.exp(2));		//e의 2승
		System.out.println(Math.round(3.14));	//반올림
		System.out.println("-------------------------");
		
		
		//로또 번호
		//Math.random()			:0.0보다 크거나 같고 1.0보다 작은 임의의 살수
		//Math.random()			:0.0xxxxx~0.9xxxxx
		//(0.0xx~0.9xx) *10		:0.xxx~9.xxx		(0 ~ 9)		-10개
		//(0.0xx~0.9xx) *20		:0.xxx~19.xxx		(0 ~ 19)		-20개
		//(0.0xx~0.9xx) *45		:0.xxx~44.xxx		(0 ~ 44)		-40개
		//(0.0xx~0.9xx) *45+1	:0.xxx~45.xxx		(0 ~ 45)
		//(int)(Math.random() * 45+1)	: 1~45
		
		//[공식]
		//(int)(Math.random() * [개수] +[시작숫자])
		
		/////////////////////로또번호 정렬하기/////////////////////////////////
		
		int lotto[] = new int[6];
		for (int i = 0; i < 6; i++) {
			int random =(int)(Math.random()* 45 + 1);
			lotto[i] = random;
			//중복제거
			for (int j = 0; j < i; j++) {
				//중복이 되는경우
				if( lotto[j] == random) {
					i--;
				}
			}
		}
		
		//오름차순 정렬
		for (int i = 0; i < lotto.length -1; i++) {
			for (int j = i+1; j < lotto.length ; j++) {
				//선택한 i번 요소와 비교할 j번 요소
				if( lotto[i] > lotto[j]) {
					
					// lotto [i] 와 lotto[j] 교환
					int temp = lotto[i];
					//보관저장소 temp 만들기
					
					lotto[i] = lotto[j];
					lotto[j] = temp;
					
				}
				
			}
			
		}
		
		for (int i = 0; i < lotto.length; i++) {
			System.out.print(lotto[i] + " ");
		}
		System.out.println();
		System.out.println("----------------------------------------");
		
		/////////////////////max 큰값 반환하기/////////////////////////////////
		
		double[] arr = {90.22, 12.45, 33.22, 88.12, 70.45};
		
		double max = Double.MIN_VALUE;
		
		for (int i = 0; i < arr.length; i++) {
			//방법1
//			if( max < arr[i])
//				max = arr[i];
			//방법2
			max = Math.max(max, arr[i]); 		//두 인자중 큰값을 반환
		}
		
		System.out.println("최대값 max : " + max);
	}
}
