package sk.pre.java.day4;

public class CodePractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CodePractice cp = new CodePractice();
		cp.practice1();
	}
	
	public void practice1() {
		//p160 분리메소드 
		String data1 = "990001,addx, 17, 29, 16, 49, 43,154,C,A,C";
		//              0123456789012345678901234567890
		String data2 = "990002,stch, 30,  9, 48, 25, 81,193,C,A,A";
		String data3 = "990003,gali, 93, 60,  6, 84, 36,279,A,C,A";
		String data4 = "990004,miat, 73, 22, 48, 24, 72,239,B,C,C";
		String data5 = "990005,oran, 33, 38, 59, 58, 28,216,C,B,A";
		
		String[] data = {data1,data2,data3,data4,data5};
		for(int i=0;i<5;i++) {
			String[] temp = data[i].split(",");
			int stdNo = Integer.parseInt(temp[0]);			
			int kor = Integer.parseInt(temp[2].trim());			
			int eng = Integer.parseInt(temp[3].trim());			
			int math = Integer.parseInt(temp[4].trim());		
			int sci = Integer.parseInt(temp[5].trim());			
			int hist = Integer.parseInt(temp[6].trim());			
			int total = Integer.parseInt(temp[7].trim());			
			Student student = new Student(stdNo, temp[1], kor, eng, math, sci, 
					hist, total, temp[8], temp[9], temp[10]);
			System.out.println(student);
			//System.out.println(stdNo);
		}
		
	}
	
	public void practice2() {
		//p160 분리메소드 
		String data1 = "990001addx 17 29 16 49 43154CAC";
		//              0123456789012345678901234567890
		String data2 = "990002stch 30  9 48 25 81193CAA";
		String data3 = "990003gali 93 60  6 84 36279ACA";
		String data4 = "990004miat 73 22 48 24 72239BCC";
		String data5 = "990005oran 33 38 59 58 28216CBA";
		
		String[] data = {data1,data2,data3,data4,data5};
		for(int i=0;i<5;i++) {
			String temp1 = data[i].substring(0, 6);
			int stdNo = Integer.parseInt(temp1);
			String temp2 = data[i].substring(6,10);
			String temp3 = data[i].substring(10,13);
			int kor = Integer.parseInt(temp3.trim());
			String temp4 = data[i].substring(13,16);
			int eng = Integer.parseInt(temp4.trim());
			String temp5 = data[i].substring(16,19);
			int math = Integer.parseInt(temp5.trim());
			String temp6 = data[i].substring(19,22);
			int sci = Integer.parseInt(temp6.trim());
			String temp7 = data[i].substring(22,25);
			int hist = Integer.parseInt(temp7.trim());
			String temp8 = data[i].substring(25,28);
			int total = Integer.parseInt(temp8.trim());
			String temp9 = data[i].substring(28,29);
			String temp10 = data[i].substring(29,30);
			String temp11 = data[i].substring(30);
			Student student = new Student(stdNo, temp2, kor, eng, math, sci, hist, total, temp9, temp10, temp11);
			System.out.println(student);
			//System.out.println(stdNo);
		}
		
	}

}
