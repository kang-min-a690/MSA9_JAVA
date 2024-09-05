package Codeup_41_60;

import java.util.Scanner;

public class Code1065_if중첩 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int input = sc.nextInt();
		
		//조건문
		if ( input < 0) {
			System.out.println("minus");
		}else { System.out.println("plus");}
		if ( input % 2 == 0 ) {
			System.out.println("even");
		}else { System.out.println("odd");}

		sc.close();
	}
}
