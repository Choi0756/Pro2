package sk.pre.java.calendar;

import java.util.Calendar;
import java.util.Date;

public class MyCalendar {
	
	//1900년 이후의 년과 월에 대하여 출력할 수 있어야 한다.(1~12월 원하는 달을 볼 수 있어야 한다)
	//Calendar 객체 이용
	public void viewMonthLastVersion(int year,int month) {
		System.out.println("\t\t\t2024년 "+month+"월");
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		////////////////////// Calendar 객체 생성 및 이용 /////////////////
		Calendar cal = Calendar.getInstance();
		cal.set(year, month-1,1);
		///////////////////// 변경 //////////////////
		int space = cal.get(Calendar.DAY_OF_WEEK)-1;
		int lastDay = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		
		
		for(int i=0;i<space;i++) {
			System.out.print("\t");
		}
		for(int i=0;i<lastDay;i++) {
			int day = i+1;
			System.out.print(day+"\t");
			if((space+day)%7==0) {
				System.out.println();
			}
		}
			
	}
		
	//1900년 이후의 년과 월에 대하여 출력할 수 있어야 한다.(1~12월 원하는 달을 볼 수 있어야 한다)
	public void viewMonthEveryYear(int year,int month) {
		System.out.println("\t\t\t2024년 "+month+"월");
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		////////////////////// 추가 /////////////////
		int[] lastDays = {31,28,31,30,31,30,31,31,30,31,30,31};
		Date date = new Date(year-1900,month-1,1); //2024/2/1
		int dateSpace = date.getDay();
		if(month==2) {
			//윤년체크
			if((year%4==0&&year%100!=0)||year%400==0) {
				lastDays[1] = 29;
			}
		}
		///////////////////// 변경 //////////////////
		int space = dateSpace;
		int lastDay = lastDays[month-1];
		
		
		for(int i=0;i<space;i++) {
			System.out.print("\t");
		}
		for(int i=0;i<lastDay;i++) {
			int day = i+1;
			System.out.print(day+"\t");
			if((space+day)%7==0) {
				System.out.println();
			}
		}
			
	}
		
	//1~12월 출력(원하는 달을 볼 수 있어야 한다)
	public void viewMonthIn2024(int month) {
		System.out.println("\t\t\t2024년 "+month+"월");
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		////////////////////// 추가 /////////////////
		int[] spaces = {1,4,5,1,3,6,1,4,0,2,5,0};
		int[] lastDays = {31,29,31,30,31,30,31,31,30,31,30,31};
		///////////////////// 변경 //////////////////
		int space = spaces[month-1];
		int lastDay = lastDays[month-1];
		
		
		for(int i=0;i<space;i++) {
			System.out.print("\t");
		}
		for(int i=0;i<lastDay;i++) {
			int day = i+1;
			System.out.print(day+"\t");
			if((space+day)%7==0) {
				System.out.println();
			}
		}
			
	}
	
}
