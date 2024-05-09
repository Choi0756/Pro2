package gisa.lesson.file2;

import java.util.Comparator;

public class GisaComparator implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		int result = 0;
		
		result = (o2.getKor() + o2.getEng()) - (o2.getKor() + o2.getEng());
		
		if(result == 0) {
			result = o1.getStdNo() - o2.getStdNo();
		}
		
		return result;
	}

}
