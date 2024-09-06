package DAY10_13.EX02_Util;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CaiendarEx2 {
	
	public static void main(String[] args) {
		//현재 날짜 시간 정보로 객체 생성
		
		Calendar cal = Calendar.getInstance();
		
		System.out.println( cal.get(Calendar.YEAR));
		System.out.println( cal.get(Calendar.MONDAY) + 1);
		System.out.println( cal.get(Calendar.DAY_OF_MONTH));
		
		//날짜 형식을 지정하는 방법
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd(E) HH:mm:ss");
		// sdf.format(Date객체)
		// 지정한 날짜 형식에 맞게 데이트 잭체의 날짜시간 정보를 문자열로 반환하는 메소드
		
		String today = sdf.format(cal.getTime());
		System.out.println("현재 날짜/시간 : " + today);
		
		//현재 날짜/ 시간으롭터 n시간 n일 후는 언제?
		//10분흐
		
		cal.add(cal.MINUTE,10);
		String after10Min = sdf.format(cal.getTime());
		System.out.println("10분후 : " + after10Min);
		
		//1시감ㄴ후
		cal.add(cal.HOUR,10);
		String after1Hour = sdf.format(cal.getTime());
		System.out.println("1시간후 : " + after1Hour);
		
		//10일 후
		cal.add(cal.DAY_OF_MONTH,10);
		String after1DAy = sdf.format(cal.getTime());
		System.out.println("1일후 : " + after1DAy);
		
		//18일 전
		cal.add(cal.DAY_OF_MONTH, -18);
		String before18DAy = sdf.format(cal.getTime());
		System.out.println("18일전 : " + before18DAy);
		
		//50일 전
		cal.add(cal.DAY_OF_MONTH, -50);
		String before50DAy = sdf.format(cal.getTime());
		System.out.println("50일전 : " + before50DAy);
		
		
		Calendar cal2 = Calendar.getInstance();					//새로운 캘린더
		//50일 전 (roll)
		cal2.roll(cal.DAY_OF_MONTH, -50);
		String before50DAy2 = sdf.format(cal2.getTime());
		System.out.println("50일전 : " + before50DAy2);

		//add(날짜필드, 값) : 해당 날짜 데이터에서 날짜 필드의 값을 증감시키는 메소드
		//roll(날짜필드, 값) : 해당 날짜 데이터에서 날짜 필드의 값을 증감시키는 메소드
		//					*상위 날짜 필드에 영향을 주지 않는다.(년,월은 상위라 영향없고 일부터 바뀌는거)
	}

}
