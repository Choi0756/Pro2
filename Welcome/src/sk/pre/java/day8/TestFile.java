package sk.pre.java.day8;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestFile {
	public void connectFile() {
		File file = new File("Abc1115.csv");
		boolean flag = file.exists();
		if(flag) {
			System.out.println("file exists");
			System.out.println(file.length());
		} else {
			System.out.println("file not exists"); 
		}
	}
	
	
	public void reviewReadFile() {
		//Abc1115.csv를 읽어서 한줄씩 출력하는 코드 작성
		
	}
	
	public void readFile() throws FileNotFoundException,IOException {
		File file = new File("Abc1115.csv");
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		String line = null;
		while((line=br.readLine())!=null) {
			System.out.println(line);
		}
		br.close();
		fr.close();
	}
}
