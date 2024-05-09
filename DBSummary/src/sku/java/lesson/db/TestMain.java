package sku.java.lesson.db;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestMain tm = new TestMain();
		tm.testCRUD();
	}
	
	public void testStart() {
		ArrayList<Student> list = this.makeDataFromFile();
		String answer = null;
		Solution solution = new Solution();
		
		answer = solution.solveQuestion1(list);
		this.writeAnswer(answer, 1);
		answer = solution.solveQuestion2(list);
		this.writeAnswer(answer, 2);
		answer = solution.solveQuestion3(list);
		this.writeAnswer(answer, 3);
		answer = solution.solveQuestion4(list);
		this.writeAnswer(answer, 4);
		
	}
	
	public void testCRUD() {
		GisaDAO dao = new GisaDAO();
		try {
			boolean flag = dao.insert(this.makeDataFromFile());
			if(flag) {
				System.out.println("success");
			} else {
				System.out.println("fail");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public ArrayList<Student> makedata() {
		ArrayList<Student> list = null;
		GisaDAO dao = new GisaDAO();
		String sql = "select * from gisa";
		list = dao.select(sql);
		return list;
	} 
	
	public ArrayList<Student> makeDataFromFile(){
		ArrayList<Student> list = null;
		File file = new File("Abc1115.csv");
		try {
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			String line = null;
			list = new ArrayList<Student>();
			while((line = br.readLine()) != null) {
				String[] temp = line.split(",");
				int stdNo = Integer.parseInt(temp[0].trim());
				String email = temp[1].trim();
				int kor = Integer.parseInt(temp[2].trim());
				int eng = Integer.parseInt(temp[3].trim());
				int math = Integer.parseInt(temp[4].trim());
				int sci = Integer.parseInt(temp[5].trim());
				int hist = Integer.parseInt(temp[6].trim());
				int total = Integer.parseInt(temp[7].trim());
				String mrgCode = temp[8].trim();
				String accCode = temp[9].trim(); 
				String locCode = temp[10].trim();
				
				Student student = new Student(stdNo, email, kor, eng, math, sci, hist, total, mrgCode,
						accCode, locCode);
				
				list.add(student);
			}
			
			fr.close();
			br.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;
		
	}
	
	public void writeAnswer(String answer,int number) {
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
