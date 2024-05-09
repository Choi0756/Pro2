package gisa.basic.lesson.db;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestMain tm = new TestMain();
		tm.test();
	}
	
	public void test() {
		this.testStart2();
	}
	
	public void testStart2() {
	      GisaDAO gisa = new GisaDAO();
	      String queryAnswer1 ="";
	      String queryAnswer2 ="";
	      String queryAnswer3 ="";
	      
	      StringBuilder sb = new StringBuilder("select count(*)");
	      sb.append(false);
	      sb.append(false);
	      sb.append(false);
	      sb.append(false);
	      sb.append(false);
	      sb.append(false);
	      sb.append(false);
	      sb.append(false);
	      sb.append(false);
	      sb.append(false);
	      String queryAnswer4 =sb.toString();
	      
	      String answer = null;
	      
	      answer = gisa.solveQusetion1(queryAnswer1);
	      this.writeAnswer(answer, 1);
	      
	      answer = gisa.solveQusetion2(queryAnswer2);
	      this.writeAnswer(answer, 2);
	      
	      answer = gisa.solveQusetion3(queryAnswer3);
	      this.writeAnswer(answer, 3);
	      
	      answer = gisa.solveQusetion4(queryAnswer4);
	      this.writeAnswer(answer, 4);
	   }

	public void testStart() {
		ArrayList<Student> list = this.makeData();
		String answer = null;
		Solution solution = new Solution();
		answer = solution.solveQusetion1(list);
		this.writeAnswer(answer, 1);
		answer = solution.solveQusetion2(list);
		this.writeAnswer(answer, 2);
		answer = solution.solveQusetion3(list);
		this.writeAnswer(answer, 3);
		answer = solution.solveQusetion4(list);
		this.writeAnswer(answer, 4);
		
	}
	
	public ArrayList<Student> makeData() {
		ArrayList<Student> list = null;
		GisaDAO dao = new GisaDAO();
		String sql = "select * from gisa";
		list = dao.select(sql);
		return null;
	}
	
	public ArrayList<Student> makeDataFromFile(){
		ArrayList<Student> list = null;
		
		return null;
	}
	
	
	
	public void writeAnswer(String answer, int number) {
		System.out.println("답안작성");
		File file = new File("Ans" + number + ".txt");
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
