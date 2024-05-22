package time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeMain {
    public static void main(String[] args) {
        LocalDateTime nowDt = LocalDateTime.now();
        LocalDateTime ofDt = LocalDateTime.of(2016, 8, 16, 8, 10, 1);

        System.out.println("현재 날짜 시간 : "+ nowDt);
        System.out.println("지정 날짜 시간 : "+ ofDt);

        // 날짜 시간 분리
        LocalDate localDate = ofDt.toLocalDate();
        LocalTime localTime = ofDt.toLocalTime();

        System.out.println("local Date : "+ localDate);
        System.out.println("local Time : "+ localTime);

        // 날짜와 시간 합체
        LocalDateTime localDateTime = LocalDateTime.of(localDate, localTime);
        System.out.println("localDateTime : "+ localDateTime);

        // 계산(불변)
        LocalDateTime ofDtPlus = ofDt.plusDays(1000);
        System.out.println("지정 날짜 + 1000day : "+ ofDtPlus);

        LocalDateTime ofDtPlusYear = ofDt.plusYears(5);
        System.out.println("지정 날짜 + 5year : "+ ofDtPlusYear);

        // 비교
        System.out.println("현재 날짜 시간이 지정 날짜 시간보다 이전인가? "+ nowDt.isBefore(ofDt));
        System.out.println("현재 날짜 시간이 지정 날짜 시간보다 이후인가? "+ nowDt.isAfter(ofDt));
        System.out.println("현재 날짜 시간이 지정 날짜 시간이 같은가? "+ nowDt.isEqual(ofDt));
    }
}
