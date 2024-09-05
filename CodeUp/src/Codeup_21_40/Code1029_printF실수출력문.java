package Codeup_21_40;

import java.util.Scanner;

public class Code1029_printF실수출력문 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double input = sc.nextDouble();
		
		//실수를 표현할때는 %.f\n 을해야하고 ,는 필수다
		System.out.printf("%.11f\n" , input);
		sc.close();
	}

}
