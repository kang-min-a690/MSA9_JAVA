package Codeup_70_90;

import java.util.Scanner;

public class Code1083_369 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		for (int i = 1; i <= a; i++) {
			if(i % 3 == 0) {
				System.out.println("X");
			}else {
				System.out.println(i);
			}
		}
	}

}
