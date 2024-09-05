package Codeup_21_40;

import java.util.Scanner;

public class Code1032_8진수를10진수로 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//입력문
		String input = sc.nextLine();
		
		//글자 입력문이 8진수 라는걸 알려주기
		int var = Integer.parseInt(input , 8); 
		
		
		//println은 기본적으로 10진수로 해석하여 출력함
		System.out.println(var);
		sc.close();
	}
	

}
