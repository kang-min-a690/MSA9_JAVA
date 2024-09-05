package Codeup_41_60;

import java.util.Scanner;

public class Code1064_삼항중첩연산 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int result = ( a < b ? a : b ) < c ? ( a < b ? a : b ) : c ;
		
		System.out.println(result);
		sc.close();
	}

}
