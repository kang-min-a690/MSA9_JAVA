package Codeup_21_40;

import java.util.Scanner;

public class Code1021_split반복문 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//입력문
		String input = sc.nextLine();
		
		String[] data = input.split("\\.");
		
		for(String data2 : data) {
			System.out.println(data2);
		}
		
		//출력문

		sc.close();
	}

}
