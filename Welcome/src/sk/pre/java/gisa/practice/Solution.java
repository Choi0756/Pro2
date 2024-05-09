package sk.pre.java.gisa.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Solution {

	public String solveQuestion2(ArrayList<Student> list) {
		String result = null;
		
		for(int i=0;i<list.size();i++) {
			if(!list.get(i).getLocCode().equals("B")) {
				list.remove(i);
				i--;  //i = i - 1;
			}
		}
		System.out.println(list.size());
		//최대값 구하기 로직을 이용해서
		int max = list.get(0).getQuestion2();
		for(int i=1;i<list.size();i++) {
			if(max<list.get(i).getQuestion2()) {
				max = list.get(i).getQuestion2();
			}
		}
		result = max+"";//String.valueOf(max)
		return result;
	}
	
	public String solveQuestion1(ArrayList<Student> list) {
		String answer = null;
		for(int i=0;i<list.size();i++) {
			if(!list.get(i).getLocCode().equals("B")) {
				list.remove(i);
				i--;
			}
		} // 특정 조건에 맞는 학생들을 찾고 정렬하여 결과를 출력
		System.out.println(list.size());
		
		////////// 정렬로직 직접 작성 ////////////////////
		// list를 직접정렬하는 로직 작성하시오.
		
		
		////////////////////////////////////////////
		////////////////// 해석 //////////////////////
		//Collections.sort(list, new GisaComparator2());
//		Collections.sort(list, new Comparator<Student>() {
//
//			@Override
//			public int compare(Student o1, Student o2) {
//				// TODO Auto-generated method stub
//				int result = (o2.getKor()+o2.getEng())-(o1.getKor()+o1.getEng());
//				if(result==0) {
//					//result = o1.getStdNo()-o2.getStdNo();
//					result = o1.getEmail().compareTo(o2.getEmail());
//				}
//				return result;
//			}
//		});
		// Email 오름차순으로 정렬하여 처음부터 10개 출력하시오
		Collections.sort(list,new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				// TODO Auto-generated method stub
				return o1.getEmail().compareTo(o2.getEmail());
			}
		});
		////////////////////////////////////////////
		this.printSolution(list, 10);
		answer = String.valueOf(list.get(4).getStdNo());
		return answer;
	}
	
	public void printSolution(ArrayList<Student> list, int max) {
		for(int i=0;i<max;i++) {
			System.out.println(list.get(i));
		}
	}
	
	class GisaComparator2 implements Comparator<Student> {

		@Override
		public int compare(Student o1, Student o2) {
			// TODO Auto-generated method stub
			int result = (o2.getKor()+o2.getEng())-(o1.getKor()+o1.getEng());
			if(result==0) {
				//result = o1.getStdNo()-o2.getStdNo();
				result = o1.getEmail().compareTo(o2.getEmail());
			}
			return result;
		}

	}
	
	
}
