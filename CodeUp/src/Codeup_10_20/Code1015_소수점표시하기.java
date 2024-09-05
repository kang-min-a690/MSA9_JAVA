package Codeup_10_20;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Code1015_소수점표시하기 {
	public static void main(String[] args) {
		//입력문 
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		
		DecimalFormat df = new DecimalFormat("#.00");
		
		//출력문
		System.out.println(df.format(a));
		sc.close();
		
	}

}
