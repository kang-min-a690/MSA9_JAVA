package Codeup_70_90;

import java.util.Scanner;

public class Code1074_For_역방향출력 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for (int i = n; i > 0; i--) {
			//i를 n으로 초기화 i가 1일 될때 가지 반복하면서 감소
		   System.out.println(i);
		   //n 부터 1까지 출력
		}
		sc.close();
	}

}
