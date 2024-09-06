package DAY10_13.EX04_Time;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class LocalDateTimeEx {
	//2024년 8월 23일 10시 0분 0초
	public static void main(String[] args) {
		
	 //LocalDateTime 
		// 날짜와 시간을 다루는 클래스, 타임존을 포함하지않고 시스템의 날짜 /시간을 표현
		LocalDateTime todayDateTime = LocalDateTime.of(2024, 8, 23, 10, 0, 0);
		System.out.println("오늘 : " + todayDateTime);
		
		//2025년 2월 10일 18시 20분 0초
		LocalDateTime endDateTime = LocalDateTime.of(2025, 2,10 , 18, 20, 0);
		System.out.println("종강 : " + endDateTime);
		
		//A.isBeFore(B)			: A가 B보다 이전이면, ture, 아니면 False
		//A.isEqual(B)			: A가 B보다 같으면, ture, 아니면 False
		//A.isAfter(B)			: A가 B보다 이후이면, ture, 아니면 False
		
		if(todayDateTime.isBefore(endDateTime) ) {
			System.out.println("교육이 진행 중 ");
		}
		else if (todayDateTime.isAfter(endDateTime)) {
			System.out.println("교육과정 종료");
		}
		else {
			System.out.println("즐거은 종강");
		}
		
		// untill()
		// LocalDateTime 객체의 날짜/시간 부터 인자로 지정한 객체의 날까지 남으시간을 반환하는 메소드
		//ChronoUnit 날짜 시간의 단위를 나타내는 열거타입 (enum)
		// 날짜 시간 차이를 구하거나 조작하는데 사용
		
		long remainYear = todayDateTime.until(endDateTime, ChronoUnit.YEARS);
		long remainMonth = todayDateTime.until(endDateTime, ChronoUnit.MONTHS);
		long remainDay = todayDateTime.until(endDateTime, ChronoUnit.DAYS);
		long remainHour = todayDateTime.until(endDateTime, ChronoUnit.HOURS);
		long remainMinute = todayDateTime.until(endDateTime, ChronoUnit.MINUTES);
		long remainSecond = todayDateTime.until(endDateTime, ChronoUnit.SECONDS);
		
		System.out.println("오늘 부터 종강 까지");
		System.out.println("남은 연도 " + remainYear);
		System.out.println("남은 개월 :" + remainMonth);
		System.out.println("남은 일수 : "+ remainDay);
		System.out.println("남은 시 : " +remainHour);
		System.out.println("남은 분 :" + remainMinute);
		System.out.println("남은 초 : " + remainSecond);
		
		// between()
		// - ChronoUnit.상수.between(시작일자, 종료일자)
		// : 시작일자와 종료일자의 남은 시간을 지정한 상수 단위에 맞게 변환하는 메소드
		remainYear = ChronoUnit.YEARS.between(todayDateTime, endDateTime);
		remainMonth = ChronoUnit.MONTHS.between(todayDateTime, endDateTime);		
		remainDay = ChronoUnit.DAYS.between(todayDateTime, endDateTime);
		remainHour = ChronoUnit.HOURS.between(todayDateTime, endDateTime);
		remainMinute = ChronoUnit.MINUTES.between(todayDateTime, endDateTime);
		remainSecond = ChronoUnit.SECONDS.between(todayDateTime, endDateTime);
		
		System.out.println("남은 년도 : " + remainYear);
		System.out.println("남은 개월 수 : " + remainMonth);
		System.out.println("남은 일 수 : " + remainDay);
		System.out.println("남은 시 : " + remainHour);
		System.out.println("남은 분 : " + remainMinute);
		System.out.println("남은 초 : " + remainSecond);
		System.out.println();
		
		
		//날짜 시간 조작
		
		LocalDateTime now =LocalDateTime.now();
		
		System.out.println("현재 시간 날짜 : " + now);
		
		LocalDateTime tagetTime = now.plusYears(1)
									.plusMonths(5)
									.plusDays(20)
									.plusHours(5)
									.plusMinutes(30)
									.plusSeconds(15)
									.minusYears(5)
									//minusXXX()
									;
									//빌더패턴, (메소드 체이닝)
		System.out.println("변경 날짜 / 시간 : " + tagetTime);
		
	}


	}


