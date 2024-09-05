package Codeup_70_90;

import java.util.Scanner;

public class Code1087_while반복문 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int i = 1;		//1부터시작하는 숫자
		int sum = 0;	//합계를 저장할 변수
		
		// 합계가 n보다 작을 동안 반복
		while (sum < n) { //57입력시 55가되면 stop
			sum += i;	//현재숫자를 합계에 더함 (1+2)  
			i++;		//다음 숫자로 이동 (+3)
		}
		
		System.out.println(sum);
		
		sc.close();
	}
}