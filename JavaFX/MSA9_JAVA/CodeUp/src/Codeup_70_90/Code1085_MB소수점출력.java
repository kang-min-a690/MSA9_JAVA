package Codeup_70_90;

import java.text.DecimalFormat;
import java.util.Scanner;


public class Code1085_MB소수점출력 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long h = sc.nextInt();
		long b = sc.nextInt();
		long c = sc.nextInt();
		long s = sc.nextInt();
		//int를 쓰면 오버플로우 현상
		//int사용시 특정값이 너무 작아져 음수가 될수있음
		
		double bit = (double)(h * b * c * s) / 8;
		
		double kb = bit / 1024; 
		
		double mb = kb / 1024; 
		
		DecimalFormat df = new DecimalFormat("#.#");
		//#.0은 소숫점 한자리까지 출력,(0.05MB)인경우는 반올림 안될수도있음
		// 두자리수 이상의 소수점은 #.00 또는 #.### 으로 사용
		System.out.println(df.format(mb) + " MB");
		
		sc.close();
	}
}
