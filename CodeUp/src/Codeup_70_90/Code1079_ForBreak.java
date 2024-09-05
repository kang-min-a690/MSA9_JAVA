package Codeup_70_90;

import java.util.Scanner;

public class Code1079_ForBreak {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			char input = sc.next().charAt(0);
			System.out.println(input);

			if (input == 'q') {
				break;
			}
		}
		sc.close();
	}
}
