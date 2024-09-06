package DAY10_13.EX04_Time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.TimeZone;

/**
 * LocalDate
 * LocalTmee
 * LocalDateTime
 * ZonedDateTime
 * 
 */
public class ZonedDateTimeEx {
		
	public static void main(String[] args) {
		// LocalDate 			:날짜를 다루는크래스
		System.out.println("[LocalDate]");
		LocalDate nowdate = LocalDate.now();
		System.out.println("현재 날짜 : " + nowdate);
		
		LocalDate endDate = LocalDate.of(2025, 2, 10);
		
		//LocalTime			:시간은 다루는 크랠래스
		System.out.println("[LocalTime]");
		LocalTime nowTime = LocalTime.now();
		System.out.println("현재 날짜 : " + nowTime);
		
		LocalTime endTime = LocalTime.of(18, 20, 0);
		System.out.println("종료 시간 : " + endTime);
		
		// LocalDateTime 			:날짜 시간를 다루는크래스
		System.out.println("[LocalDateTime]");
		LocalDateTime nowdateTime = LocalDateTime.now();
		System.out.println("현재 날짜 : " + nowdateTime);
		
		LocalDateTime endDateTime = LocalDateTime.of(endDate, endTime);
											//LocalDateTime.of(2025,2,10,18,20,0);
		System.out.println("종료 날짜 시간 : " + endDateTime);
		
		// ZoneDateTime
		// 타임존을 포함, 날짜 시간 을 다루는 클래스
		// 타임존 : 전세계 특정 지역이 사용하는 표준시간
		// 협정 세계시와 - 국제 표준시
		// 서울 Asia/Seoul
		// 뉴욕 America/ New_york
		// 일본 japan
		// 로마 Europe/Rome
		
		System.out.println("[ZonedDateTime]");
		
		ZonedDateTime utcDate = ZonedDateTime.now(ZoneId.of("UTC"));
		System.out.println("협정 세계시 : " + utcDate);
		
		ZonedDateTime SeoulDateTime = ZonedDateTime.now(ZoneId.of("Asia/Seoul"));
		System.out.println("서울 표준시 : " + SeoulDateTime );
		
		ZonedDateTime newYorkDateTime = ZonedDateTime.now(ZoneId.of("America/New_york"));
		System.out.println("뉴욕 표준시 : " + newYorkDateTime );
		
		ZonedDateTime japanDateTime = ZonedDateTime.now(ZoneId.of("japan"));
		System.out.println("일본 표준시 : " + japanDateTime );
		
		ZonedDateTime romeDateTime = ZonedDateTime.now(ZoneId.of("Europe/Rome"));
		System.out.println("로마 표준시 : " + romeDateTime );
		
		
		// 운년
		// 1년 365.25일 이라고,0.25 x 4 = 1 일을 매 4년 마다 추가해서 사용
		LocalDate ld = LocalDate.now();
		// LocalDate.ld.isLeapYear() : 윤년이면 true, 아니면 false 반환하는ㅁ ㅔ소드
		if ( ld.isLeapYear() ) {
			System.out.println("올해는 윤년 : 2월 29일 까지");
		}
		else {
			System.out.println("올해는 평년 : 2월 28일 까지");
		}
		
		//사용 가능한 타임존 id
		String[] timeZoneId = TimeZone.getAvailableIDs();
		
		for (String zoneId : timeZoneId) {
			System.out.println(zoneId);
		}
	
	}
}
