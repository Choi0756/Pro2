package sk.pre.java.day7;

//시간관련 테스트도 함.
public class MapMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MapMain mm = new MapMain();
		//mm.test();
		//mm.testCal();
		mm.testDateTime();
	}
	public void testDateTime() {
		TestCalendar tc = new TestCalendar();
		//tc.test3();
		String full = tc.getDateTimeInfo(DateTimeInfo.FULL_DATE_TIME);
		String date = tc.getDateTimeInfo(DateTimeInfo.DATE_ONLY);
		String time = tc.getDateTimeInfo(DateTimeInfo.TIME_ONLY);
		System.out.println(full+"\n"+date+"\n"+time);
	}
	public void testCal() {
		TestCalendar cal = new TestCalendar();
		cal.test2();
	}
	public void test() {
		MapTest mt = new MapTest();
		mt.test1();
	}

}
