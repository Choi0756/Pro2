package sk.pre.java.gisa;

import java.util.ArrayList;
import java.util.Collections;

public class Solution {

	public String solveQuestion1(ArrayList<Student> list) {
		String answer = null;
		for(int i=0;i<list.size();i++) {
			if(!list.get(i).getLocCode().equals("B")) {
				list.remove(i);
				i--;
			}
		}
		System.out.println(list.size());
		Collections.sort(list, new GisaComparator());
		//this.printSolution(list, 30);
		answer = String.valueOf(list.get(4).getStdNo());
		return answer;
	}
	
	public void printSolution(ArrayList<Student> list, int max) {
		for(int i=0;i<max;i++) {
			System.out.println(list.get(i));
		}
	}
}
