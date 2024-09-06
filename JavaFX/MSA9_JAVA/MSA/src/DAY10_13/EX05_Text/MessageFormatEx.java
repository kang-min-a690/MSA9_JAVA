package DAY10_13.EX05_Text;

import java.text.MessageFormat;
import java.util.Scanner;

public class MessageFormatEx {
	
	public static void main(String[] args) {
		//MessageFormat
		//문자열 형식을 만듥, 문자열에 따라 들어가 ㄹ 자리를
		//{k} 로 표시 하여 형식을 지정한다. ( K : 0~ )
		// \n :한 줄 개행 (엔터)
		// \t :탭
		
		String text = "아이디 : {0} \n 비밀번호 : {1}";
		Scanner sc = new Scanner(System.in);
		System.out.println("아이디 : ");
		String id = sc.nextLine();
		System.out.println("비밀번호");
		String pw = sc.nextLine();
		String login = MessageFormat.format(text, id, pw);
		// ... :가변 매개 변수
		// 매개 변수의 개수를 변화시키면서 사용할수 있도록 해주는 기호
		//전달 받는 메소드에서는 가변 매개변수를 하나의 배열로 전달받는다.
		// 마지막 매개변수에 정의해야한다.
		
		System.out.println(login);
		System.out.println();
		
		String[] studendtInfo = { "강민아", "14학번", "우주최강","마음만은20살"};
		String studentFormat = "이름 : {0} \n"
							+" 학번 : {1} \n"
							+" 전공 : {2} \n"
							+" 나이 : {3} \n"
							;
		
		String student = MessageFormat.format(studentFormat, studendtInfo);
		System.out.println(student);
		sc.close();
				
	 }

}
