package sk.pre.java.gisa.practice;

import java.util.Comparator;

public class GisaComparator implements Comparator<Student> { // 학생을 비교하기 위한 인터페이스.
	// Comparator 를 오버라이딩 해서 상속 받는다.

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
