package sk.pre.java.day7;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MapTest {
	public void test1() {
		System.out.println("test");
		HashMap<String,Integer> map = new HashMap<String,Integer>();
		map.put("one", 1); //auto boxing
		map.put("two", 20);
		map.put("three", 3);
		
		System.out.println(map.size());
		int value = map.get("two"); //auto unboxing
		System.out.println("key two : "+value);
		map.put("two", 2);
		value = map.get("two"); //auto unboxing
		System.out.println("modify key two : "+value);
		value = map.remove("two");
		System.out.println("remove key two : "+value);
		System.out.println("size : "+map.size());
		//전체조회
		Set<String> keys = map.keySet();
		Iterator<String> iter = keys.iterator();
		while(iter.hasNext()) {
			String key = iter.next();
			System.out.println(key);
			int value2 = map.get(key);
			System.out.println(value2);
		}
				
	}
}
