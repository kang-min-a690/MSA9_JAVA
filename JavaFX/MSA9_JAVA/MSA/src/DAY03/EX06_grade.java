package DAY03;

import java.util.Scanner;

public class EX06_grade {

	public static void main(String[] args) {
		// 학점을 입력받아, 점수 구간을 출력하시오.
		// A : 90~100 점 입니다.
		Scanner sc = new Scanner(System.in);
		System.out.println("학점 :");
		
		//스트링은 문자열을 나타낼떄 참조자료형(next)를 사용
		String grade = sc.next();
				
			switch (grade) {
			case "A":  System.out.println("90~100점 입니다."); break;
			case "B":  System.out.println("80~89점 입니다."); break;
			case "C":  System.out.println("70~79점 입니다."); break;
			case "D":  System.out.println("60~69점 입니다."); break;
			case "F":  System.out.println("60점 미만입니다."); break;
			default:   System.out.println("A~F 사이의 문자를 입력해 주세요"); break;
			}
			
			//문자열, 숫자, 문자, 정수 는 가능하지만 실수(float,double:소숫점)은 불가능하다
			
			sc.close();
	}

}
