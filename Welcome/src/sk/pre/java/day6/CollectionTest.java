package sk.pre.java.day6;

import java.util.ArrayList;

public class CollectionTest {
	
	public void testArrayListOld() {
		ArrayList list = new ArrayList();
		
		list.add(new Integer(1));
		list.add(new String("2"));
		list.add(new Integer(3));
		
		System.out.println(list.size());
		
		Integer myInt = (Integer)list.get(0);
		//int myValue = myInt;
		int value = myInt.intValue();
		System.out.println(value);
		
		list.set(1, new Integer(2));
		
		for(int i=0;i<list.size();i++) {
			Integer myInt2 = (Integer)list.get(i);
			int value2 = myInt2.intValue();
			System.out.println(value2);
		}
		
		Integer removeObject = (Integer)list.remove(1);
		System.out.println("삭제 데이터 "+removeObject.intValue());
		System.out.println("삭제후 전체 조회");
		for(int i=0;i<list.size();i++) {
			Integer myInt2 = (Integer)list.get(i);
			int value2 = myInt2.intValue();
			System.out.println(value2);
		}
	}
	public void testArrayList() {
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(1); //1 //auto boxing
		//list.add(new String("2"));
		list.add(new Integer(20));
		list.add(3); // auto boxing
		
		System.out.println(list.size());
		
		int value = list.get(0); //auto unboxing 
		System.out.println(value);
		
		list.set(1, new Integer(2));
		
		for(int i=0;i<list.size();i++) {
			int value2 = list.get(i); //auto unboxing
			System.out.println(value2);
		}
		
		int value3 = list.remove(1); // auto unboxing
		System.out.println("삭제 데이터 "+value3);
		System.out.println("삭제후 전체 조회");
		for(int i=0;i<list.size();i++) {
			int value2 = list.get(i); //auto unboxing
			System.out.println(value2);
		}
	}
	
	public void testArrayListV2() {
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(new Integer(1));
		//list.add(new String("2"));
		list.add(new Integer(20));
		list.add(new Integer(3));
		
		System.out.println(list.size());
		
		Integer myInt = list.get(0);
		//int myValue = myInt;
		int value = myInt.intValue();
		System.out.println(value);
		
		list.set(1, new Integer(2));
		
		for(int i=0;i<list.size();i++) {
			Integer myInt2 = list.get(i);
			int value2 = myInt2.intValue();
			System.out.println(value2);
		}
		
		Integer removeObject = list.remove(1);
		System.out.println("삭제 데이터 "+removeObject.intValue());
		System.out.println("삭제후 전체 조회");
		for(int i=0;i<list.size();i++) {
			Integer myInt2 = list.get(i);
			int value2 = myInt2.intValue();
			System.out.println(value2);
		}
	}
}
