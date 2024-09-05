package CodeReview;

public class EX02_369만들기 {

	public static void main(String[] args) {
		// 정수 1 ~ 100 까지 수를 반복하여 출력
		// 해당수가 3또는 6, 9 에 해당하면
		// 자리수마다 369가 되는 갯수만큼 정수대신 *을 출력
		// 1
		// 2
		// *	
		for (int i = 1; i <= 100; i++) {
			
			// 십의 자리수 : 해당수(i) / 10
			// 일의 자리수 : 해당수(i) % 10
			int ten = i / 10;
			int one = i % 10;
			
			boolean ten369 = ten == 3 || ten == 6 || ten == 9;
			boolean one369 = one == 3 || one == 6 || one == 9;
			
			if( ten369 && one369 ) 
				System.out.println("**");
			else if ( ten369 || one369 ) 
				System.out.println("*");
			else 
			System.out.println(i);
		}

		}
	} 


