package sk.pre.java.day5;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main main = new Main();
		main.startPM();
	}
	public void start() {
		Service service = new Service();
		service.test6();
	}
	
	public void startPM() {
		ServicePM pm = new ServicePM();
		pm.test3();
	}
	
	public void test10() {
		String data1 = "990001,addx, 17, 29";
		//              0123456789012345678901234567890
		String data2 = "990002,stch, 30,  9, 48";
		String data3 = "990003,gali, 93, 60,  6";
		//위의 3명의 학생정보를 2중배열을 이용하여 저장하는 코드를 작성하시오
		//학번,이메일,국어,영어,수학 점수만 저장한다.
		String[][] students = {data1.split(","),data2.split(","),data3.split(",")};
		for(String[] stu : students) {
			System.out.println(Arrays.toString(stu));
		}
		
		String[][] temp = new String[3][4];
		System.out.println(temp.length);
		System.out.println(temp[0].length);
	}

}
