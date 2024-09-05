package Codeup_70_90;


import java.util.Scanner;

public class Code1075_For_역방향출력 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//5입력
		int n = sc.nextInt();
		
		//4 3 2 1 0 까지 출력
		for (int i = n-1; i >= 0; i--) {
			System.out.println(i);
		}
		
		sc.close();
	}

}
