package sk.pre.java.gisa;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class TestCenter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestCenter tc = new TestCenter();
		tc.startTest();
	}
	
	public void startTest() {
		ArrayList<Student> list = null;
		try {
			list = this.readyData();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Solution solution = new Solution();
		String answer1 = solution.solveQuestion1(list);
		this.printAnswer(1,answer1);
	}
	
	
	private void printAnswer(int i, String answer1) {
		// TODO Auto-generated method stub
		File file = new File("Ans"+i+".txt");
		//출력코드 작성
		System.out.println(i+","+answer1);
	}

	public ArrayList<Student> readyData() throws IOException{
		ArrayList<Student> list = null;
		File file = new File("Abc1115.csv");
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		String line = null;
		list = new ArrayList<Student>();
		while((line=br.readLine())!=null) {
			String[] temp = line.split(",");
			int stdNo = Integer.parseInt(temp[0].trim());
			String email = temp[1];
			int kor = Integer.parseInt(temp[2].trim());
			int eng = Integer.parseInt(temp[3].trim());
			int math = Integer.parseInt(temp[4].trim());
			int sci = Integer.parseInt(temp[5].trim());
			int hist = Integer.parseInt(temp[6].trim());
			int total = Integer.parseInt(temp[7].trim());
			String mgrCode = temp[8];
			String accCode = temp[9];
			String localCode = temp[10];
			Student student = new Student(stdNo, email, kor, eng, 
							math, sci, hist, total, mgrCode, accCode, localCode);
			list.add(student);
		}
		br.close();
		fr.close();
		
		return list;
	}

}
