package sk.pre.java.day5;

import java.util.Arrays;
import java.util.Date;

public class ServicePM {
	
	public void test3() {
		//Date, Calendar 객체 생성(Date, Calendar가 객체생성 방법이 틀림)
		//년, 월, 일, 시, 분, 초, 요일정보 출력하시오
		Date date = new Date(124,1,1);
		int year = date.getYear();
		int month = date.getMonth();
		int day = date.getDay(); //요일
		System.out.println(day);
		int day2 = date.getDate();
		int hour = date.getHours();
		int min = date.getMinutes();
		int sec = date.getSeconds();
		System.out.println((1900+year)+"/"+(month+1)+"/"+day2+" "+hour+":"+min+":"+sec);
		
	}
	
	
	
	public void test2() {
		String data1 = "990001,addx, 17, 29, 16, 49, 43,154,C,A,C";
		//               0123456789012345678901234567890
		String data2 = "990002,stch, 30,  9, 48, 25, 81,193,C,A,A";
		String data3 = "990003,gali, 93, 60,  6, 84, 36,279,A,C,A";
		//위의 3명의 학생정보를 2중배열을 이용하여 저장하는 코드를 작성하시오
		//학번,이메일,국어,영어,수학 점수만 저장한다.
		String[][] students = new String[3][4];
		String[] temp1 = data1.split(",");
		String[] temp2 = data2.split(",");
		String[] temp3 = data3.split(",");
		String[][] temps = {temp1,temp2,temp3};
		for(int i=0;i<3;i++) {
			for(int j=0;j<4;j++) {
				students[i][j] = temps[i][j];
			}
			System.out.println(Arrays.toString(students[i]));
		}
		//System.out.println(students[0][0]+""+students[0][1]+""+students[0][2]);
		
	}
	
	public void test1() {
		// 논리 연산 &&, ||
		// 윤년 판단
		// 4로 나누어 떨어지고 100으로 나누어 떨어지면 안된다.
		// 또는 400으로 나누어 떨어져야 한다.
		int year = 2000;
		if((year%4==0&&year%100!=0) || year%400==0) {
			System.out.println("윤년");
		}
	}
}
