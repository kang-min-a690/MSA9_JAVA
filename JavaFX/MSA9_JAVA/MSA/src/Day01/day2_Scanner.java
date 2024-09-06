package Day01;

import java.util.Scanner;

// import : 외부 클래스 포함시키는 키워드 = import 패키지.클래스명;


//import 하는법
//1. 클래스|(커서) : ctrl + space
//2. 전체 import: Scanner sc = new Scanner(System.in) : ctrl + shift + o

public class day2_Scanner {
	
	public static void main(String[] args) {
		//scanner 객체생성 하면 import 나옴
		Scanner sc = new Scanner(System.in);
				
		System.out.println("a : ");
		int a = sc.nextInt();             // nextIn() : 정수 하나를 입력받는 메소드
				
		System.out.println("a : " + a);
		
		//close() : Scanner 객체를 메모리에서 해제하는 메소드 끝!!!
		sc.close();
		
		sc.nextInt();
		//Scanner 객체를 해제한 이후에는 더이상 입력을 받을 수 없다. **Scanner closed 에러메세지 출력**
		
	}

}
