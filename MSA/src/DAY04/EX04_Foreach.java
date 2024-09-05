package DAY04;

public class EX04_Foreach {

	public static void main(String[] args) {
		//배열 선언 및 초기화
		
		String[] week = {"월요일", "화요일", "수요일", "목요일", "금요일", "토요일", "일요일"};
		
		
		//foreach : ctrl + space
		//for (자료형 반복요소명 : 배열) {}
		for (String day : week) {
			System.out.println(day + " ");     //day : week[i]
		}
		System.out.println();
		//배열또는 컬렉션의 모든 요소를 순소대로 전부 반복문
		
		
		
		//기본 for문
		for (int i = 0; i < week.length; i++) {
			System.out.println( week[i] + " ");
		}
		System.out.println();
		//증감식으로 반복
		
	}

}
