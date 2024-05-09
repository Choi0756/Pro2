package sku.java.lesson.db;

import java.util.ArrayList;
import java.util.Collections;

public class Solution {
	public String solveQuestion1(ArrayList<Student> data) {
		String answer = null;
		
		ArrayList<Student> list2 = new ArrayList<Student>();
		for(Student student : data) {
			if(student.getLocCode().equals("B")) {
				list2.add(student);
			}
		}
		
		Collections.sort(list2, new GisaComparator());
		answer = String.valueOf(list2.get(4).getStdNo());
		return answer;
	}
	
	public String solveQuestion2(ArrayList<Student> data) {
		String answer = null;
		int max = 0;
		for(Student student : data) {
			if(student.getLocCode().equals("B")) {
				if(max < student.getKor() + student.getEng()) {
					max = student.getKor() + student.getEng();
				}
			}
		}
		answer = String.valueOf(max);
		return answer;
	}
	
	public String solveQuestion3(ArrayList<Student> data) {
		String answer = null;
		int sum = 0;
		for(Student student : data) {
			int point = 0;
			if(student.getEng() + student.getMath() >= 120) {
				if(student.getMgrCode().equals("A")) {
					point = 5;
				} else if (student.getMgrCode().equals("B")) {
					point = 15;
				} else {
					point = 20;
				}
				sum = student.getTotal() + point;
			}
		}
		
		answer = String.valueOf(sum);
		return answer;
	}
	
	public String solveQuestion4(ArrayList<Student> data) {
		String answer = null;
		int count = 0;
		for(Student student : data) {
			int point = 0;
			if(student.getAccCode().equals("A") || student.getAccCode().equals("B")) {
				if(student.getLocCode().equals("A")) {
					point = 5;
				} else if(student.getLocCode().equals("B")) {
					point = 10;
				} else {
					point = 15;
				}
				if(student.getKor() + point >= 50) {
					count++;
				}
			}
		}
		answer = String.valueOf(count);
		return answer;
	}
}
