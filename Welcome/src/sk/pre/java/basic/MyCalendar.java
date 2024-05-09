package sk.pre.java.basic;

public class MyCalendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 new MyCalendar().viewMonth();
	}
	
	public void viewMonthIn2024() {
		System.out.println("\t\t\t2024년 9월");
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		int space = 4;
		int lastDay = 29;
		for(int i=0;i<space;i++) {
			System.out.print("\t");
		}
		for(int i=0;i<lastDay;i++) {
			int day = i+1;
			System.out.print(day+"\t");
			//if(day==7||day==14||day==21||day==28) {
			if((space+day)%7==0) {
				System.out.println();
			}
		}
			
	}
	public void viewMonth() {
		System.out.println("\t\t\t2024년 9월");
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		int space = 4;
		int lastDay = 29;
		for(int i=0;i<space;i++) {
			System.out.print("\t");
		}
		for(int i=0;i<lastDay;i++) {
			int day = i+1;
			System.out.print(day+"\t");
			//if(day==7||day==14||day==21||day==28) {
			if((space+day)%7==0) {
				System.out.println();
			}
		}
			
	}
	public void viewMonth2() {
		System.out.println("\t\t\t2024년 9월");
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		System.out.println("1\t2\t3\t4\t5\t6\t7");
		System.out.println("8\t9\t10\t11\t12\t13\t14");
		System.out.println("15\t16\t17\t18\t19\t20\t21");
		System.out.println("22\t23\t24\t25\t26\t27\t28");
		System.out.println("29\t30\t31");		
	}

}
