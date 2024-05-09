package gisa.basic.lesson.db;

import java.util.ArrayList;
import java.util.Collections;

public class Solution {
	public String solveQusetion1(ArrayList<Student> list) {
		String answer = null;
		ArrayList<Student> list2 = new ArrayList<Student>();
		for(Student st : list) {
			if(st.getLocCode().equals("B")) {
				list2.add(st);
			}
		}
		Collections.sort(list2,new GisaComparator());
		int stdNo = list2.get(4).getStdNo();
		answer = String.valueOf(stdNo);
		return answer;
	}
	
	public String solveQusetion2(ArrayList<Student> list) {
		String answer = null;
		int max = 0;
		for(Student st : list) {
			if(st.getLocCode().equals("B")) {
				if(max < st.getKor() + st.getEng()) {
					max = st.getKor() + st.getEng();
				}
			}
		}
		answer = String.valueOf(max);
		return answer;
	}
	
	public String solveQusetion3(ArrayList<Student> list) {
		String answer = null;
		int sum = 0;
		for(Student st : list) {
			int point = 0;
			if(st.getEng() + st.getMath() >= 120) {
				if(st.getAccCode().equals("A")) {
					point = 5;
				} else if(st.getAccCode().equals("B")) {
					point = 15;
				} else {
					point = 20;
				}
				sum = sum + st.getTotal() + point;
			}
		}
		answer = String.valueOf(sum);
		return answer;
	}
	
	public String solveQusetion4(ArrayList<Student> list) {
		String answer = null;
		int count = 0;
		for(Student st : list) {
			int point = 0;
			if(st.getAccCode().equals("A") || st.getAccCode().equals("B")) {
				if(st.getLocCode().equals("A")) {
					point = 5;
				} else if(st.getLocCode().equals("B")){
					point = 10;
				} else {
					point = 15;
				}
				
				if(st.getKor() + point >= 50) {
					count++;
				}
			}
		}
		answer = String.valueOf(count);
		return answer;
	}
}
