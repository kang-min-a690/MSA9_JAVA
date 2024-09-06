package DAY15.Ex02_Stream;

import java.util.Scanner;

public class LottoArray {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("몇 게임?");
		int N = sc.nextInt();
		
		for (int i = 0; i < N; i++) {
			System.out.println("{" + (i + 1) + "게임]");
			int lotto[] = new int[6];
			
			//랜덤수 6개 대입
			
			for (int j = 0; j < lotto.length; j++) {
				int rand =(int) (Math.random() * 45 + 1 );		//1 ~ 45 랜덤 수
				lotto[j] = rand;
				
				//중복제거
				for (int k = 0; k < j; k++) {
					// 현제 뽑은 랜덤수가 기존수들과 같은면 다시뽑는다,
					if( rand == lotto[k]) {
						j--;	//앞으로 되돌아간다.
						break;
					}
				}
			} //랜덤수 6개 대입 끝
			
			//정렬 - 선택 정령
			for (int j = 0; j < lotto.length; j++) {
				for (int k = j+1; k < lotto.length; k++) {
					//앞에 요소가 더크면 교환 swap
					if ( lotto[j] > lotto[k] ) {
						int temp = lotto[j];
						lotto[j] = lotto[k];
						lotto[k] = temp;
					}
				}
			}// 정렬 끝
			
			// 출력
			for (int j = 0; j < lotto.length; j++) {
				System.out.print(lotto[j] + " ");
			}
			System.out.println();
		}
		sc.close();
	}

}
