package Codeup_70_90;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Code1086_파일용량소수점계산 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long w = sc.nextInt();
		long h = sc.nextInt();
		long b = sc.nextInt();
		//long타입으로 입력
		
		double bit =(double)(w * h *b) / 8;
		// double보다 큰 정수로 입력시 오류날수있으므로
		//long을 double로 형변환 해줘야 함
		double kb = bit / 1024;
		double mb = kb / 1024;
		
		DecimalFormat df = new DecimalFormat("0.00");
		//#.### 을 0.00으로 변경하여 항상 소수점 이하 두자리까지 출력하도록설정
		//값이 0.00043 여도 출력은0.00이 되게.
		//#.### 이면 0.005가 출력이됨
		
		System.out.println(df.format(mb)+ " MB");
		sc.close();
		
	}

}
