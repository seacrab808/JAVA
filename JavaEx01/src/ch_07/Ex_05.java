package ch_07;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Ex_05 {
	public static void main(String[] args) {
		HashMap<String, Integer> nations = new HashMap<>();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("나라 이름과 인구를 5새 입력하세요.(예: Korea 5000)");
		
		for(int i = 0; i < 5; i++) {
			nations.put(sc.next(), sc.nextInt());
		}
		
		Set<String> keys = nations.keySet();
		Iterator<String> it = keys.iterator();
		
		int max = 0;
		String maxCon = "";
		for(int i = 0; i < 5; i ++) {
			String key = it.next();
			int value = nations.get(key);
			if(value > max) {
				max = value;
				maxCon = key;
			}
		}
		
		
		
		System.out.println("제일 인구가 많은 나라는: (" + maxCon + "," + max + ")");
	}
}
