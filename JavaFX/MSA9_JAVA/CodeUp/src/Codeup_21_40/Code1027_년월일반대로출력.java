package Codeup_21_40;

import java.util.Scanner;

public class Code1027_년월일반대로출력 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String input = sc.nextLine();
		
		// . 기준으로 분리
		String [] localTime = input.split("\\.");
		
		int year = Integer.parseInt(localTime[0]);
		int month = Integer.parseInt(localTime[1]);
		int day = Integer.parseInt(localTime[2]);
		
		System.out.printf("%02d-%02d-%d\n", day, month, year);
		
		sc.close();
	}

}
