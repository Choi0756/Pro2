package sk.pre.java.day7;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TestCalendar {
	public final static int FULL_DATE_TIME = 1;
	public final static int DATE_ONLY = 2;
	public final static int TIME_ONLY = 3;
	
	public String getDateTimeInfo(DateTimeInfo kindOfInfo) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String now = sdf.format(new Date());
		//날짜시간, 날짜, 시간 3종류의 정보를 제공
		
		if(kindOfInfo==DateTimeInfo.FULL_DATE_TIME) {
			//전체정보
		} else if(kindOfInfo==DateTimeInfo.DATE_ONLY) {
			//날짜정보
			now = now.split(" ")[0];
		} else if(kindOfInfo==DateTimeInfo.TIME_ONLY) {
			//시간정보
			now = now.split(" ")[1];
		}
		
		return now;
	}
	
	public String getDateTimeInfoOld(int kindOfInfo) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String now = sdf.format(new Date());
		//날짜시간, 날짜, 시간 3종류의 정보를 제공
		
		if(kindOfInfo==TestCalendar.FULL_DATE_TIME) {
			//전체정보
		} else if(kindOfInfo==TestCalendar.DATE_ONLY) {
			//날짜정보
			now = now.split(" ")[0];
		} else if(kindOfInfo==TestCalendar.TIME_ONLY) {
			//시간정보
			now = now.split(" ")[1];
		}
		
		return now;
	}
	
	public void test3() {
		//날짜 시간에 대한 포맷 패턴
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String now = sdf.format(new Date());
		System.out.println(now);
	}
	
	public void test2() {
		Calendar cal = Calendar.getInstance();
		cal.set(2024, 1,1); 
		int date = cal.get(Calendar.DAY_OF_WEEK);
		System.out.println(date); // space = date - 1;
		int lastDay = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println(lastDay);
	}
	public void test1() {
		//Calendar 클래스 연습 page533
		// 1. Calendar 객체생성
		Calendar cal = Calendar.getInstance();
		int year = cal.get(Calendar.YEAR);
		System.out.println(year);
		int month = cal.get(Calendar.MONTH);
		System.out.println(month);
		int day = cal.get(Calendar.DAY_OF_MONTH);
		System.out.println(day);
		int date = cal.get(Calendar.DAY_OF_WEEK);
		System.out.println(date);
		int hour = cal.get(Calendar.HOUR_OF_DAY);
		System.out.println(hour);
		int min = cal.get(Calendar.MINUTE);
		System.out.println(min);
		int sec = cal.get(Calendar.SECOND);
		System.out.println(sec);
	}
}
