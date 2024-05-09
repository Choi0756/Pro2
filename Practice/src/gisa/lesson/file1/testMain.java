package gisa.lesson.file1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class testMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		testMain tm = new testMain();
		tm.testStart();
	}
	
	public void testStart() {
		ArrayList<Student> list = this.makeData();
		Solution solution = new Solution();
	}
	
	public ArrayList<Student> makeData(){
		ArrayList<Student> list = null;
		File file = new File("Abc1115.txt");
		try {
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			String line = null;
			list = new ArrayList<Student>();
			while((line = br.readLine()) != null) {
				String[] temp = line.split(",");
				int stdNo = Integer.parseInt(temp[0]);
				String email = temp[1];
				int kor = Integer.parseInt(temp[2]);
				int eng = Integer.parseInt(temp[3]);
				int math = Integer.parseInt(temp[4]);
				int sci = Integer.parseInt(temp[5]);
				int hist = Integer.parseInt(temp[6]);
				int total = Integer.parseInt(temp[7]);
				int mrgCode = Integer.parseInt(temp[8]);
				int accCode = Integer.parseInt(temp[9]);
				int locCode= Integer.parseInt(temp[10]);
				
				Student student = new Student(stdNo, email, kor,  eng,  math,  sci,  hist, total, mrgCode,
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
	
	public void writeAnswer(int number , String answer) {
		System.out.println("답안작성");
		
		File file = new File("Ans"+number+".txt");
		try {
			FileWriter fw = new FileWriter(file);
			PrintWriter pw = new PrintWriter(fw);
			pw.println();
			fw.close();
			pw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
