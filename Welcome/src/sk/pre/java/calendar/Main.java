package sk.pre.java.calendar;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main main = new Main();
		//main.test1();
		//main.serviceViewCalendar();
		main.test();
	}
	
	public void test() {
		MyCalendar my = new MyCalendar();
		my.viewMonthEveryYear(2024, 2);
	}
	// 사용자가 원할때까지 계속 동작해야 한다.(한번 동작하면 다시 실행하면 안됨)
	// 사용자 요청(원하는 달)을 처리해야 한다. --> 데이터가 외부에서 입력된다.
	public void serviceViewCalendar() {
		
		Scanner scan = new Scanner(System.in);
		MyCalendar cal = new MyCalendar();
		boolean isStop = false;
		while(!isStop) {
			System.out.print("출력할 월을 입력하세요(전체월은 13) >>> ");
			int month = scan.nextInt();
			if(month==13) {
				for(int i=0;i<12;i++) {
					cal.viewMonthIn2024(i+1);
					System.out.println("\n");
				}
			} else {
				cal.viewMonthIn2024(month);
				System.out.println("\n");
			}
			System.out.print("계속하시겠습니까?[yes:1, no:0] >>> ");
			int command = scan.nextInt();
			if(command==0) {
				System.out.println("이용해 주셔서 감사합니다.");
				isStop = true;
				//break;
			}
		}
		scan.close();
	}
	
	public void test1() {
		MyCalendar cal = new MyCalendar();
		for(int i=0;i<12;i++) {
			cal.viewMonthIn2024(i+1);
			System.out.println("\n");
		}
		
	}
	
	

}
