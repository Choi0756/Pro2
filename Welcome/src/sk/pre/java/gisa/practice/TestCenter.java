package sk.pre.java.gisa.practice;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class TestCenter {

	public static void main(String[] args) { // 실행. 
		// TODO Auto-generated method stub
		TestCenter tc = new TestCenter();
		try {
			tc.startTest();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void startTest() throws IOException {
		Solution solution = new Solution();
		String answer = solution.solveQuestion1(this.readyData());
		this.printAnswer(1, answer); 
		answer = solution.solveQuestion2(this.readyData());
		this.printAnswer(2, answer);
	}
	
	
	private void printAnswer(int i, String answer1) throws IOException {
		// TODO Auto-generated method stub
		File file = new File("Ans"+i+".txt");
		//출력코드 작성
		System.out.println(i+","+answer1);
		// 출력스트림 연결 (파일, 문자열저장)
		FileWriter fw = new FileWriter(file);//append 여부 추가정보
		PrintWriter pw = new PrintWriter(fw);
		
		pw.println(answer1);
		pw.close();
		fw.close();
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
