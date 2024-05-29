package ch_07;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListEx {
	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < 4; i++) {
			System.out.print("이름을 입력하세요>>");
			String s = sc.next();
			a.add(s);
		}
		for(int i = 0; i < a.size(); i++) {
			String name = a.get(i);
			System.out.print(name + " ");
		}
		int max = 0;
		for(int i = 0; i < a.size(); i++) {
			if(a.get(max).length() < a.get(i).length())
				max = i;
		}
		System.out.println("\n가장 긴 이름은: " + a.get(max));
	}
}
