package DAY10_13.EX02_Util;

import java.util.Calendar;

import java.text.SimpleDateFormat;


/**
 * 이번주 로또 추첨 일시를 구해보자
 * (조건)
 * 매일 새벽 6시부터 밤 24시까지 판매
 * 추첨일(토요일)에는 오후 8시에 판매 마감
 * 추첨일(토요일) 오후 8시부터 다음일 (일요일) 오전 6시까지 판매 정지
 * 
 * 
 * Q. 오늘 날짜 /시간을 기준으로 로도를 구매한다면,추첨일시는 언제인가
 * (출력)
 * 추첨일 : 2024/08/24 21:00:00
 * *구매할수없음, 시간바꾸기
 */

public class CalendarLotto {
	
	public static void main(String[] args) {
		
		
		//현재 날짜
		Calendar cal = Calendar.getInstance();
		//Calendar cal = Calendar.getInstance();
		//cal.set(2024,Calendar.OCTOBER, 6);
		
		//현재 요일
		int today = cal.get(Calendar.DAY_OF_WEEK); 		//1~7
				
		//매주 토요일 - 현재 요일
		int reSaturday = Calendar.SATURDAY - today;
		
		//토요일 설정
		cal.add(Calendar.DAY_OF_WEEK,reSaturday);
		
		

		//설정한 연,월,일,시,분,초
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd(E) HH:mm:ss");
		
		//출력문
		 String happyDay = sdf.format(cal.getTime());
		System.out.println("추첨일 : " + happyDay);
		
		
	}

}
