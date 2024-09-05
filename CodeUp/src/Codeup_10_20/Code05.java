package Codeup_10_20;

import java.util.Scanner;

public class Code05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		
		if (num1 % 2 == 1 ) {
			System.out.println("odd");
		}else if(num1 % 2 == 0) {
			System.out.println("even");
		}

	}

}
