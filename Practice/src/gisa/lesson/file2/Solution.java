package gisa.lesson.file2;

import java.util.ArrayList;
import java.util.Collections;

public class Solution {
	
	public String solveQuestion1(ArrayList<Student> list) {
		String answer = null;
				// 지역 코드가 B인 자료를 뽑는다.
				// 그 자료들중 국어점수 + 영어점수만 뽑아서 내림차순으로 나열한다.
				// 그리고 내림차순 정렬 로직을 넣는다.
		ArrayList<Student> quiz4 = new ArrayList<Student>();
		for(Student st : list) {
			if(st.getLocCode().equals("B")) {
				quiz4.add(st);
			}
		}
		
		Collections.sort(quiz4, new GisaComparator());
		
		answer = String.valueOf(quiz4.get(4).getStdNo());
		
		return answer;
	}
	
	public String solveQuestion2(ArrayList<Student> list) {
		String answer = null;
		int max = 0;
		for(Student st : list) {
			if(st.getLocCode().equals("B")) {
				if(max < st.getKor() + st.getEng()){
					max = st.getKor() + st.getEng();
				}
			}
		}
		answer = String.valueOf(max);
		
		return answer;
	}
	
	public String solveQuestion3(ArrayList<Student> list) {
		String answer = null;
		int sum = 0;
		for(Student st : list) {
			int point = 0;
			if(st.getEng() + st.getMath() >= 120) {
				if(st.getAccCode().equals("A")) {
					point = 5;
				} else if (st.getAccCode().equals("B")) {
					point = 10;
				} else if (st.getAccCode().equals("C")) {
					point = 15;
				}
				sum = sum + st.getTotal() + point;
			}
		}
		answer = String.valueOf(sum);
		return answer;
	}
	
	public String solveQuestion4(ArrayList<Student> list) {
		String answer = null;
		int count = 0;
		for(Student st : list) {
			int point = 0;
			if(st.getAccCode().equals("A") || st.getAccCode().equals("B")) {
				if(st.getLocCode().equals("A")) {
					point = 5;
				} else if (st.getLocCode().equals("B")) {
					point = 10;
				} else if (st.getLocCode().equals("C")) {
					point = 15;
				}
				
				if (st.getKor() + point >= 50) {
					count++;
				}
			}
		}
		answer = String.valueOf(count);
		return answer;
	}
	
}
