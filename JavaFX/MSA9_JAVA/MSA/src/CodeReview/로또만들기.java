package CodeReview;

/**
 * 
 */

public class 로또만들기 {

	public static void main(String[] args) {
		// Math.radom(); 0.xxxxx~0.9xxxxxx 사이의 난수를 반환하는 메소드
		double random = Math.random();
		System.out.println(random);
		
		// 1~6 사이의 정수 : 주사위
		//(int) (Math.random()*10) : 0~9사이의 정수가 반복
		//(int) (Math.random()*10) +1 : 1~10사이의 정수가 반복
		System.out.println ((int) (Math.random()*10) +1);
		
		//(int) (Math.random()*6) : 0 ~ 5	
		//(int) (Math.random()*6)+1) : 1 ~ 6
		int dice = (int) (Math.random()*6) +1;
		System.out.println("주사위 : " + dice);
		
		//(공식) : (int) (Math.random() * [개수] ) + [시작숫자]
		
		// 1 ~20 사이의 랜덤 수
		int dice1 = (int) (Math.random()*20)+1;
		System.out.println("랜덤수 : " + dice1);
		
		// -20~20 사이의 랜덤 수
		int dice2 = (int) (Math.random()*41) -20;
		System.out.println("랜덤수2 : " + dice2);
		
		// 1~45 사이의 랜덤 수 6개를 배열에 저장하시오
		int dice3 = (int) (Math.random()*45) +1;
		System.out.println("랜덤수3 : " + dice3);
		
		//배열지정
		int arr[] = new int[6];
		//반복문지정, 배열의 변수가 어떤 숫자를 랜덤으로 반복할지 적기
		//+1때문에 arr[i] 는 1 이 되고 45까지 하나씩 출력 해라 라는 반복문
		{for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random()*45) +1;
		}
		// int : arr 1~45 를 출력 하되, " "를 넣어서 띄어써서 구분되게 나와라.
		for (int i : arr ) {
			System.out.print(i + " ");
		}
		System.out.println();

	}
//---------------------------------------------------------------------------------------------------
		
		int arr2[] = new int[6];
		for(int j = 0;j < arr.length; j++) {
			int r = (int) (Math.random()*45 +1);
			
			//j가 g로 지정, 0이될때 까지 하나씩 감소해라
			for (int g = j -1 ; g >= 0; g--) {
				//만약 g가 0을오 돌아갈때 만났던 r들중 같은 숫자가 있다면
				if( arr[g] == r ) {
					j--; //처음으로 돌아가라
					break;
				}
			}
		}
		
		for (int j : arr) {
			System.out.print(j + " ");
		}
		System.out.println();
}
}

