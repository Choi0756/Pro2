package basic.lesson.gisa;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Solution {
	
	public String solveQuestion2(ArrayList<Student> list) {
		String answer = null;
		// 지역코드가 B인 자료에 대해서 ( 국어점수 + 영어점수 ) 중 가장 큰 값 구하기.
		// max 알고리즘
		int max = 0;

		for(Student st : list ) {
			if(st.getLocCode().equals("B")) {
				if(max<st.getKor()+st.getEng()) {
					max = st.getKor()+st.getEng();
				}
			}
		}
		
		// 기본 문법 ( 변수, 제어문)
		// 객체의 기본 사용법
		System.out.println("문제풀이");
		answer = String.valueOf(max);
		return answer;
	}
	
	public String solveQuestion3(ArrayList<Student> data) {
		// TODO Auto-generated method stub
		int sum = 0;
		int count = 0;
		for(Student student : data) {
			int point = 0;
			if(student.getEng() + student.getMath() >= 120) {
				if(student.getAccCode().equals("A")) {
					point = 5;
				} else if (student.getAccCode().equals("B")) {
					point = 15;
				} else if (student.getAccCode().equals("C")) {
					point = 20;
				}
				count++;
				sum = sum + student.getTotal() + point;
			}
		}
		// System.out.print(count); 316 명
		return String.valueOf(sum);
	} // 합계 로직	

	public String solveQuestion4(ArrayList<Student> data) {
		// TODO Auto-generated method stub
		String answer = null;
		int count = 0;
		for(Student student : data) {
			int point = 0;
			if(student.getAccCode().equals("A") || student.getAccCode().equals("B")) {
				if(student.getLocCode().equals("A")) {
					point = 5;
				}
				else if(student.getLocCode().equals("B")) {
					point = 10;
				}else {
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

	public String solveQuestion1(ArrayList<Student> data) {
		// TODO Auto-generated method stub
		String answer = null;
		// 지역 코드가 B인 자료를 뽑는다.
		// 그 자료들중 국어점수 + 영어점수만 뽑아서 내림차순으로 나열한다.
		// 그리고 내림차순 정렬 로직을 넣는다.
		ArrayList<Student> quiz4 = new ArrayList<Student>();
		for(Student student : data) {
			if(student.getLocCode().equals("B")) {
				quiz4.add(student);
			}
		}
		// 정렬 로직
		Collections.sort(quiz4,new GisaComparator()); // ( 정렬 대상 , 정렬 알고리즘을 가진 클래스가 와야함 || 객체)
		int stdNo = quiz4.get(4).getStdNo();
		answer = String.valueOf(stdNo);
		this.printQuiz(quiz4, 0, 5);
		return answer;
	}

	
	// 문제 1번을 풀기위해서 메소드를 생성
	// return으로 반환.
	// 1000개가 들어있는 그 정보를 담아야함으로 매개변수 ArrayList<Student> list 대입.
	
	public void printQuiz(ArrayList<Student> quiz,int start, int end) {
		for(int i = start; i <end; i ++) {
			System.out.println(quiz.get(i));
		}
	} // quiz4가 정렬이 되어있는지 보기위한 수단.
	
	
}
