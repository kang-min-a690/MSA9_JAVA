package DAY10_13.EX01_Lang;

public class StringBufferEx {
	
	public static void main(String[] args) {
		//Stringbuffer
		//문자열을 조작하는 클래스
		// 문자열 추가/수정/삭제하는 메소드를 제공
		
		StringBuffer sb = new StringBuffer("This");
		System.out.println(sb);
		
		//문자열 추가
		//append(추가문자열) : 문자열 마지막에 새문자열을 추가하는 메소드
		sb.append(" is Java");
		System.out.println(sb);
		
		//문자열 추가(index)
		//insert(index,추가문자열) : 지정한 index에 문자욜을 추가하는 메소드
		sb.insert(7," real");
		System.out.println(sb);
		
		//문자열 수정(대체)
		// replace(시작index, 끝index+1,"대체 문자열)
		//: 시작index끝index 까지 문자열을 대체 문자열로 수정하는 메소드
		sb.replace(8,12,"good");
		System.out.println(sb);
		
		//문자열 삭제
		//delete(시작index, 끝index+1)
		//시작 시작index, 끝index 까지 문자열을 삭제하는 매소드
		sb.delete(8,13);
		System.out.println(sb);
		
		//문자열 길이 ㄷ지정
		//setLengh(길이) : 문자열의 길이를 지정하는 메소드
		sb.setLength(4);
		System.out.println(sb);
	}

}
