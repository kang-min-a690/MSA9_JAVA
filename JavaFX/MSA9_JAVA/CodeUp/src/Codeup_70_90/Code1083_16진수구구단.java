package Codeup_70_90;

import java.util.Scanner;

public class Code1083_16진수구구단 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String input = sc.nextLine();
		int number = Integer.parseInt(input, 16);
		int var16 = 0x10;
		
		for (int i = 1; i < var16; i++) {
			int num = number * i;
			System.out.printf("%X * %X = %X\n", number, i, num);
		}
		sc.close();
		
	}

}
