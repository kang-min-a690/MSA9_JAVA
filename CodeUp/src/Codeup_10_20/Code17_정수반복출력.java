package Codeup_10_20;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Code17_정수반복출력 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		DecimalFormat df = new DecimalFormat("0");
		
		for (int i = 1; i <= 3; i++) {
			System.out.print(df.format(a)+ " ");
			sc.close();
		}
	}

}
