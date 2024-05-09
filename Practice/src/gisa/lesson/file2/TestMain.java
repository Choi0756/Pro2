package gisa.lesson.file2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.sql.Connection;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestMain tm = new TestMain();
		tm.startLesson();
	}
	public void startLesson() {
		// System.out.println("start Lesson");
		this.testStart();
	}
	
	public void testStart() {
		ArrayList<Student> list = this.makeDataFromFile();
		String answer = null; 
		Solution solution = new Solution();
		answer = solution.solveQuestion1(list);
		this.writeAnswer(1, answer);
		answer = solution.solveQuestion2(list);
		this.writeAnswer(2, answer);
		answer = solution.solveQuestion3(list);
		this.writeAnswer(3, answer);
		answer = solution.solveQuestion4(list);
		this.writeAnswer(4, answer);
	}
	
	public ArrayList<Student> makeData(){
		ArrayList<Student> list = null;
		GisaDAO dao = new GisaDAO();
		String sql = "select * from gisa;";
		list = dao.select(sql);
		return list;
	}
	
	public ArrayList<Student> makeDataFromFile(){ // 이부분을 데이터베이스로 바꿀 예정
		ArrayList<Student> list = null;
		System.out.println("데이터를 생성해서 전달");
		//파일 연결
		//파일 안의 1000개의 라인에 각각 접근 -> 스트림 처리
		// 파일 리더를 하나하나 읽기 위해서 bufferedreader라는 스트림 필요.
		File file = new File("Abc1115.csv");
		
		try {
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			String line = null; // 한죽씩 읽어야함
			list = new ArrayList<Student>(); // 데이터를 만드는 코드
			while((line = br.readLine()) != null) {
				String[] temp = line.split(","); // 1000개의 자료를 하나씩 읽어들임
				// 숫자로 된 string형 자료들을 int형으로 바꿔주자.
				int stdNo = Integer.parseInt(temp[0]);
				String email = temp[1];
				int kor = Integer.parseInt(temp[2].trim()); // 스트링안에 숫자가아닌 문자가 들어있는 띄어쓰기 처리 trim()
				int eng = Integer.parseInt(temp[3].trim());
				int math = Integer.parseInt(temp[4].trim());
				int sci = Integer.parseInt(temp[5].trim());
				int hist = Integer.parseInt(temp[6].trim());
				int total = Integer.parseInt(temp[7].trim());
				String mgrCode = temp[8];
				String accCode = temp[9];
				String localCode = temp[10];
				Student student = new Student(stdNo, email, kor, eng, math, sci, hist, total, mgrCode, accCode, localCode);
				list.add(student);
				
				// System.out.println(student);
			}
			
			// String temp = line.substring(0,6);
			//System.out.println(line);
			//System.out.println(temp[0]);
			br.close();
			fr.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException ie) {
			ie.printStackTrace();
		}
		

		//각 라인을 11개의 데이터로 분리 -> String 분리 기술
		//Student  객체로 생성한 다음 List에 저장 -> ArrayList 사용
		return list;
	} 
	
	public void writeAnswer(int number, String answer) {
		System.out.println("답안작성");
		File file = new File("Ans"+number+".txt");
		try {
			FileWriter fw = new FileWriter(file);
			PrintWriter pw = new PrintWriter(fw);
			pw.println(answer);
			fw.close();
			pw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
