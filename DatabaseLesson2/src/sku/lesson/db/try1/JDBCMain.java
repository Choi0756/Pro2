package sku.lesson.db.try1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

public class JDBCMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JDBCMain jm = new JDBCMain();
		jm.testCRUD();
	}
	
	public void testCRUD() {
	      // String sql = "insert into gisa values(990002, 'addx', 17, 29, 16, 49, 43, 154, 'C', 'A', 'C')";
	      // 1000개의 데이터를 집어넣을려고 한다. 속성값이 너무 많아 -> 구현이 힘듦 -> 프리페어드스테이트먼트
	      GisaDAO dao = new GisaDAO();
	      try {
	    	 //sql = "delete from gisa where StdNo = 990002";
	         //boolean flag = dao.delete(sql);
	    	 //Student student = new Student(990005, "addx", 17, 29, 16, 49, 43, 154, "C", "A","C");
	    	 //boolean flag = dao.insert(student); 
	         boolean flag = dao.insertNew(this.makeData());
	    	  if(flag) {
	            System.out.println("success");
	         }else {
	            System.out.println("fail");
	         } 
	        	 
	      } catch (Exception e) {
	         // TODO Auto-generated catch block
	         e.printStackTrace();
	      }
	      
	   }
	
	private ArrayList<Student> makeData(){
		ArrayList<Student> list = null;
		//file 에 접속해서 생성.
		File file = new File("Abc1115.csv");
		try {
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			String line = null;
			list = new ArrayList<Student>();
			while((line = br.readLine()) != null){
				String temp[] = line.split(",");
				
				int stdNo = Integer.parseInt(temp[0].trim());
				String email = temp[1];
				int kor = Integer.parseInt(temp[2].trim());
				int eng = Integer.parseInt(temp[3].trim());
				int math = Integer.parseInt(temp[4].trim());
				int sci = Integer.parseInt(temp[5].trim());
				int hist = Integer.parseInt(temp[6].trim());
				int total = Integer.parseInt(temp[7].trim());
				String mrgCode = temp[8];
				String accCode = temp[9];
				String locCode = temp[10];
				Student student = new Student(stdNo, email, kor, eng, math, sci, hist, total, mrgCode,
						accCode, locCode);
				list.add(student);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return list;
	}
	
	
}
