package ch_07;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapEx01 {
	public static void main(String[] args) {
		HashMap<String, Integer> pens = new HashMap<>();
		
		pens.put("연필", 200);
		pens.put("펜", 800);
		pens.put("지우개", 500);
		pens.put("자", 300);
		
		Set<String> keys = pens.keySet();
		Iterator<String> it = keys.iterator();
		
		int sum = 0;
		while(it.hasNext()) {
			String key = it.next();
			int value = pens.get(key);
			System.out.print("(" + key + "," + value + ") ");
			sum += value;
		}
		System.out.println();
		System.out.println("=====================================");
		System.out.println("가격의 합: " + sum);
		
	}
}
