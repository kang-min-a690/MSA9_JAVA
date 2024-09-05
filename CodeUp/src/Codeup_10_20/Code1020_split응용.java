package Codeup_10_20;

import java.util.Scanner;

public class Code1020_split응용 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 입력문
		String input = sc.nextLine();

		 String[] data = input.split("\\-");

		 int personNumber1 = Integer.parseInt(data[0]);
		 int personNumber2 = Integer.parseInt(data[1]);

		System.out.printf("%06d%07d", personNumber1,personNumber2);
		sc.close();
	}

}
