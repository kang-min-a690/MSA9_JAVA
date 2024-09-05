package DAY03;

public class EX08_while {

	public static void main(String[] args) {
		//1~10까지 공백을 두고 출력하시오.
		
		int a = 1;
		
		// While(조건) {반복실행문}
		// 반복문에는 반드시 종료조건이 성립하도록 작성 해야한다.
		// 종료조건이 만족하지 않게 되면,무한 루프에 빠진다.
		while(a <= 10) {
			System.out.println(a + " "); //(a++ + " ");
			a += 1; // 복합대입연산 적용 가능  이건일반a =  a + a;
		}
	}

}
