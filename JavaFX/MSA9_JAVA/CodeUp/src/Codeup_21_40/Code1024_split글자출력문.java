package Codeup_21_40;

import java.util.Scanner;

public class Code1024_split글자출력문 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//입력문
		String input = sc.nextLine();
		
		//입력한 문자를 한개씩 분리 배열에 넣기
		String[] name2 = input.split("");
		
		//배열을 반복
		for (int i = 0; i < input.length(); i++) {
			System.out.println("'" + name2[i] + "'");
		}
		sc.close();
	}

}
