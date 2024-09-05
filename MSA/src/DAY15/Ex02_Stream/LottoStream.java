package DAY15.Ex02_Stream;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class LottoStream {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("몇 게임?");
		int N = sc.nextInt();
		
		for (int i = 0; i < N; i++) {
			System.out.println("{" + (i + 1) + "게임]");
			Set<Integer> set = new HashSet<Integer>();		//Set 
			
			//랜덤수 6개 대입 & 중복 제거
			while (set.size() < 6 ) {
				int rand = (int) (Math.random() * 45 + 1 );		//랜덤숫자 출력
				set.add(rand);
			}
			// 스트림을 사용하여 정렬 + 출력
			set.stream()														//스트림 객체생성(빌더역할)
				.sorted()														//정렬
				.forEach( lottoList -> System.out.println(lottoList + " ") );	//전체반복
				System.out.println();
		}
		sc.close();
		
	}

}
