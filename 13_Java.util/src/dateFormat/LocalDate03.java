package dateFormat;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class LocalDate03 {
	public static void main(String[] args) {
		// 날짜만 얻어오기
		LocalDate today = LocalDate.now();
		
		System.out.println(today); // "년-월-일" 형태로 출력
		System.out.println(today.getYear() + "년");
		System.out.println(today.getMonth()); // 월을 영문으로 출력
		System.out.println(today.getMonthValue() + "월");
		System.out.println(today.getDayOfMonth() + "일");
		System.out.println("365일 중 " + today.getDayOfYear() + "일");
		System.out.println(today.getDayOfWeek()); // 일을 영문으로 출력
		System.out.println(today.getDayOfWeek().getValue()); // 일을 숫자로 출력(1 : 일요일)
		System.out.println();
		
		
		System.out.println("이달의 마지막 일은 " + today.lengthOfMonth());
		System.out.println("올해는 총 " + today.lengthOfYear() + "일");
		System.out.println("올해는 윤년인가? " + today.isLeapYear()); // true 와 false 값으로 출
		System.out.println();
		
		
		LocalDate endDay = LocalDate.of(2024, 5, 2); // 순서 : 년, 월, 일
		System.out.println(endDay); // 출력 : 년-월-일
		
		Period p = today.until(endDay); // 해당 일자까지 얼마나 남았는지 출력
		System.out.println(p.getMonths() + "개월 " + p.getDays() + "일 남음");
		System.out.println();
		
		
		// 시간만 얻어오기
		LocalTime time = LocalTime.now();
		System.out.println(time);
		System.out.println(time.getHour());
		System.out.println(time.getMinute());
		System.out.println(time.getSecond());
		System.out.println();
		
		LocalTime time2 = LocalTime.of(9, 30, 20);
		System.out.println(time2); // 출력 : 00:00:00 (시간:분:초)
		
		Duration d = Duration.between(time2, time); // 해당 시간에서 몇분 지났는지 계산해줌
		System.out.println(d.getSeconds()/60 + "분이 지남");
		
		System.out.println();
		
		
		// 날짜와 시간 모두 얻어오기
		// 출력 : 년-월-일T 시:분:초
		LocalDateTime todayNow = LocalDateTime.now();
		System.out.println(todayNow);
		
		System.out.println();
		
		// 출력 : 년-월-일T 시:분:초 UTC시간 [출력한 나라]
		ZonedDateTime seoulDT = ZonedDateTime.now(ZoneId.of("Asia/Seoul"));
		System.out.println(seoulDT);
		
		ZonedDateTime newYokDT = ZonedDateTime.now(ZoneId.of("America/New_York"));
		System.out.println(newYokDT);
	}
}
