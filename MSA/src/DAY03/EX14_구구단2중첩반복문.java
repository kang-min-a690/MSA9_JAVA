package DAY03;

public class EX14_구구단2중첩반복문 {

	public static void main(String[] args) {
		// (단)x(1~9)
		// 단에 대한 반복 	: 1~9
		// 각 단의 곱		: 1~9
		
		// 중첩 반복문(이중 반복문)
		// A X B
		
		for (int a = 1; a <= 9 ; a++) {
			
			
		
		for (int b = 1; b < 9; b++) {
			System.out.print(a + "X" + b + "=" + (a*b));
			System.out.println("\t");//탭공백
		}
		System.out.println();

	}

}
}