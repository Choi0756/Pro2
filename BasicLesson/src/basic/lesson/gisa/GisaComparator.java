package basic.lesson.gisa;

import java.util.Comparator;

public class GisaComparator implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		int result = 0;
		
		result = (o2.getEng() + o2.getKor()) - (o1.getEng() + o1.getKor());
		// 혹시 같은 경우
		if (result == 0) {
			result = o1.getStdNo() - o2.getStdNo(); // 오름차순
		}
		
		
		return result;
	}

}
